package ch14.sec03.exam03;

import java.util.*;

class Solution {
    static int max = Integer.MIN_VALUE;
    static boolean[] visited;
    static int[] nodes;

    public int solution(int n, int[][] edge) {

        int answer = 0;
        ArrayList<Integer>[] graph = new ArrayList[n + 1];
        for (int i = 0; i < n + 1; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < edge.length; i++) {
            graph[edge[i][0]].add(edge[i][1]);
            graph[edge[i][1]].add(edge[i][0]);
        }
        int[] degree = new int[n + 1];
        Deque<Edge> queue = new ArrayDeque<>();
        visited = new boolean[n + 1];
        nodes = new int[n + 1];
        queue.add(new Edge(1, 0));
        visited[1] = true;
        while (!queue.isEmpty()) {
            Edge currentNode = queue.poll();
            if (max < currentNode.weight) {
                max = currentNode.weight;
                nodes[currentNode.node] = max;
                answer = 1;
            } else if (max == currentNode.weight)
                answer++;

            for (int temp : graph[currentNode.node]) {
                if (visited[temp]) continue;
                visited[temp] = true;
                queue.add(new Edge(temp, currentNode.weight + 1));
            }
        }


        return answer;
    }

    static class Edge {
        int node;
        int weight;

        Edge(int node, int weight) {
            this.node = node;
            this.weight = weight;
        }
    }


}