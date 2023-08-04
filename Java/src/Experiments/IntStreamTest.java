package Experiments;

import java.util.stream.IntStream;

public class IntStreamTest {
    public static void main(String[] args) {
        int start = 1;
        int end = 9;
        System.out.println(">> default");
        IntStream.range(start, end).forEach(System.out::print);

        System.out.println("\n--------------------");

        System.out.println(">> parallel");
        IntStream.range(start, end).parallel().forEach(System.out::print);

        System.out.println("\n--------------------");

        System.out.println(">> sequential");
        IntStream.range(start, end).sequential().forEach(System.out::print);

        System.out.println("\n--------------------");

        System.out.println(">> sort");
        IntStream.range(start, end).parallel().sorted().forEach(System.out::print);

        System.out.println("\n\n");


        Long sTime, eTime;
        start = 0;
        end = 10000000;

        // parallel() needs more time
        sTime = System.currentTimeMillis();
        IntStream.range(start, end).parallel().forEach(x->{});
        eTime = System.currentTimeMillis();
        System.out.println((eTime - sTime)/1000.);

        sTime = System.currentTimeMillis();
        IntStream.range(start, end).sequential().forEach(x->{});
        eTime = System.currentTimeMillis();
        System.out.println((eTime - sTime)/1000.);


    }
}
