package syntax;

import java.util.Scanner;

public class AssertEx01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        assert num >= 10;
    }
}
