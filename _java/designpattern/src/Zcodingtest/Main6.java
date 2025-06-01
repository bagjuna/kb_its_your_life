package Zcodingtest;

import java.util.*;

public class Main6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean[] visited = new boolean[10000];
        String[] ans = new String[10000];

        for (int i = 0; i < N; i++) {
            int startWord  = sc.nextInt();
            int endWord = sc.nextInt();
            Arrays.fill(visited, false);
            Arrays.fill(ans,"");
            Queue<Integer> queue = new ArrayDeque<>();
            queue.add(startWord);

            while (!queue.isEmpty()) {
                int current = queue.poll();

                if (current == endWord) {
                    System.out.println(ans[current]);
                    break;
                }

                int D;
                if (current * 2 > 9999) {
                    D = current * 2 % 10000;

                } else {
                    D = current * 2;
                }

                if(!visited[D]) {
                    visited[D] = true;
                    queue.add(D);
                    ans[D] = ans[current] + "D";
                }

                int S = current;
                if (S == 0) {
                    S = 9999;
                } else {
                    S = current - 1;
                }

                if(!visited[S]) {
                    visited[S] = true;
                    queue.add(S);
                    ans[S] = ans[current] + "S";
                }


                int L = (current % 1000) * 10 + current / 1000;

                if(!visited[L]) {
                    visited[L] = true;
                    queue.add(L);
                    ans[L] = ans[current] + "L";
                }

                int R = (current % 10) * 1000 + current / 10;

                if(!visited[R]) {
                    visited[R] = true;
                    queue.add(R);
                    ans[R] = ans[current] + "R";
                }

            }
        }


    }


}
