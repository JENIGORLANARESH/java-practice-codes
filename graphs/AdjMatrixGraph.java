package graphs;

public class AdjMatrixGraph {           // UNDIRECTED GRAPH
    private int V; // vertices
    private int E; // edges
    private int[][] adjMatrix;

    AdjMatrixGraph(int nodes) {
        this.V = nodes;
        this.E = 0;
        this.adjMatrix = new int[nodes][nodes];
    }

    public static void main(String[] args) {
        AdjMatrixGraph amg = new AdjMatrixGraph(5);
        amg.addEdge(1, 2);
        amg.addEdge(3, 4);
        amg.addEdge(4, 0);
        System.out.println(amg);
    }

    public void addEdge(int u, int v) {
        this.adjMatrix[u][v] = 1;
        this.adjMatrix[v][u] = 1; // for Undirected Graph only
        E++;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(V + " vertices, " + E + " edges " + "\n");
        for (int v = 0; v < V; v++) {
            sb.append(v + ": ");
            for (int w : adjMatrix[v]) {
                sb.append(w + " ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
