import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Comparator<String> com = (a,b)->(-a.compareTo(b));

        String[] arr = {"h", "a", "b"};
        Arrays.sort(arr, com);
        System.out.println(Arrays.toString(arr));

        System.out.println("Hello world!");
    }
}