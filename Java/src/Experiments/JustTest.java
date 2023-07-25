package Experiments;

import java.util.Arrays;

class BA extends AS{
    public BA(int x){
        super(12);
        System.out.println("asdf");
    }

    public void temp(){
        System.out.println("zxcv");
        super.temp();
    }
}

class AS{
    public AS(){
        System.out.println("qwer");
    }
    public AS(int x){
        System.out.print("나");
    }

    public void temp(){
        System.out.println("rtyu");
    }
}

public class JustTest{
    public static void main(String[] args) {
        int a[] = new int[8];
        int i = 0;
        int n = 10;
        while(n>0){
            a[i++] = n%2;
            n /= 2;
        }
        for(i=7; i>=0; i--){
            System.out.print(a[i]);
        }

        System.out.println("\n===============");

        AS as = new BA(23);
        as.temp();

        // System.out.println(Arrays.toString(a));
        // System.out.println(a.length);
        // a[0] = 1;
        // System.out.println(Arrays.toString(a));
        // System.out.println(a[0]);
        // System.out.println(a.length);
    }
}