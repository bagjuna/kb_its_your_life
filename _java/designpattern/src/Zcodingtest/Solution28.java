package Zcodingtest;


import java.util.*;


class Solution28 {


    public static void main(String[] args) {
        Solution28 solution28 = new Solution28();
        int n = 6;
        int s = 4;
        int a = 6;
        int b = 2;
        int[][] fares = {
                {4, 1, 10},
                {3, 5, 24},
                {5, 6, 2},
                {3, 1, 41},
                {5, 1, 24},
                {4, 6, 50},
                {2, 4, 66},
                {2, 3, 22}
        };
        System.out.println(solution28.solution(n, s, a, b, fares));
    }

    static class Node {
        int to;
        int weight;

        Node(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }
    }

    static List<Node>[] graph;

    public int solution(int n, int s, int a, int b, int[][] fares) {
        graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) graph[i] = new ArrayList<>();

        for (int[] fare : fares) {
            int u = fare[0], v = fare[1], w = fare[2];
            graph[u].add(new Node(v, w));
            graph[v].add(new Node(u, w));
        }


        int[] fromS = dijkstra(n, s);
        int[] fromA = dijkstra(n, a);
        int[] fromB = dijkstra(n, b);


        System.out.println("fromS: " + Arrays.toString(fromS));
        System.out.println("fromA: " + Arrays.toString(fromA));
        System.out.println("fromB: " + Arrays.toString(fromB));
        int min = Integer.MAX_VALUE;

        for (int i = 1; i <= n; i++) {


            if (fromS[i] != Integer.MAX_VALUE
                    && fromA[i] != Integer.MAX_VALUE
                    && fromB[i] != Integer.MAX_VALUE)
                min = Math.min(min, fromS[i] + fromA[i] + fromB[i]);

        }
        return min;


    }

    static int[] dijkstra(int n, int start) {
        int[] dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[start] = 0;

        boolean[] visited = new boolean[n + 1];
        PriorityQueue<Node> pq = new PriorityQueue<>((e1, e2) -> e1.weight - e2.weight);
        pq.add(new Node(start, 0));

        while (!pq.isEmpty()) {
            Node cur = pq.poll();

            if (visited[cur.to]) continue;
            visited[cur.to] = true;

            for (Node next : graph[cur.to]) {
                if (dist[next.to] > dist[cur.to] + next.weight) {
                    dist[next.to] = dist[cur.to] + next.weight;
                    pq.add(new Node(next.to, dist[next.to]));
                }
            }

        }


        return dist;


    }


}

