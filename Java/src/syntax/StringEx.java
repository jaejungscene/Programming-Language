package syntax;

import java.util.Arrays;

public class StringEx {
    public static void main(String[] args) {
        String str1 = new String("aa");
        String str2 = new String("aa");
        String str3 = "aa";

        System.out.println((str1==str2));
        System.out.println((str2==str3));
        System.out.println(str1.equals(str2));
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());
        System.out.println('a'==97);

        StringBuilder[] arr = {new StringBuilder("asdf"), new StringBuilder("qwe")};
        System.out.println(Arrays.toString(arr));
        arr[0].append(12);
        System.out.println(Arrays.toString(arr));
        System.out.println('1' < '9');
    }
}
