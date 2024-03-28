package networkDelayTime_0734;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class SolutionNetworkDelay {
    public static final int DEFAULT_UNREACHABLE = Integer.MAX_VALUE;
    public int networkDelayTime(int[][] times, int countAllLamps /*countAllLamps*/, int fromIndex/*fromIndex*/) {
        //init
        Node[] array = new Node[101];

        for (int i = 1; i <= countAllLamps; i++) {
            array[i] = new Node();
        }

        for (int[] el : times) {
            int from = el[0];
            int where = el[1];
            int length = el[2];

            Node fromN = array[from];
            Node whereN = array[where];

            fromN.vectors.add(new VectorN(fromN, whereN, length));
        }

        PriorityQueue<Node> pq = new PriorityQueue<>((o1, o2) -> o1.calculatedMinLength - o2.calculatedMinLength);
        Node beginNode = array[fromIndex];
        beginNode.calculatedMinLength = 0;
        pq.add(beginNode);
        while(!pq.isEmpty()) {
            Node current = pq.poll();
            for (VectorN currentVector : current.vectors) {
                Node whereN = currentVector.where;
                if(whereN.calculatedMinLength > currentVector.length + current.calculatedMinLength) {
                    whereN.calculatedMinLength = currentVector.length + current.calculatedMinLength;
                    pq.add(whereN); //?
                }
            }
        }

        //find max among all mins;
        int maxMin = beginNode.calculatedMinLength; //0
        for (Node node : array) {
            if(node == null) {
                continue;
            }
            if(node.calculatedMinLength > maxMin) {
                maxMin = node.calculatedMinLength;
            }
        }

        if(maxMin == DEFAULT_UNREACHABLE) {
            return -1;
        }

        return maxMin;
    }
    static class Node {
        int calculatedMinLength = DEFAULT_UNREACHABLE; //mutable
        final List<VectorN> vectors  = new ArrayList<>();
    }


    static class VectorN {
        final Node from; //not  null
        final Node where;
        final int length;

        VectorN(Node from, Node where, int length) {
            this.from = from;
            this.where = where;
            this.length = length;
        }
    }
}

/**
 * Node;
 * 	List<VectorN> vectors; //could beempty
 *
 *
 * VectorN
 * 	Node from; //not  null
 * 	Node where;
 * 	int length;
 *
 *
 /** *
 * //(1) ==== 2 =====> (2);  k = 1; n = 2;  exptected == 2;
 *
 *  1. Добавить начальную вершину в очередь с приоритетом.
 *  2. while( Извлечь из очереди с приоритетом ближайшую вершину (вначале это только
 * исходная вершина == K) - назовем ее текущей.
 * 3. Исследовать все соседние вершины, связанные с текущей.
 * Если они ранее
 * не были записаны (куда) (IF)
 *
 *  или если ребро предлагает новый кратчайший путь, то для
 * каждой из этих вершин записать расстояние до начальной вершины, указать
 * ребро, соответствующее этому расстоянию, и добавить новую вершину в очередь
 * с приоритетом. (add to PQ)
 * 4. Повторять шаги 2 и 3, пока очередь с приоритетом не опустеет.
 *  end while
 *
 * 5. Вернуть кратчайшее расстояние до каждой вершины от начальной и путь, позволяющий
 * добраться до каждой из них.
 *
 */