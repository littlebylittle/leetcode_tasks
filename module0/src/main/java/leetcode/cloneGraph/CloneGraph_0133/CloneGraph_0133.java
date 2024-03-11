package leetcode.cloneGraph.CloneGraph_0133;

import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CloneGraph_0133 {
    private Map<Node/*original*/, /*new*/Node> visited = new IdentityHashMap<>();
    public Node cloneGraph(Node node) {
        if(node == null) {
            return null;
        }
        Node copy = copy(node);
        return copy;
    }

    private Node copy(Node original) {
        if(visited.containsKey(original) ) {
            return original;
        }
        Node newElement = new Node(original.val);
        visited.put(original, newElement);

        List<Node> copiedNeighboars = original.neighbors.stream()
                .map(el -> {
                    if(!visited.containsKey(el)) {
                        Node copySubNode = copy(el);
                        return copySubNode;
                    } else {
                        Node copySubNode = visited.get(el);
                        return copySubNode;
                    }
                }).collect(Collectors.toList());

        newElement.neighbors = copiedNeighboars;
        return newElement;
    }
}

class CloneGraph_0133_Leetcode{
    private void dfs(Node node , Node copy , Node[] visited){
        visited[copy.val] = copy;// store the current node at it's val index which will tell us that this node is now visited

//         now traverse for the adjacent nodes of root node
        for(Node n : node.neighbors){
//             check whether that node is visited or not
//              if it is not visited, there must be null
            if(visited[n.val] == null){
//                 so now if it not visited, create a new node
                Node newNode = new Node(n.val);
//                 add this node as the neighbor of the prev copied node
                copy.neighbors.add(newNode);
//                 make dfs call for this unvisited node to discover whether it's adjacent nodes are explored or not
                dfs(n , newNode , visited);
            }else{
//                 if that node is already visited, retrieve that node from visited array and add it as the adjacent node of prev copied node
//                 THIS IS THE POINT WHY WE USED NODE[] INSTEAD OF BOOLEAN[] ARRAY
                copy.neighbors.add(visited[n.val]);
            }
        }

    }
    public Node cloneGraph(Node node) {
        if(node == null) return null; // if the actual node is empty there is nothing to copy, so return null
        Node copy = new Node(node.val); // create a new node , with same value as the root node(given node)
        Node[] visited = new Node[101]; // in this question we will create an array of Node(not boolean) why ? , because i have to add all the adjacent nodes of particular vertex, whether it's visited or not, so in the Node[] initially null is stored, if that node is visited, we will store the respective node at the index, and can retrieve that easily.
        Arrays.fill(visited , null); // initially store null at all places
        dfs(node , copy , visited); // make a dfs call for traversing all the vertices of the root node
        return copy; // in the end return the copy node
    }
}
