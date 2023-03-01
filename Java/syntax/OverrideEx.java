package syntax;

class Temp{
    private double member1 = 12;
    public double getmember1(){
        return this.member1;
    }
    public String tempFunc(){
        System.out.println("hello world\n");
        return "jaejung";
    }
}

public class OverrideEx extends Temp{
    @Override
    public String tempFunc(){
        System.out.println("Overrided hello world\n");
        return "jaejungscene";
    }    
    public static void main(String[] args){
        int[] intarr = {1,2,4,2};
        for(int i=0; i<intarr.length; i++){
            System.out.printf("%d) %d\n", i, intarr[i]);
        }
        System.out.println("------ Finish ------");
    }
}
