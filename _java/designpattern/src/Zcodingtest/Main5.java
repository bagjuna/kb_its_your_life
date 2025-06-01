package Zcodingtest;


import java.util.*;

public class Main5 {
    static char[] startWord;
    static char[] endWord;
    static boolean[] visited = new boolean[10000];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            startWord = inputByArray(sc.nextInt());
            endWord = inputByArray(sc.nextInt());
            Queue<DSLR> queue = new ArrayDeque<>();
            queue.add(new DSLR(startWord.clone()));

            while (!queue.isEmpty()) {
                DSLR current = queue.poll();

                int value1 = Integer.parseInt(String.valueOf(current.arr));
                if (value1 * 2 > 9999) {
                    value1 = value1 * 2 % 10000;
                } else {
                    value1 = value1 * 2;
                }
                char[] newArr2 = inputByArray(value1);
                queue.add(new DSLR(current, newArr2, "D"));

                int value2 = Integer.parseInt(String.valueOf(current.arr));
                if (value2 == 0) {
                    value2 = 9999;
                } else {
                    value2 = value2 - 1;
                }

                char[] newArr = inputByArray(value2);

                queue.add(new DSLR(current, newArr, "S"));


                if (Arrays.equals(current.arr, endWord)) {
                    System.out.println(current.result.toString());
                    break;
                }

                newArr = new char[4];
                newArr[0] = current.arr[1];
                newArr[1] = current.arr[2];
                newArr[2] = current.arr[3];
                newArr[3] = current.arr[0];
                queue.add(new DSLR(current, newArr, "L"));

                newArr = new char[4];
                newArr[0] = current.arr[3];
                newArr[1] = current.arr[0];
                newArr[2] = current.arr[1];
                newArr[3] = current.arr[2];
                queue.add(new DSLR(current, newArr, "R"));


            }
        }


    }

    static char[] inputByArray(int num) {
        StringBuilder str = new StringBuilder(String.valueOf(num));
        while (str.length() < 4) {
            str.insert(0, "0");
        }
        char[] arr = str.toString().toCharArray();
        return arr;
    }

    static class DSLR {
        char[] arr;
        String result;

        public DSLR(char[] arr) {
            this.arr = arr;
            this.result = "";
        }

        public DSLR(DSLR dslr, char[] arr, String str) {
            this.arr = arr;
            this.result = dslr.result + str;
        }
    }

}
