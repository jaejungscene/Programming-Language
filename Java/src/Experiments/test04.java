package Experiments;
import java.util.*;

public class test04 {
//   static void printCollection(Collection<? extends Number> c) {
//     for (Number e : c) {
//         System.out.println(e);
//     }
// }
  public static void main(String[] args) {
    String[] arr = {"asdf", "qwer", "zxcv"};
    Object[] Oarr = new Object[3];
    Oarr = arr;
    System.out.println(Oarr[0]+" "+Oarr[1]+" "+Oarr[2]);
    ArrayList<Object> list = new ArrayList<>();
    ArrayList<? super Number> Olist = list;
    list.add(Oarr[0]);
    list.add(Oarr[1]);
    list.remove(0);
    System.out.println(Olist.size());
    System.out.println(Olist.get(0));
  }
  
}
