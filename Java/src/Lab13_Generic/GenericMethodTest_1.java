package Lab13_Generic;
// GenericMethodTest.java
// Overloading generic methods.

public class GenericMethodTest_1 
{
    public static void main(String[] args) 
    {
        // create arrays of Integer, Double and Character
        Integer[] integerArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
        Character[] characterArray = {'H', 'E', 'L', 'L', 'O'};

        test("integerArray", integerArray);
        test("doubleArray", doubleArray);
        test("characterArray", characterArray);
    } 

    // generic original printArray method
    public static <T> void printArray(T[] inputArray)// fill the blank spaces
    {
        //write code to displayinputarray elements 
        for(T element: inputArray){
            System.out.print(element+" ");
        }
        System.out.println();
    } 

    // overload generic method printArray
    public static <T> int printArray(T[] inputArray, int lowSubscript, int highSubscript)
    {
        // check if subscript is negative or out of range
        if (lowSubscript < 0 || highSubscript >= inputArray.length)
            throw new InvalidSubscriptException();   // you have to write code that throws the given exception
 
        int count = 0;

        // display array
        for (int i = lowSubscript; i <= highSubscript; i++) 
        {
            count++;
            System.out.printf("%s ", inputArray[i]);
        } // end for

        System.out.println();
        return count;  // number or elements output
    } 

   // generic method that tests both printArray methods
    public static <T> void test(String name, T[] array)// fill the blank spaces 
    {
        // print array
        try
        {
            int elements = 0; // store value returned by printArray

            // display array using original printArray method
            System.out.println("\n\nUsing original printArray method");
            printArray(array); // print array

            // display intAarray using ovwerloded  printArray method
            System.out.printf("Array %s contains:\n", name);
            elements = printArray(array, 0, array.length - 1);
            System.out.printf("%d elements were output\n", elements);

            // display elements 1-3 of array
            System.out.printf("Array %s from positions 1 to 3 is:\n", name);
            elements = printArray(array, 1, 3);
            System.out.printf("%d elements were output\n", elements);

            // try to print an invalid element
            System.out.printf("Array %s output with invalid subscripts:\n", name);
            elements = printArray(array, -1, 10);
        } 
        catch(InvalidSubscriptException invalidSubscriptException) // fill the blank space 
        {
           invalidSubscriptException.printStackTrace();
        } 
    } 
} // end class GenericMethodTest

//Indicates an invalid subscript.
class InvalidSubscriptException extends RuntimeException
{
    // no-argument constructor
    public InvalidSubscriptException()
    {
        this("Invalid subscript.");
    } 

// one-argument constructor
    public InvalidSubscriptException(String message)
    {
        super(message);
    } 

// two-argument constructor
    public InvalidSubscriptException(String message, Throwable cause)
    {
        super(message, cause);
    } 
} // end class EmptyStackException

