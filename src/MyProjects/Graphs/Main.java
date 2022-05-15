package MyProjects.Graphs;

import MyProjects.Graphs.BFS.BFS;
import MyProjects.Graphs.DFS.DFS;
import MyProjects.Graphs.Graph.Graph;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String args[]) {
        System.out.println("------------MyProjects.Graphs------------------");
        System.out.println("BFS Iterative method");
        int startNode = 0;
        Graph g = new Graph();
        g.setData(8);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);
        g.addEdge(2, 5);
        g.addEdge(3, 6);
        g.addEdge(6, 7);

        new BFS().BFS(startNode, g.getV(), g.getAdj());

        //Recursive bfs
        System.out.println("");
        System.out.println("BFS Recursive method");
        Queue<Integer> q = new LinkedList<Integer>();
        boolean visited[] = new boolean[g.getV()];
        visited[startNode] = true;
        q.add(startNode);
        new BFS().RecursiveBFS(q, g.getAdj(), visited);

        System.out.println("");
        System.out.println("DFS Recursive method");
        boolean visitedDFS[] = new boolean[g.getV()];
        visitedDFS[startNode] = true;
        new DFS().dFS(startNode, visitedDFS, g.getAdj());
    }
}
