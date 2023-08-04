package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.stream.IntStream;

public class test {
    static public boolean primeNumCheck(int n){
        if(n==0 || n==1)	return false;
        for(int i=3; i<=(int)Math.sqrt(n); i+=2)
            if(n%i == 0)	return false;
        return true;
    }
    public static void main(String[] args) {
        System.out.println(primeNumCheck(2));
        System.out.println((int)Math.sqrt(3));
        System.out.println("-----------------");
        System.out.println("asdf".substring(0, 0));
        System.out.println("asdf".substring(1));
        System.out.println(Integer.valueOf("11")==11);
        System.out.println(Integer.parseInt("11")==11);
        HashSet<Integer> set = new HashSet<>();
        set.add(123);
        set.add(2);
        set.add(42);
        for(Integer i: set){
            System.out.println(i);
        }


        int[][] dungeons = {{90,20}, {80,10}, {75,30}};
        int k = 90;
        List<int[]> scores = new ArrayList<>(dungeons.length);
        
        for(int i=0; i<dungeons.length; i++){
            int[] temp = {
                (dungeons[i][0]-dungeons[i][1]),
                i,
                dungeons[i][1]
            };
            scores.add(temp);
        }
        
        scores.sort(new test.CustomComparator());
        for(int []p: scores){
            System.out.println(p[0] + " " + p[1]);
        }


        // List<int[]> arr = new ArrayList<>();
        // for(int i=0; i<input.length; i++){
        //     int[] elem = {input[i], i};
        //     arr.add(elem);
        // }
        // arr.sort(new Comparator<int []>() {
        //     public int compare(int[] a, int[] b) {
        //         return Integer.compare(a[0], b[0]);
        //     }
        // });
        // System.out.println("-----------");
        
        // System.out.println(arr);
        // System.out.println(arr.size());


        //&& dungeons[p[1]][1] > dungeons[scores.get(i+1)[1]][1]
        //&& p[0] == scores.get(i+1)[0]
    }

    static class CustomComparator implements Comparator<int[]>{
        @Override
        public int compare(int[] a, int[] b){
            if(a[0] < b[0]){
                return 1;
            }
            else if(a[0] > b[0]){
                return -1;
            }
            else{
                if(a[2] > b[2]){
                    return 1;
                }
                else if(a[2] < b[2]){
                    return -1;
                }
                return 0;
            }
        }
    }
}

