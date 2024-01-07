package Collection;

import java.util.Comparator;
// PriorityQueueTest.java
// priortyQueue  test program
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue_prac01 {
   public void HeapTest() {
      Queue<Integer> queue = new LinkedList<>();
      queue.add(1);
      queue.add(8);
      queue.add(8);
      queue.add(8);
      queue.add(8);
      queue.add(3);
      System.out.println("Normal Queue>> "+queue);

      PriorityQueue<Integer> minHeap = new PriorityQueue<>();
      minHeap.add(1);
      minHeap.add(8);
      minHeap.add(8);
      minHeap.add(8);
      minHeap.add(8);
      minHeap.add(3);
      System.out.println("Min Heap>> "+minHeap);

      PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
      System.out.println("Max Heap peek()>> "+maxHeap.peek());
      System.out.println("Max Heap poll()>> "+maxHeap.poll());
      maxHeap.add(8);
      maxHeap.add(1);
      maxHeap.add(2);
      maxHeap.add(1);
      maxHeap.add(1);
      maxHeap.add(3);
      System.out.println("Max Heap>> "+maxHeap);
      maxHeap.poll();
      System.out.println("Max Heap>> "+maxHeap);

      System.out.println(Comparator.reverseOrder());

   }
   public static void main(String[] args)
   {
      PriorityQueue_prac01 test = new PriorityQueue_prac01();
      test.HeapTest();

      /*
      PriorityQueue<String> queue = new PriorityQueue<>();
      queue.add("abcd");
      queue.add("1234");
      queue.add("23bc");
      queue.add("zzxx");
      queue.add("abxy");
      // Displaying the PriorityQueue
      System.out.println("Initial PriorityQueue >> " + queue);
      // return null if queue doesn't have any comparable
      System.out.println(queue.comparator());


      System.out.println("----------------------------------");


      queue = new PriorityQueue<String>(new CustomNaturalComparator());
      queue.add("abcd");
      queue.add("1234");
      queue.add("23bc");
      queue.add("zzxx");
      queue.add("abxy");
      // Displaying the PriorityQueue
      System.out.println("Initial PriorityQueue >> " + queue);
      // return null if queue doesn't have any comparable
      System.out.println(queue.comparator());


      System.out.println("----------------------------------");


      queue = new PriorityQueue<String>(new CustomDescComparator());
      queue.add("abcd");
      queue.add("1234");
      queue.add("23bc");
      queue.add("zzxx");
      queue.add("abxy");
      // Displaying the PriorityQueue
      System.out.println("Initial PriorityQueue >> " + queue);
      // return null if queue doesn't have any comparable
      System.out.println(queue.comparator());
      */
   }

   static class CustomNaturalComparator implements Comparator<String> {
      @Override
      public int compare(String o1, String o2) {
         return o1.charAt(0) < o2.charAt(0) ? -1 : 1;
      }
   }

   static class CustomDescComparator implements Comparator<String> {
      @Override
      public int compare(String o1, String o2) {
         return o1.charAt(0) < o2.charAt(0) ? 1 : -1;
      }
   }

}