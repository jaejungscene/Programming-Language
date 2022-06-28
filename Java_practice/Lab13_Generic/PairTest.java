package Lab13_Generic;
import java.util.Scanner;

public class PairTest 
{
   public static void main(String[] args) 
   {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("First Field   Seconde Field");
	   Integer first = sc.nextInt();
	   String second = sc.next();
	   Pair pair = new Pair(first, second);
	   first = sc.nextInt();
	   second = sc.next();
	   
	   System.out.println("\n------------------\n");
	   System.out.printf("Original pair: (%d, %s)\n", pair.getFirst(), pair.getSecond());
      System.out.printf(pair.getFirst().getClass()+" "+pair.getSecond().getClass());
	   pair.setFirst(first);
	   pair.setSecond(second);
	   System.out.printf("Modified pair: (%d, %s)\n", pair.getFirst(), pair.getSecond());
      System.out.printf(pair.getFirst().getClass()+" "+pair.getSecond().getClass());
      
      sc.close();
   } 
} // end class PairTest

class Pair<F,S>
{
   private F first; // first element of a pair
   private S second; // second element of a pair

   // constructor
   public Pair(F firstElement, S secondElement)
   {
      setFirst(firstElement);
      setSecond(secondElement);
   }

   // get first
   public F getFirst()
   {
      return first;
   } 

   // get second
   public S getSecond()
   {
      return second;
   } 

   // set first
   public void setFirst(F firstElement)
   {
      first = firstElement;
   }

   // set second
   public void setSecond(S secondElement)
   {
      second = secondElement;
   } 
} // end class Pair


/**************************************************************************
 * (C) Copyright 1992-2015 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
