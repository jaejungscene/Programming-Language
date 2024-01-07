package Collection;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.LinkedList;

public class Queue_prac01 {

    public static long randomRun(Queue<Integer> q, int[] randomArr){
        long start, end;
        if(q instanceof LinkedList<Integer>)
            System.out.println("<<LinkedList>>");
        else if(q instanceof ArrayDeque<Integer>)
            System.out.println("<<ArrayDeque>>");

        start = System.currentTimeMillis();

        for(int i=0; i<randomArr.length; i++){
            if(randomArr[i] == 1)
                q.offer(1);
            else if(randomArr[i] == 2)
                q.poll();
        }

        end = System.currentTimeMillis();
        System.out.println("Elapsed Time: "+(end-start));
        return end-start;
    }

    public static void LinkedList_ArrayDeque_Simulation(){
        int iter = 50000000;
        int[] randomArr = new int[iter];
        int max = 2;
        int min = 1;
        for(int i=0; i<iter; i++) {
            randomArr[i] = (int) (Math.random() * (max - min + 1) + min);
        }

        System.out.println("============ LinkedList vs ArrayDeque ============");

        Queue<Integer> linkedList = new LinkedList<>();
        randomRun(linkedList, randomArr);
        System.out.println("Queue size: "+linkedList.size());

        System.out.println("-----------------------");

        Queue<Integer> arrayDeque = new ArrayDeque<>();
        randomRun(arrayDeque, randomArr);
        System.out.println("Queue size: "+arrayDeque.size());

        System.out.println("=================================================");

    }

    public static void main(String[] args) {
        LinkedList_ArrayDeque_Simulation();
    }
}
