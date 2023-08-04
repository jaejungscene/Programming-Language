package syntax;

class Temp{
    private double member1 = 12;
    public double getmember1(){
        return this.member1;
    }
    public String tempFunc(){
        System.out.println("hello world");
        return "jaejung";
    }

    public void temptempFunc() {
        System.out.println("temptempFunc");
    }
}

class ExtendTemp extends Temp{
    @Override
    public String tempFunc() {
        System.out.println(super.tempFunc());
        super.temptempFunc();
        System.out.println("Overried");
        return "hello";
    }
}

public class OverrideEx extends Temp{
    public static void main(String[] args){
        ExtendTemp t = new ExtendTemp();
        t.tempFunc();

        int[] intarr = {1,2,4,2};
        for(int i=0; i<intarr.length; i++){
            System.out.printf("%d) %d\n", i, intarr[i]);
        }
        System.out.println("------ Finish ------");
    }
}
