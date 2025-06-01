package Zcodingtest;

import java.util.*;
class Solution7 {
    public int solution(String begin, String target, String[] words) {
        // bfs로 최단 거리 구하기
        // 시작점 예약 ("hit")
        Queue<Word> q = new ArrayDeque<>();
        HashSet<String> visited = new HashSet<>();
        q.offer(new Word(begin, 0));
        HashSet<Integer>[] graph = new HashSet[words.length];
        for(int i = 0; i < words.length; i++){
            graph[i] = new HashSet<>();
        }
        HashSet<Integer> integers = graph[1];
        for (Integer integer : integers) {

        }
        while(!q.isEmpty()){
            Word curr = q.poll();
            // if 현재 노드 == target: return count;
            if(curr.word== target) return curr.count + 1;
            
            // 다음 노드 방문
            for(String word :words){
                if(getDiffCount(curr.word,word) == 1){
                    if(!visited.contains(word)){
                        q.offer(new Word(word, curr.count + 1));
                        visited.add(word);
                    }
                }
            }
            
        }
        return -1;
    }
    
    static int getDiffCount(String word1, String word2){
        int cnt = 0;
        
        // 알파벳 다른 갯수 word1 != word2
        for(int i = 0; i < word1.length(); i++){
            if(word1.charAt(i) != word2.charAt(i)){
                cnt++;
            }
        }
        return cnt;
    }
    
    static class Word{
        String word;
        int count;
        Word(String word, int count){
            this.word = word;
            this.count = count;
            
        }
    }
}