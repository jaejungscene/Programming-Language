package MyApp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationImpleTest {

    static void combinationUtil(int arr[], int data[], int start,
                                int end, int index, int r, List<int[]> storage)
    {
        // Current combination is ready to be printed, print it
        if (index == r)
        {
            int[] temp = new int[r];
            for (int j=0; j<r; j++) {
                temp[j] = data[j];
//                System.out.print(data[j] + " ");
            }
            storage.add(temp);
//            System.out.println("");
            return;
        }

        // replace index with all possible elements. The condition
        // "end-i+1 >= r-index" makes sure that including one element
        // at index will make a combination with remaining elements
        // at remaining positions
        for (int i=start; i<=end && end-i+1 >= r-index; i++)
        {
            data[index] = arr[i];
            combinationUtil(arr, data, i+1, end, index+1, r, storage);
        }
    }

    // The main function that prints all combinations of size r
    // in arr[] of size n. This function mainly uses combinationUtil()
    static void printCombination(int arr[], int n, int r, List<int[]> storage)
    {
        // A temporary array to store all combination one by one
        int data[]=new int[r];

        // Print all combination using temporary array 'data[]'
        combinationUtil(arr, data, 0, n-1, 0, r, storage);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        int r = 1;
        List<int[]> storage = new ArrayList<>();
//        printCombination(arr, arr.length, 3);
        combinationUtil(arr, new int[r], 0, n-1, 0, r, storage);
        storage.stream().forEach((x)->{System.out.println(Arrays.toString(x));});

        System.out.println(
                storage.stream().mapToInt((x)->{
            int temp = 0;
            for(int i: x){
                temp += i;
            }
            return temp;
        }).sum()
        );
    }
}
