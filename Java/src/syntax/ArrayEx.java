package syntax;

public class ArrayEx {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2},
            {3,2},
            {4,1}
        };
        System.out.println(arr.length);
        System.out.println(arr[0].length);
        for(int[] pair: arr){
            for(int i: pair){
                System.out.print(i);
            }
        }
        Math.min(0, 0);
    }
}
