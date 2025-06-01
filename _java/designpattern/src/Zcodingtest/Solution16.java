package Zcodingtest;


import java.util.*;
class Solution16 {

    public static void main(String[] args) {
        Solution16 solution = new Solution16();
        // [0,0,1,1,1,0,1,0,1,0,1,1]
        int[] info = {0, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1};
        // [[0,1],[1,2],[1,4],[0,8],[8,7],[9,10],[9,11],[4,3],[6,5],[4,6],[8,9]]
        int[][] edges = {{0, 1}, {1, 2}, {1, 4}, {0, 8}, {8, 7}, {9, 10}, {9, 11}, {4, 3}, {6, 5}, {4, 6}, {8, 9}};
        System.out.println(solution.solution(info, edges)); // Expected output: 5
    }
    public int solution(int[] info, int[][] edges) {
        int answer = 0;
        int length = info.length;
        Node[] graph = new Node[length];
        for (int i = 0; i < length; i++) {
            graph[i] = new Node(info[i]);
        }


        for(int[] edge :edges){
            int start = edge[0];
            int end = edge[1];
            graph[start].addset(end);
        }


        return answer;


    }
    static class Node{
        int state;
        HashSet<Integer> set = new HashSet<>();
        Node(int state) {
            this.state = state;
        }
        void addset(int value){
            set.add(value);
        }
    }
}
