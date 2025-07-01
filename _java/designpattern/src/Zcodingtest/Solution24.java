package Zcodingtest;

import java.util.*;

/**
 * LeetCode 1514. Path with Maximum Probability
 */
class Solution24 {


    public static void main(String[] args) {
        Solution24 solution24 = new Solution24();
        int n = 3;
        int[][] edges = {{0, 1}, {1, 2}, {0, 2}};
        double[] succProb = {0.5, 0.5, 0.2};
        int start_node = 0;
        int end_node = 2;
        System.out.println(solution24.maxProbability(n, edges, succProb, start_node, end_node)); // Output: 0.25
    }
    static class Edge {
        int node;
        double prob;

        Edge(int node, double prob) {
            this.node = node;
            this.prob = prob;
        }
    }

    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {

        Map<Integer, List<Edge>> graph = new HashMap<>();
        double[] probability = new double[n];
        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            double w = succProb[i];
            graph.putIfAbsent(u, new ArrayList<>());
            graph.putIfAbsent(v, new ArrayList<>());
            graph.get(u).add(new Edge(v, w));
            graph.get(v).add(new Edge(u, w));
        }

        double[] dists = new double[n];
        Arrays.fill(dists, 0);

        Queue<Edge> pq = new PriorityQueue<>((a, b) -> Double.compare(b.prob, a.prob));
        pq.offer(new Edge(start_node, 1));
        dists[start_node] = 1;

        while (!pq.isEmpty()) {
            Edge curr = pq.poll();


            for (Edge next : graph.get(curr.node)) {
                double next_dist = dists[curr.node] * next.prob;
                if (next_dist > dists[next.node]) {
                    pq.offer(new Edge(next.node, next_dist));
                    dists[next.node] = next_dist;
                }

            }
        }
        System.out.println(Arrays.toString(dists));
        return dists[end_node];
    }
}