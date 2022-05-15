package MyProjects.Graphs.Graph;

import java.util.LinkedList;

public class Graph {
    public int v;
    public LinkedList<Integer> adj[];

    public void setData(int data) {
        v = data;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i) {
            adj[i] = new LinkedList<Integer>();
        }
    }

    public void addEdge(int i, int j) {
        adj[i].add(j);
    }

    public int getV() {
        return v;
    }

    public LinkedList<Integer>[] getAdj() {
        return adj;
    }
}
