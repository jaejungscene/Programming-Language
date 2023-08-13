package Collection;

import java.util.Queue;
import java.util.LinkedList;

public class Queue_prac01 {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(42);
        Integer num = q.remove();
        System.out.println(q);
        System.out.println(num);

    }
}
