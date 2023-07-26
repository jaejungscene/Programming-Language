package Collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_prac01 {
    public static void main(String[] args) {
        //Specify TreeSet
        TreeSet<Integer> set1 = new TreeSet<Integer>(Arrays.asList(1,2,3));//TreeSet생성
        TreeSet<Integer> set2 = new TreeSet<Integer>(set1);//set1의 모든 값을 가진 TreeSet생성

        set1.add(7);
        set1.add(4);
        set1.add(9);
        set1.add(6);
        set1.add(5);

        System.out.println(set1);
        System.out.println(set1.first());
        System.out.println(set1.last());        
        System.out.println(set1.higher(3));
        System.out.println(set1.lower(3));

        System.out.println("--------------------");

        Iterator<Integer> iter = set1.iterator();	// Iterator 사용
        while(iter.hasNext()) {//값이 있으면 true 없으면 false
            System.out.println(iter.next());
        }

        System.out.println("--------------------");

        System.out.println(set1.subSet(3, 6));
        System.out.println(set1.headSet(5));
        System.out.println(set1.tailSet(5));

        System.out.println("--------------------");

        System.out.println(set2);
        System.out.println(set2.size());
    }
}
