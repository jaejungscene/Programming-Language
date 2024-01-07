package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test3 {
    static public int combResult(int n, int r){
        int result = 1;
        for(int i=n; i>n-r; i--)
            result *= i;
        for(int i=r; i>0; i--)
            result /= i;
        return result;
    }

    void printComb(int[] arr, boolean[] visited){
        int cnt = 0;
        List<Integer> result = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(visited[i] == true)
                result.add(arr[i]);
        }
        System.out.println(result);
    }

    static void backtrackComb(int[] arr, boolean[] visited, int start, int n, int r) {
        if(r == 0) {
//            printComb(arr, visited);
            return;
        }

        for(int i=start; i<n; i++) {
            visited[i] = true;
            backtrackComb(arr, visited, i + 1, n, r - 1);
            visited[i] = false;
        }
    }

    static void recursiveComb(int[] arr, boolean[] visited, int depth, int n, int r) {
        if (r == 0) {
//            printComb(arr, visited);
            return;
        }
        if (depth == n)
            return;
        visited[depth] = true;
        recursiveComb(arr, visited, depth + 1, n, r - 1);
        visited[depth] = false;
        recursiveComb(arr, visited, depth + 1, n, r);
    }

    public static void main(String[] args) {
        int N = 2000;
        int r = 3;
        int[] arr = new int[N];
        boolean[] visited = new boolean[N];
        for(int i=1; i<=N; i++) arr[i-1] = i;
        long start, end;
        start = System.currentTimeMillis();
        backtrackComb(arr, visited, 0, N, r);
        end = System.currentTimeMillis();
        System.out.println("----< " + (end-start) + " >----");

        start = System.currentTimeMillis();
        recursiveComb(arr, visited, 0, N, r);
        end = System.currentTimeMillis();
        System.out.println("----< " + (end-start) + " >----");



    }
}
