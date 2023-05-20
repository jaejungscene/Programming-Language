package Experiments;

public class swap {
  int x = 1;
  int y = 2;

  public void swap1(int x, int y){
    int temp = x;
    x = y;
    y = temp;
  }
  public void swap2(int[] x, int[] y){
    int[] temp = x;
    x = y;
    y = temp;
  }
  public void swap3(int[] x, int[] y){
    int temp = x[0];
    x[0] = y[0];
    y[0] = temp;
  }
  public static void main(String[] args) {
    swap temp = new swap();
    int x = 1; int y = 2;
    System.out.println("before : x="+x+" y="+y);
    temp.swap1(x, y);
    System.out.println("after  : x="+x+" y="+y); // no change

    System.out.println();

    int arr1[] = {1}; int arr2[] = {2};
    System.out.println("before : arr1[0]="+arr1[0]+" arr2[0]="+arr2[0]);
    temp.swap2(arr1, arr2);
    System.out.println("after  : arr1[0]="+arr1[0]+" arr2[0]="+arr2[0]); // no change
    
    System.out.println();

    System.out.println("before : arr1[0]="+arr1[0]+" arr2[0]="+arr2[0]);
    temp.swap3(arr1, arr2);
    System.out.println("after  : arr1[0]="+arr1[0]+" arr2[0]="+arr2[0]); // change!!

  }  
}
