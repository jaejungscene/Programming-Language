package test;

import java.math.BigInteger;
import java.util.*;

public class Test05 {
    public static void main(String[] args) {
        int x = 3;
        System.out.println(x>>1);
        System.out.println(x>>2);
        System.out.println(x>>3);
        StringBuilder[] sb = new StringBuilder[3];
        sb[0] = new StringBuilder("asdf");
        System.out.println((int)Math.pow(2,0));
        System.out.println(Math.pow(2,1));
        System.out.println(Math.pow(2,2));
        System.out.println(Math.pow(2,3));

        sb[0].insert(0, sb[0].charAt(sb[0].length()-1));
        sb[0].deleteCharAt(sb[0].length()-1);
        System.out.println(sb[0]);

//        System.out.println(-6/3);
//        List<Integer> list = new ArrayList<>();
//        list.add(0);
//        list.add(2);
//        list.add(1);
//        System.out.println(list);
//        list.sort((x, y) -> (x-y));
//        list = list.stream().sorted(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer a, Integer b){
//                return b-a;
//            }
//        }).toList();
//        System.out.println(list);


    }
}
