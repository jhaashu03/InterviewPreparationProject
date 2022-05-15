//https://www.geeksforgeeks.org/depth-first-search-or-dfs-for-a-graph/

package MyProjects.Graphs.DFS;

import java.util.Iterator;
import java.util.LinkedList;

public class DFS {
    public void dFS(int v, boolean visited[], LinkedList<Integer> adj[]) {
        visited[v] = true;
        System.out.print(v + " ");

        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n]) {
                dFS(n, visited, adj);
            }
        }
    }
}
