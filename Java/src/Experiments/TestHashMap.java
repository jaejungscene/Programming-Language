package Experiments;

import java.util.*;

public class TestHashMap {
    public static void main(String[] args) {
        String name = "jung";
        Map<Long, String> store = new HashMap<>();
        store.put(1L, "jae");
        store.put(4L, "jae");
        store.put(0L, "jung");
        store.put(3L, "lee");
        System.out.println(store);
        System.out.println(store.values().getClass());
        List<String> arr = new ArrayList<>(store.values());
        System.out.println(arr.getClass());
        for(String s : arr)
            System.out.println(s);

        Optional<String> temp = store.values().stream().filter(x->x.equals(name)).findAny();
        System.out.println(temp.getClass());
        System.out.println(temp);
        System.out.println("-------------");

        String s1 = "jae";
        String s2 = "jae";
        System.out.println(s1);
        System.out.println(s1.getClass());
        System.out.println(s1.equals(s2));
    }

}
