package Zcodingtest;

import java.util.*;

/**
 * 백준 2019 카카오 개발자 겨울 인턴십
 */
class Solution25 {

    static class Node {
        int v;
        int cost;

        Node(int v, int cost) {
            this.v = v;
            this.cost = cost;
        }
    }


    public int solution(int n, int s, int a, int b, int[][] fares) {
        int answer = 0;

        int[][] costs = new int[n + 1][n + 1];
        for (int fare[] : fares) {
            costs[fare[0]][fare[1]] = fare[2];
            costs[fare[1]][fare[0]] = fare[2];
        }
        int[][] distArray = new int[3][n + 1];

        for (int[] d : distArray) {
            Arrays.fill(d, Integer.MAX_VALUE);
        }

        Queue<Node> pq = new PriorityQueue<>((e1, e2) -> e1.cost - e2.cost);
        final int[] start = {s, a, b};

        for (int j = 0; j < 3; j++) {
            int[] d = distArray[j];
            pq.add(new Node(start[j], 0));

            d[start[j]] = 0;
            while (!pq.isEmpty()) {
                Node cur = pq.remove();

                for (int i = 1; i <= n; i++) {
                    if (costs[cur.v][i] == 0) continue;
                    if (d[i] > cur.cost + costs[cur.v][i]) {
                        d[i] = cur.cost + costs[cur.v][i];
                        pq.add(new Node(i, cur.cost + costs[cur.v][i]));

                    }
                }
            }

        }

        int minCost = Integer.MAX_VALUE;
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            for (int[] d : distArray) {
                sum += d[i];
            }
            minCost = Math.min(minCost, sum);
        }
        return minCost;
    }
}