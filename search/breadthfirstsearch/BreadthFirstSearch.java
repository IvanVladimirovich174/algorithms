package search.breadthfirstsearch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class BreadthFirstSearch {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.listMaker();
    }
}

class Visited {
    static boolean[] vv;
}

class Graph {
    int n;
    int m;
    int k;
    private ArrayList<Integer>[] vertexes;
    private Visited[] vis;
    private int[][] dist;
    LinkedList<Integer> queue = new LinkedList<Integer>();

    Graph() {
        Scanner in = new Scanner(System.in);
        this.n = in.nextInt();
        this.m = in.nextInt();
        dist = new int[n][n];
        vertexes = new ArrayList[n];
        vis = new Visited[n];

        for (int i = 0; i < n; ++i) {
            vertexes[i] = new ArrayList<>();
        }

        vis[0].vv = new boolean[n];

        for (int i = 0; i < m; ++i) {
            int u = in.nextInt();
            int v = in.nextInt();
            vertexes[u].add(v);
            vertexes[v].add(u);
        }

        this.k = in.nextInt();

        for (int i = 0; i < k; ++i) {
            int a = in.nextInt();
            BFS(a, i);
        }
    }

    void BFS(int ctrl, int ind) {
        for (int i = 0; i < n; ++i) {
            vis[0].vv[i] = false;
            dist[ind][i] = -1;
        }
        dist[ind][ctrl] = 0;
        vis[ind].vv[ctrl] = true;
        queue.add(ctrl);
        while (!queue.isEmpty()) {
            int v = (int) queue.pop();
            for (int i = 0; i < vertexes[v].size(); i++) {
                if (!vis[0].vv[vertexes[v].get(i)]) {
                    vis[0].vv[vertexes[v].get(i)] = true;
                    queue.add(vertexes[v].get(i));
                    dist[ind][vertexes[v].get(i)] = dist[ind][v] + 1;
                }
            }
        }
    }

    public void listMaker() {
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < n; i++) {
            boolean flag = true;
            for (int j = 1; j < k; j++) {
                if (dist[j - 1][i] != dist[j][i] || dist[j][i] == -1) {
                    flag = false;
                    break;
                }
            }
            if (flag) str.append(i + " ");
        }

        if (str.length() == 0) {
            System.out.println("-");
        } else {
            System.out.println(str);
        }
    }
}