package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ArrayList_prac01 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(ArrayList_prac01.class.getName());
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


        // non synchronized
        ArrayList<String> l1 = new ArrayList<>();

        // Synchronized
        List<String> l = Collections.synchronizedList(l1);
        
        // Synchronize non-synchronized list l1.add
        synchronized(l){
            l1.add("asdf");
        }
    }
}
