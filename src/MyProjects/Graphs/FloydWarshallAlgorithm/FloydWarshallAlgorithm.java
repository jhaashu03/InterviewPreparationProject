//https://www.geeksforgeeks.org/floyd-warshall-algorithm-dp-16/
//https://www.youtube.com/watch?v=oNI0rf2P9gE


package MyProjects.Graphs.FloydWarshallAlgorithm;

public class FloydWarshallAlgorithm {
    final static int INF = 9999;
    int V = 4;

    public static void main(String args[]) {
        /* Let us create the following weighted graph
           10
        (0)------->(3)
        |         /|\
        5 |          |
        |          | 1
        \|/         |
        (1)------->(2)
           3           */

        // logic
        //time complexity O(n3)
        /*for(int k=0;k<V;k++){
            for(int i=0;i<V;i++){
                for(int j=0;j<V;j++){
                        A[i][j]= MIN(A[i][j],A[i][k]+A[k][j]);
                }
            }
        }*/

        int graph[][] = {{0, 5, INF, 10},
                {INF, 0, 3, INF},
                {INF, INF, 0, 1},
                {INF, INF, INF, 0}
        };

        FloydWarshallAlgorithm fw = new FloydWarshallAlgorithm();
        fw.floydWarshallAlgo(graph);

    }

    public void floydWarshallAlgo(int graph[][]) {
        int dist[][] = new int[V][V];
        for (int i = 0; i < V; i++)
            for (int j = 0; j < V; j++)
                dist[i][j] = graph[i][j];

        for (int k = 0; k < V; k++) {
            for (int i = 0; i < V; i++) {
                for (int j = 0; j < V; j++) {
                    if (dist[i][k] + dist[k][j] < dist[i][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }
        print(dist);

    }

    private void print(int[][] dist) {
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                if (dist[i][j] == INF)
                    System.out.print("∞ ");
                else
                    System.out.print(dist[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
