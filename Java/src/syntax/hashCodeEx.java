package syntax;

import java.util.Scanner;

import static java.lang.Double.NaN;
import static java.lang.Double.isNaN;

public class hashCodeEx {
    public static void main(String[] args) {
        Object x = Double.valueOf(12.2);
        Double x1 = 13.0;
        Double x2 = 13.0;
        Double x3 = x1;

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<2; i++){
            x2 = sc.nextDouble();
            System.out.println(x1.hashCode());
            System.out.println(x2.hashCode());
            System.out.println(x3.hashCode());
            System.out.println(x2.equals(x1));
        }

    }
}
