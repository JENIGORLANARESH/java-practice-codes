package graphs;

import java.util.*;

public class AdjListGraph { // UNDIRECTED GRAPH
    private LinkedList<Integer>[] adj;
    private int V;
    private int E;

    @SuppressWarnings("unchecked")
    public AdjListGraph(int nodes) {
        this.adj = new LinkedList[nodes];
        this.V = nodes;
        this.E = 0;
        for (int i = 0; i < V; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public static void main(String[] args) {
        AdjListGraph alg = new AdjListGraph(6);
        alg.addEdge(0, 1);
        alg.addEdge(0, 3);
        alg.addEdge(2, 1);
        alg.addEdge(2, 3);
        alg.addEdge(2, 4);

        System.out.println(alg);
        alg.breadthFirstSearch(0);
        alg.depthFirstSearch(0);
        alg.dfs(0);
    }

    public void breadthFirstSearch(int s) { // Level Order Traversal
        boolean[] visited = new boolean[V]; // V = no.of vertices
        Queue<Integer> q = new LinkedList<>();
        visited[s] = true;
        q.offer(s);
        while (!q.isEmpty()) {
            int u = q.poll();
            System.out.print(u + " ");
            for (int v : adj[u]) {
                if (!visited[v]) {
                    visited[v] = true;
                    q.offer(v);
                }
            }
        }
        System.out.println();
    }

    public void depthFirstSearch(int s) { // Iterative approach
        boolean[] visited = new boolean[V];
        Stack<Integer> stack = new Stack<>();
        stack.push(s);
        while (!stack.isEmpty()) {
            int u = stack.pop();
            if (!visited[u]) {
                visited[u] = true;
                System.out.print(u + " ");
                for (int v : adj[u]) {
                    if (!visited[v]) {
                        stack.push(v);
                    }
                }
            }
        }
        System.out.println();
    }

    // Depth First Search RECURSIVE Approach
    public void dfs(int s) {
        boolean[] visited = new boolean[V];
        for (int v = 0; v < V; v++) {
            if (!visited[v]) {
                dfs(v, visited);
            }
        }
        System.out.println();
    }

    public void dfs(int v, boolean[] visited) {
        visited[v] = true;
        System.out.print(v + " ");
        for (int w : adj[v]) {
            if (!visited[w]) {
                dfs(w, visited);
            }
        }
    }

    public void addEdge(int u, int v) {
        adj[u].add(v);
        adj[v].add(u);
        E++;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(V + " vertices, " + E + " edges " + "\n");
        for (int i = 0; i < V; i++) {
            sb.append(i + " ");
            for (int w : adj[i]) {
                sb.append(w + " ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
