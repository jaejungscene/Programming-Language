package test;

import java.util.*;
import java.util.stream.IntStream;

public class test {
    public static void main(String[] args) {
        Queue<Integer> arrInt = new LinkedList<>();
        Stack<int[]> arrIntarr = new Stack<>();

        arrInt.add(12);
        Integer i = arrInt.peek();
        i++;
        System.out.println(arrInt);
        System.out.println(i);

        arrIntarr.push(new int[]{1,4});
        int[] a = arrIntarr.peek();
        a[0] = 74;
        arrIntarr.stream().forEach((x)->{System.out.println(Arrays.toString(x));});
        System.out.println(Arrays.toString(a));

        StringBuilder answer = new StringBuilder();
        answer.append("asdf");
        answer.append("zxcv");
        System.out.println(answer);

        String s = "3132";
        System.out.println(s.compareTo("31"));
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

