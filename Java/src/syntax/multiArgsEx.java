package syntax;


public class multiArgsEx<T> {
    public T add(T... a){
        System.out.println(a.getClass());
        for(T item: a){
            System.out.println(item);
        }
        System.out.println("----------------");
        return a[0];
    }

    public static void main(String[] args) {
        Double darr[] = {Double.valueOf(2.5), Double.valueOf(2.0), Double.valueOf(3.2)};

        multiArgsEx<Double> temp = new multiArgsEx<>();
        temp.add(Double.valueOf(1.2));
        temp.add(Double.valueOf(1.5), Double.valueOf(2.0), Double.valueOf(3.2));
        temp.add(darr);
        
        System.out.println(temp.getClass());
    }
}
