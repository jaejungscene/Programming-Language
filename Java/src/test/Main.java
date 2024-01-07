package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public int solution(int N, int[] T, int[] P){
        int opt[] = new int[N+2];
        for(int i=N; i>0; i--){
            if(i+T[i-1] > N+1)
                opt[i] = opt[i+1];
            else
                opt[i] = Math.max(P[i-1] + opt[i+T[i-1]],  opt[i+1]);
        }
        return opt[1];
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st;
        int[] T = new int[N];
        int[] P = new int[N];
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine(), " ");
            T[i] = Integer.parseInt(st.nextToken());
            P[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(new Main().solution(N, T, P));
    }
}