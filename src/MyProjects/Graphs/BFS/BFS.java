//https://www.geeksforgeeks.org/breadth-first-search-or-bfs-for-a-graph/

package MyProjects.Graphs.BFS;

import MyProjects.Graphs.Graph.Graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class BFS extends Graph {
    public void BFS(int value, int v, LinkedList<Integer>[] adj) {
        boolean visited[] = new boolean[v];
        visited[value] = true;

        Queue<Integer> q = new LinkedList<Integer>();
        q.add(value);
        while (!q.isEmpty()) {
            value = q.poll();

            System.out.print(value + " ");
            Iterator<Integer> i = adj[value].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    q.add(n);
                }
            }
        }
        System.out.println("");
    }

    //RecursiveBFS
    public void RecursiveBFS(Queue<Integer> q, LinkedList<Integer>[] adj, boolean visited[]) {
        if (q.isEmpty()) {
            return;
        }

        int value = q.poll();
        System.out.print(value + " ");
        Iterator<Integer> i = adj[value].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n]) {
                visited[n] = true;
                q.add(n);
            }
        }
        RecursiveBFS(q, adj, visited);
    }
}
