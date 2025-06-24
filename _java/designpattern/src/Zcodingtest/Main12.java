package Zcodingtest;

import java.util.*;

public class Main12 {
    static int[][][] tetromino = {
            // ㅣ ㅡ
            {{0,0}, {0,1}, {0,2}, {0,3}},
            {{0,0}, {1,0}, {2,0}, {3,0}},
            // O
            {{0,0}, {0,1}, {1,0}, {1,1}},
            // L, J, S, Z, T 등 회전 포함 전부 19개
            // L
            {{0,0}, {1,0}, {2,0}, {2,1}},
            {{0,0}, {0,1}, {0,2}, {1,0}},
            {{0,0}, {0,1}, {1,1}, {2,1}},
            {{1,0}, {1,1}, {1,2}, {0,2}},
            {{0,0}, {1,0}, {0,1}, {0,2}},
            {{0,0}, {1,0}, {2,0}, {0,1}},
            {{0,0}, {0,1}, {1,1}, {2,1}},
            {{0,0}, {0,1}, {0,2}, {1,2}},
            {{2,0}, {0,1}, {1,1}, {2,1}},
            {{0,0}, {1,0}, {1,1}, {1,2}},

            // S
            {{0,0}, {0,1}, {1,1}, {1,2}},
            {{1,0}, {0,1}, {1,1}, {0,2}},
            {{0,0}, {1,0}, {1,1}, {2,1}},
            {{1,0}, {1,1}, {0,1}, {0,2}},

            // T
            {{0,0}, {0,1}, {0,2}, {1,1}},
            {{0,1}, {1,0}, {1,1}, {2,1}},

            // T (다른 회전)
            {{0,1}, {1,0}, {1,1}, {1,2}},
            {{1,0}, {0,1}, {1,1}, {2,1}},

            // J
            {{0,0}, {1,0}, {2,0}, {1,1}},
            {{0,1}, {1,0}, {2,0}, {1,1}},
            {{0,0}, {0,1}, {1,1}, {2,1}},


            // Z
            {{0,0}, {0,1}, {1,1}, {1,2}},
            {{1,0}, {0,1}, {1,1}, {0,2}},
            {{0,0}, {1,0}, {1,1}, {2,1}},
            {{1,0}, {1,1}, {0,1}, {0,2}},



    };

    static int N, M;
    static int[][] map;
    static int max = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        map = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                checkAllShapes(i, j);
            }
        }

        System.out.println(max);
    }

    static void checkAllShapes(int x, int y) {

        for (int[][] shape : tetromino) {
            int sum = 0;
            boolean isValid = true;

            for (int[] block : shape) {
                int nx = x + block[0];
                int ny = y + block[1];

                if (nx < 0 || ny < 0 || nx >= N || ny >= M) {
                    isValid = false;
                    break;
                }

                sum += map[nx][ny];
            }

            if (isValid) {
                max = Math.max(max, sum);
            }
        }
    }
}