package Collection;

import java.util.Comparator;
// PriorityQueueTest.java
// priortyQueue  test program
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue_prac01 {
   public static void main(String[] args)
   {
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