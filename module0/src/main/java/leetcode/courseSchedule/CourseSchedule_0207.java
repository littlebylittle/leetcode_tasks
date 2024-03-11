package leetcode.courseSchedule;

import java.util.*;

public class CourseSchedule_0207 {
    public boolean canFinish(final int numCourses, final int[][] prerequisites) {
        ArrayList<Integer>[] graph = new ArrayList[numCourses];
        int[] inputs = new int[numCourses]; //how many streams flow to these nodes

        for (int i = 0; i < numCourses; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < prerequisites.length; i++) {
            inputs[prerequisites[i][1]]++;
            graph[prerequisites[i][0]].add(prerequisites[i][1]);
        }

        final Queue<Integer> queue = new LinkedList<>();
        int count = 0;
        for (int i = 0; i < inputs.length; i++) {
            if (inputs[i] == 0) {
                queue.add(i);
                count++;
            }
        }

        while (queue.size() != 0) {
            int course = queue.poll();
            for (Integer connectedCourse : graph[course]) {
                inputs[connectedCourse]--;
                if (inputs[connectedCourse] == 0) {
                    queue.add(connectedCourse);
                    count++;
                }
            }
        }
        return (count == numCourses);
    }
}
