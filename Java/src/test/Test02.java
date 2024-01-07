package test;

import java.io.*;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Test02 {
    public static void main(String[] args) throws IOException {
        Runtime runtime = Runtime.getRuntime();

        // Calculate initial memory usage
        long totalMemory = runtime.totalMemory();
        long freeMemory = runtime.freeMemory();
        long usedMemory1 = totalMemory - freeMemory;

        System.out.println("Initial Total Memory: " + totalMemory + " bytes");
        System.out.println("Initial Free Memory:  " + freeMemory + " bytes");
        System.out.println("Initial Used Memory:  " + usedMemory1 + " bytes");

        // Run your code here
        double[][] darr = new double[1][1];
//        double[] darr = new double[100];


        // Calculate memory usage after running your code
        totalMemory = runtime.totalMemory();
        freeMemory = runtime.freeMemory();
        long usedMemory2 = totalMemory - freeMemory;

        System.out.println("----------------------");
        System.out.println("Final Total Memory:   " + totalMemory + " bytes");
        System.out.println("Final Free Memory:    " + freeMemory + " bytes");
        System.out.println("Final Used Memory:    " + usedMemory2 + " bytes");
        System.out.println("----------------------");
        System.out.println(usedMemory2 - usedMemory1);


//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        String token;
//        int N = Integer.parseInt(br.readLine());
//        int[] A = new int[N];
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        for(int i=0; i<A.length; i++)
//            A[i] = Integer.parseInt(st.nextToken());
//        int B, C;
//        st = new StringTokenizer(br.readLine());
//        B = Integer.parseInt(st.nextToken());
//        C = Integer.parseInt(st.nextToken());
//
//        int answer = N;
//        for(int i=0; i<A.length; i++){
//            if( (A[i]-B) > 0 )
//                answer += (A[i]-B) % C == 0 ? (A[i]-B)/C : ((A[i]-B)/C)+1;
//        }
//
//        bw.write(Integer.toString(answer)+"\n");
//        bw.flush();
    }
}
