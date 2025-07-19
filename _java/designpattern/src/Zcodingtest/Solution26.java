package Zcodingtest;

import java.util.*;


/**
 *
 */
class Solution26 {


    public static void main(String[] args) {
        Solution26 solution26 = new Solution26();
        int n = 6;
        int s = 4;
        int a = 6;
        int b = 2;
        int[][] fares = {
                {4, 1, 10}, {3, 5, 24}, {5, 6, 2}, {3, 1, 41},
                {5, 1, 24}, {4, 6, 50}, {2, 4, 66}, {2, 3, 22}, {1, 6, 25}
        };
        System.out.println(solution26.solution(n, s, a, b, fares));
    }
    static class Node {
        int to;
        int cost;

        Node(int to, int cost) {
            this.to = to;
            this.cost = cost;
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
    
        int min = Integer.MAX_VALUE;

        for (int i = 1; i <= n; i++) {
            if (fromS[i] != Integer.MAX_VALUE
                    && fromA[i] != Integer.MAX_VALUE
                    && fromB[i] != Integer.MAX_VALUE
            ) min = Math.min(min, fromS[i] + fromA[i] + fromB[i]);
        }
        
        return min;
        
    }
    
    static int[] dijkstra(int n, int start){
        int[] dist = new int[n+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[start] = 0;

        boolean[] viscited = new boolean[n+1];
        PriorityQueue<Node> pq = new PriorityQueue<>((o1,o2) -> o1.cost - o2.cost);
        pq.add(new Node(start,0));
        
        while(!pq.isEmpty()){
            Node curr = pq.poll();


            for(Node next: graph[curr.to]){
                if(dist[next.to] > dist[curr.to] + next.cost){
                    dist[next.to] = dist[curr.to] + next.cost;
                    pq.add(new Node(next.to, dist[next.to]));
                    
                }
            }
        }
         return dist;
    }
}