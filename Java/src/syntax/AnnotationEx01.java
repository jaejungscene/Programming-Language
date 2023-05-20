// https://beginnersbook.com/2014/09/java-annotations/
package syntax;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.Annotation;


@Inherited
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface BasicEngine {
    String mileage() default "20";
    String fuelType() default "Gasoline";
}

@BasicEngine(mileage="30", fuelType="BioDiesel")
class Car {
    String make;
    String model;
    public Car(String make, String model){
        this.make = make;
        this.model = model;
    }

    public void getCarDetails(){
        System.out.println("Car Manufacturer: " + make);
        System.out.println("Car Model: " + model);
    }
}

public class AnnotationEx01 {
    public static void main(String[] args) throws Exception {
        Car car1 = new Car("32", "Diesel");
        car1.getCarDetails();
        Class carClass = car1.getClass();
        System.out.println(carClass);
        Annotation testAnn = carClass.getAnnotation(BasicEngine.class);
        BasicEngine engine = (BasicEngine)testAnn;
        System.out.println("Mileage: " + engine.mileage());
        System.out.println("Fuel Type: " + engine.fuelType());
        System.out.println("------------------------");

        Car car2 = new Car("32", "Diesel");
        car2.getCarDetails();
        carClass = car2.getClass();
        System.out.println(carClass);
        testAnn = carClass.getAnnotation(BasicEngine.class);
        engine = (BasicEngine)testAnn;
        System.out.println("Mileage: " + engine.mileage());
        System.out.println("Fuel Type: " + engine.fuelType());
        System.out.println("------------------------"); 
    }
}
