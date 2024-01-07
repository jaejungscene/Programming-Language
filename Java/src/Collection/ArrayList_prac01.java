package Collection;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.lang.reflect.Method;


public class ArrayList_prac01 {
    public void operation(){
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(523);
        list.add(-1);

        System.out.println(list);
        System.out.println("---------------------------");

        list.add(0, 52);

        System.out.println(list);
        System.out.println("---------------------------");

        list.add(2, 489);

        System.out.println(list);
        System.out.println("---------------------------");
    }

    public void sorting(){
        List<int[]> list = new ArrayList<>();
        list.add(new int[]{2,1});
        list.add(new int[]{1,2});
        list.add(new int[]{0,22});
        list.add(new int[]{2,0});
        list.add(new int[]{2,3});

        list.sort(new Comparator<int[]>(){
            @Override
            public int compare(int[]a, int []b){
                if(a[0] == b[0])
                    return a[1] - b[1];
                return b[0] - a[0];
            }
        });

        list.stream().forEach((x)->{System.out.print(Arrays.toString(x) + " ");});
    }

    public void sync(){
        // non synchronized
        ArrayList<String> l1 = new ArrayList<>();

        // Synchronized
        List<String> l = Collections.synchronizedList(l1);

        // Synchronize non-synchronized list l1.add
        synchronized(l){
            l1.add("asdf");
        }
    }

    public static void main(String[] args) {
        ArrayList_prac01 test = new ArrayList_prac01();
        test.operation();
        test.sorting();
        test.sync();
    }
}
