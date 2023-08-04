package syntax;


class Constructor<T>{
    private T x, y;

    public Constructor(T x, T y){
        this.x = x;
        this.y = y;
    }
    public static <T> Constructor<T> of(T x, T y){
        return new Constructor(x, y);
    }
    public <T> T add(T x, T y){
        return x;
    }
}

public class ConstructorTest {
    public static void main(String[] args) {
        Constructor<Integer> c = new Constructor<>(3, 12);
        System.out.println(Constructor.of(2, 3));
        System.out.println(c.add(12, 3));
    }
}
