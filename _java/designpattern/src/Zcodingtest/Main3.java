package Zcodingtest;

import java.util.*;

public class Main3 {
    static int minCnt = Integer.MAX_VALUE;

    public static void main(String[] args) {
        // 코드를 작성해주세요
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean[][] visited = new boolean[2001][2001];
        Queue<Emj> q = new ArrayDeque<>();
        q.add(new Emj(0, 0, 1));
        while (!q.isEmpty()) {
            Emj curr = q.poll();
            int cnt = curr.cnt;
            int clip = curr.clip;
            int value = curr.value;

            if (value == N && cnt < minCnt) minCnt = cnt;

            if (cnt < minCnt && !visited[clip][value]) {
                // 클립보드에 있는 모든 이모티콘을 화면에 붙여넣기 한다.
                if (value + clip < 2000)
                    q.add(new Emj(cnt + 1, clip, value + clip));

                // 화면에 있는 이모티콘을 모두 복사해서 클립보드에 저장한다.
                q.add(new Emj(cnt + 1, value, value));

                // 화면에 있는 이모티콘 중 하나를 삭제한다.
                if (value > 1) {
                    q.add(new Emj(cnt + 1, clip, value - 1));
                }
                visited[clip][value] = true;
            }
        }
        System.out.println(minCnt);
    }

    static class Emj {
        int cnt;
        int clip;
        int value;

        Emj(int a, int b, int c) {
            cnt = a;
            clip = b;
            value = c;
        }
    }
}
