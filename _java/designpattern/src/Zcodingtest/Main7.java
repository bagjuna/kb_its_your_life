package Zcodingtest;

import java.util.*;
import java.io.*;

public class Main7 {
    static int[][] map;
    static int start[];


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        map = new int[N][N];
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        st = new StringTokenizer(br.readLine());
        start = new int[]{Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};


    }

    static void bfs(){

    }
    static class Node{
        int[] start;
        int[] end;
        Node(int a, int b, int c, int d){
            start = new int[]{a, b};
            end = new int[]{c, d};

        }
    }
}