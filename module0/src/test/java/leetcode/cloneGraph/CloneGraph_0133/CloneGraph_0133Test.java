package leetcode.cloneGraph.CloneGraph_0133;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CloneGraph_0133Test {
    @Test
    void name() {
        //[[2,4],[1,3],[2,4],[1,3]]
        var n1 = new Node(1);
        var n2 = new Node(2);
        var n3 = new Node(3);
        var n4 = new Node(4);

        n1.neighbors = List.of(n2, n4);
        n2.neighbors = List.of(n1, n3);
        n3.neighbors = List.of(n2, n4);
        n4.neighbors = List.of(n1, n3);

        Node newHead = new CloneGraph_0133().cloneGraph(n1);
        assertEquals(1, newHead.val);
    }

    @Test
    void name_igorTest() {
        var n1 = new Node(1);
        var n2 = new Node(2);
        var n3 = new Node(3);
        var n4 = new Node(4);

        var n1_ = new Node(1);
        var n2_ = new Node(2);


        n1.neighbors = List.of(n2);
        n2.neighbors = List.of(n1, n3);
        n3.neighbors = List.of(n4);
        n4.neighbors = List.of(n1_, n2_);
        n1_.neighbors = List.of(n4);
        n2_.neighbors = List.of(n4);

        Node newHead = new CloneGraph_0133().cloneGraph(n1);
        assertEquals(1, newHead.val);
    }

    //CloneGraph_0133_Leetcode
    @Test
    void name_igorTest_leetcode() {
        var n1 = new Node(1);
        var n2 = new Node(2);
        var n3 = new Node(3);
        var n4 = new Node(4);

        var n1_ = new Node(1);
        var n2_ = new Node(2);


        n1.neighbors = List.of(n2);
        n2.neighbors = List.of(n1, n3);
        n3.neighbors = List.of(n4);
        n4.neighbors = List.of(n1_, n2_);
        n1_.neighbors = List.of(n4);
        n2_.neighbors = List.of(n4);

        Node newHead = new CloneGraph_0133_Leetcode().cloneGraph(n1);
        assertEquals(1, newHead.val);
    }
}