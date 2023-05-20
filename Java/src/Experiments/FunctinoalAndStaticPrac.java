package Experiments;

import java.util.HashMap;
import java.util.Map;

class Temp{
    public static Map<Long, String> store = new HashMap<>();
    private static long sequence = 0L;
    public void print(){
        System.out.println(store);
    }
    public void storeValue(Long id, String name){
        store.put(id, name);
    }
}

class TempContainer{
    private static Temp temp = new Temp();
    public static Temp getTempInstances(){
        return temp;
    }
}

public class FunctinoalAndStaticPrac {
    Temp tempclass;
    public FunctinoalAndStaticPrac(Temp tempclass){
        this.tempclass = tempclass;
    }
    private void funcTemp(){
        tempclass.print();
    }
    public static void main(String[] args) {

        FunctinoalAndStaticPrac ob1 = new FunctinoalAndStaticPrac(TempContainer.getTempInstances());
        FunctinoalAndStaticPrac ob2 = new FunctinoalAndStaticPrac(TempContainer.getTempInstances());
//        ob1.tempclass = new Temp();
//        ob2.tempclass = new Temp();

        System.out.println(ob1.tempclass.hashCode());
        System.out.println(ob2.tempclass.hashCode());
        System.out.println("------------");

        ob1.tempclass.store.put(1L, "jaejung");

        ob1.tempclass.print();
        ob2.tempclass.print();
        System.out.println(Temp.store);
        System.out.println("------------");

        System.out.println(ob1.tempclass.store.hashCode());
        System.out.println(ob2.tempclass.store.hashCode());
        System.out.println(Temp.store.hashCode());
        System.out.println("------------");

//        Function<Integer, Integer> func12 = m -> {
//            System.out.println(m);
//            return m + 1;
//        };
//        System.out.println(func12.apply(21));
    }

}
