package test;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.*;

public class Test01 {

    public static String[] temp(){
        String s1 = "AT";
        String s2 = "CA";
        List<String> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        String[] arr = new String[1];
        return list.toArray(arr);
    }
    public static void main(String[] args) {
        String s1 = "AT";
        String s2 = "CA";
        List<String> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add("asdf");
        System.out.println(list);
        list.remove(list.size()-1);
        System.out.println(list);
        System.out.println(s2.compareTo(s1));
        List<String> tempList = null;
        System.out.println(tempList == null);
    }
}
