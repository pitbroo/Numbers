package Exc3;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.LinkedList;

@Slf4j
public class Exc3 {


    public static ArrayList<ArrayList<Integer>> fillAdjacentPoints(int v) {
        int a =v+1;
        ArrayList<ArrayList<Integer>> adjacentPoints = new ArrayList<ArrayList<Integer>>(a);
        for (int i = 0; i < a; i++) {
            adjacentPoints.add(new ArrayList<Integer>());
        }
        return adjacentPoints;
    }

    public static void addEdge(ArrayList<ArrayList<Integer>> adj, int i, int j)
    {
        adj.get(i).add(j);
        adj.get(j).add(i);
    }
    public static void addEdges(Graph graph, ArrayList<ArrayList<Integer>> adjacentPoints){
        graph.getEdges().forEach(edge -> {
            addEdge(adjacentPoints, edge.getA(), edge.getB());
        });
    }

    public static int shortestDistance( int source, int destination, int numberOfVartices, Graph graph)
    {
        log.warn("ZADANIE 3");
        log.info("Start: "+source);
        log.info("Stop: "+destination);
        graph.getEdges().forEach(edge -> {
            log.info("("+edge.getA()+", "+edge.getB()+")");
        });
        ArrayList<ArrayList<Integer>> adjacentPoints = fillAdjacentPoints(numberOfVartices);
        numberOfVartices++;
        addEdges(graph, adjacentPoints);
        int pred[] = new int[numberOfVartices];
        int dist[] = new int[numberOfVartices];

        if (BFS(adjacentPoints, source, destination, numberOfVartices, pred, dist) == false) {
            log.info("Given source and destination" +
                    "are not connected");
            return -1;
        }

        LinkedList<Integer> path = new LinkedList<Integer>();
        int crawl = destination;
        path.add(crawl);
        while (pred[crawl] != -1) {
            path.add(pred[crawl]);
            crawl = pred[crawl];
        }

        log.info("Najkrótsza ścieżka ma wartość: " + dist[destination]);
        log.info("Droga to : ");
        for (int i = path.size() - 1; i >= 0; i--) {
            if (i != path.size() - 1) {
                System.out.print("-> ");
            }
            System.out.print(path.get(i) + " ");
        }
        return dist[destination];
    }

    private static boolean BFS(ArrayList<ArrayList<Integer>> adj, int src,
                               int dest, int v, int pred[], int dist[])
    {
        LinkedList<Integer> queue = new LinkedList<Integer>();

        boolean visited[] = new boolean[v];

        for (int i = 0; i < v; i++) {
            visited[i] = false;
            dist[i] = Integer.MAX_VALUE;
            pred[i] = -1;
        }

        visited[src] = true;
        dist[src] = 0;
        queue.add(src);
        // BFS
        while (!queue.isEmpty()) {
            int u = queue.remove();
            for (int i = 0; i < adj.get(u).size(); i++) {
                if (visited[adj.get(u).get(i)] == false) {
                    visited[adj.get(u).get(i)] = true;
                    dist[adj.get(u).get(i)] = dist[u] + 1;
                    pred[adj.get(u).get(i)] = u;
                    queue.add(adj.get(u).get(i));

                    if (adj.get(u).get(i) == dest)
                        return true;
                }
            }
        }
        return false;
    }
}

