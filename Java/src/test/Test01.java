package test;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.*;

public class Test01 {
    static abstract class TEMP{
        void print() {
            System.out.println("asdfasdf");
        }
    }
    class puz{
        int size;
        List<int[]> points;
        puz(int size, List<int[]> points){
            this.size = size;
            this.points =points;
        }
    }

    public static void main(String[] args) {
        List<int[]> points = new ArrayList<>();
        points.add(new int[]{0,1});
        points.add(new int[]{1,2});
        points.add(new int[]{0,-1});
        points.sort(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0]!=o2[0])
                    return o1[0]-o2[0];
                else
                    return o1[1]-o2[1];
            }
        });
        for(int[] p: points)
            System.out.println(Arrays.toString(p));
        System.out.println("================");




        HashMap<String, Integer> map = new HashMap<>();
        map.put("asdf", 123);
        map.put("qwer", 32);
        Integer[] arr = map.values().toArray(new Integer[0]);
//        for(int i=0; i<phone_book.length; i++){
//            for(int j=0; j<phone_book.length; j++){
//                if(i!=j &&
//                        phone_book[i].length() <= phone_book[j].length() &&
//                        phone_book[i].equals(
//                                phone_book[j].substring(0, phone_book[i].length())
//                        )){
//                    return false;
//                }
//            }
//        }

//        if(phone_book[i].length() < range[0]){
//            range[0] = phone_book[i].length();
//            start = 0;
//            end = 0;
//        }
//        else if(phone_book[i].length() > range[1]){
//            range[1] = phone_book[i].length();
//            start = range[0];
//            end = range[1];
//        }
//        else{
//            start = range[0];
//            end = phone_book[i].length();
//        }
//
//        for(int j=start; j<end; j++){
//            if(set.contains(
//                    phone_book[i].substring(0,j)
//            ))
//                return false;
//        }
        String s = "asdfasdf";
        System.out.println(s.length());

        HashSet<Integer> hs = new HashSet<>();
        hs.add(12);
        hs.add(12);
        hs.add(42);
        hs.remove(12);
        System.out.println(hs.size());
        System.out.println(hs.contains(12));
        System.out.println(hs.contains(13));
//        HashMap<String, Integer> map = new HashMap<>();
        map.put("asdf", 12);
        System.out.println(map.containsKey("asdf"));
        System.out.println(map.get("asdf"));
        System.out.println(map.get("asd"));
        Integer temp = map.get("asd");
        System.out.println(temp);
    }
}
