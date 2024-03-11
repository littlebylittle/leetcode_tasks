package prep;

import org.slf4j.Logger;

public class LiveLockExample {
    private static final Logger log = org.slf4j.LoggerFactory.getLogger(LiveLockExample.class);
    public static final String name = "LIVELOCK!";

    static class Worker {
        private boolean workDone ;
        private final String name;

        public Worker(String name) {
            this.name = name;
            workDone = false;
        }

        public void doWork() {
            while (!workDone) {
                // Simulate doing work
                try {
                    log.info("sleep in worker: {}", name);
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        public void setWorkDone(boolean workDone) {
            this.workDone = workDone;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        final Worker worker1 = new Worker("wrk1");
        final Worker worker2 = new Worker("wrk2");
        System.out.println("sout: example");
        log. info("worker: {}, done?:{}", worker1.name, true);

        new Thread(() -> {
            while (true) {
                // Worker 1 tries to do work and then lets Worker 2 do work
                worker1.doWork();
                log.info("worker: {}, done?:{}", worker1.name, false);
                worker1.setWorkDone(false);

                try {
                    Thread.sleep(700); // Simulate some processing time
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                log.info("worker: {}, done?:{}", worker2.name, true);
                worker2.setWorkDone(true);
            }
        }, "worker1").start();
        Thread.sleep(900);

        new Thread(() -> {
            while (true) {
                // Worker 2 tries to do work and then lets Worker 1 do work
                worker2.doWork();
                log.info("worker: {}, done?:{}", worker2.name, false);
                worker2.setWorkDone(false);

                try {
                    Thread.sleep(500); // Simulate some processing time
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                log.info("worker: {}, done?:{}", worker1.name, true);
                worker1.setWorkDone(true);
            }
        }, "worker2").start();
        log.info("done");
    }
}
