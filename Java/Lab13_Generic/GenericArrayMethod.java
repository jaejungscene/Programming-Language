package Lab13_Generic;
public class GenericArrayMethod
{        
  public static void main(String args[])
  {
	// create arrays of Integer, Double and Character
    Integer[] integerArray = {1, 2, 3, 4, 5, 6};
    Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
    Character[] characterArray = {'H', 'E', 'L', 'L', 'O'};

    System.out.print("Array integerArray before reverse\n");
    printArray(integerArray); 
    reverseArray(integerArray);
    System.out.print("Array integerArray after reverse\n");
    printArray(integerArray); 
    
    System.out.print("Array doubleArray before reverse\n");
    printArray(doubleArray);  
    reverseArray(doubleArray);
    System.out.print("Array doubleArray after reverse\n");
    printArray(doubleArray); 
    
    System.out.print("Array characterArray before reverse\n");
    printArray(characterArray);  
    reverseArray(characterArray);
    System.out.print("Array characterArray after reverse\n");
    printArray(characterArray); 

 } 

 //generic printArray method
  public static <T> void printArray(T[] inputArray) //fill the blank spacess 
  {
    // write code to display array elements
    for(T element : inputArray){
       System.out.print(element+" ");
    }
    System.out.println();
  }
  
//generic reveses array method 
  public static <T> void reverseArray(T[] array) // write the blank spaces 
  {
    //  write yourcode 
    T temp;
    for(int i=0; i<array.length/2; i++){
        temp = array[i];
        array[i] = array[array.length-1-i];
        array[array.length-1-i] = temp;
    }
  }
  
  
} // end class GenericMethodTest
	


