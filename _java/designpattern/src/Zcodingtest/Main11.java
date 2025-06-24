package Zcodingtest;

import java.util.*;

public class Main11 {
    static HashSet<String> set;
    static char[] dic;
    static int length;
    static int size;
    static char[] aeiou = new char[]{'a', 'e', 'i', 'o', 'u'};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        set = new HashSet();

        length = sc.nextInt();
        size = sc.nextInt();
        dic = new char[size];

        for (int i = 0; i < size; i++) {
            dic[i] = sc.next().charAt(0);
        }

        abc(0, 0, new boolean[size], 0, "");

    }

    static void abc(int consonant, int vowel, boolean[] visited, int cur_length, String cur_word) {
        if (cur_length == length && !set.contains(cur_word)) {
            System.out.println(cur_word);
            set.add(cur_word);
            return;
        }

        if (cur_length > length) return;
        if (consonant < 1) {
            for (int i = 0; i < dic.length; i++) {
                if (dic[i] == 'a' || dic[i] == 'e' || dic[i] == 'i' || dic[i] == 'o' || dic[i] == 'u') {
                    if (visited[i]) continue;
                    visited[i] = true;
                    abc(consonant, vowel + 1, visited, cur_length + 1, cur_word + dic[i]);
                    visited[i] = false;
                }
            }
        }

       if (vowel < 2) {
            for (int i = 0; i < dic.length; i++) {
                if (!(dic[i] == 'a' || dic[i] == 'e' || dic[i] == 'i' || dic[i] == 'o' || dic[i] == 'u')) {
                    if (visited[i]) continue;
                    visited[i] = true;
                    abc(consonant, vowel + 1, visited, cur_length + 1, cur_word + dic[i]);
                    visited[i] = false;
                }
            }
        }


       for (int i = 0; i < dic.length; i++) {
                if (visited[i]) continue;
                visited[i] = true;
                abc(consonant + 1, vowel, visited, cur_length + 1, cur_word + dic[i]);
                visited[i] = false;
            }

    }
}