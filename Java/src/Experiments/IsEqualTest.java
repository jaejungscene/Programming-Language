package Experiments;

public class IsEqualTest {
    public static void main(String[] args) {
        String s1 = new String("jae");
        String s2 = new String("jae asd");
        int i = 12;
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1.getClass());
        System.out.println(Integer.valueOf(i).getClass());
        System.out.println(s1.equals(s2));

        System.out.println("-----------------------");
        int[] arr = {1, 2, 3};
        System.out.println(arr.getClass());
        String[] splits = s2.split(" ");
        for(String s: splits)
            System.out.println(s);
    }
}
