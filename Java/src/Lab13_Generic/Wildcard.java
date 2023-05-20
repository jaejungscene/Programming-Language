package Lab13_Generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Wildcard<T> {
    public static void main(String[] args) {
        Wildcard ob = new Wildcard();
        // List<String> list = Arrays.asList("Tony", "Box", "Jaejung");
        // Collection<String> list = Arrays.asList("Tony", "Box", "Jaejung");
        Collection<Integer> list = Arrays.asList(32, 1, 243, 5);
        System.out.println(ob.printAllElements(list));
        ob.printall(list);
        // System.out.println(list.get(0));
        
        Collection<Integer> c = new ArrayList<>();
        c.add(123);
        printCollection(c);
    }
    
    static void printCollection(Collection<? extends Number> c){
        for(Object e:c){
            System.out.println(e);
        }
    }
    public <T extends Comparable<? super T>> Boolean printAllElements(Collection<? extends T> col){
        System.out.println(col.getClass());
        for(Object e: col){
            System.out.println(e.getClass());
        }
        return col.isEmpty(); 
    }

    public <T> void printall(Collection<? extends T> col){
        for(Object e: col){
            System.out.println(e);
        }
    }
}