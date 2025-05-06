package NonLinearDS.Graph;

import java.util.*;

public class Graph {
    private List<Edge>[] edgeList;
    public Graph(int size) {
        edgeList = new List[size];
        for (int i = 0; i < size; i++) {
            edgeList[i] = new ArrayList<>();
        }
    }
    public void addEdge(Edge e) {
        edgeList[e.getSource()].add(e);
    }
    public void BFS() {
        int size=edgeList.length;
        List<Integer> queue = new ArrayList<>();
        boolean [] bfs = new boolean[size];
            queue.add(0);
            while (!queue.isEmpty()) {
                int n=queue.get(0);
                queue.remove(0);
                if (!bfs[n]) {
                    bfs[n]=true;
                    System.out.println(n);
                    for (int k = 0; k < edgeList[n].size(); k++) {
                        queue.add(edgeList[n].get(k).getDest());
                    }
                }
            }

    }
    public void BFS1(int vertex){
        boolean [] visited =new boolean[edgeList.length];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(vertex);
        while (!queue.isEmpty()) {
            int n = queue.remove();
            if (!visited[n]) {
                System.out.println(n);
                visited[n]=true;
                List<Edge> edges = edgeList[n];
                for (Edge e: edges) {
                    queue.add(e.getDest());
                }
            }
        }
    }
    public void DFS() {
        int size=edgeList.length;
        Stack<Integer> stack = new Stack<>();
        boolean [] dfs = new boolean[size];
        stack.push(0);
        while (!stack.isEmpty()) {
            int n=stack.pop();
            if (!dfs[n]) {
                dfs[n]=true;
                System.out.println(n);
                for (int k = 0; k < edgeList[n].size(); k++) {
                    stack.push(edgeList[n].get(k).getDest());
                }
            }
        }

    }
    public void prims(){
        boolean[] visited = new boolean[edgeList.length];

    }
}
