package test;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class Programmers01 {

    class Solution {
        public void searchSimilar(String s, String[] words, boolean[] visited, Queue<Integer> q){
            int cnt = 0;
            for(int i=0; i<words.length; i++){
                if(words[i].length() == s.length()){
                    for(int j=0; j<s.length(); j++){
                        if((s.charAt(j)-words[i].charAt(j))!=0){
                            cnt++;
                            if(cnt>1)	break;
                        }
                    }
                    if(cnt<=1){
                        q.offer(i);
                        visited[i] = true;
                    }
                    cnt = 0;
                }
            }
        }

        public int solution(String begin, String target, String[] words) {
            int answer = 0;
            Queue<Integer> q = new LinkedList<>();
            boolean[] visited = new boolean[words.length];
            int size, now = 0;

            for(String w: words){
                if(w.compareTo(target)==0){
                    now = 1;
                    break;
                }
            }
            if(now==0)	return 0;


            searchSimilar(begin, words, visited, q);
            while(!q.isEmpty()){
                size = q.size();
                answer++;
                for(int i=0; i<size; i++){
                    now = q.poll();
                    if(words[now].compareTo(target) == 0)
                        return answer;
                    searchSimilar(words[now], words, visited, q);
                }
            }
            return 0;
        }
    }

    Solution solution = new Solution();

    public static void main(String[] args) {
        int[][] maps = {
                {1,0,1,1,1},
                {1,0,1,0,1},
                {1,0,1,1,1},
                {1,1,1,0,1},
                {0,0,0,0,1}
        };

        Programmers01 programmers = new Programmers01();
//        System.out.println("answer> "+ programmers.solution.solution(maps));
    }
}
