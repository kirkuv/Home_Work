package ClassWork;

import javax.xml.transform.Source;

public class MainCar {
    public static void main(String[] args) {
        Car car1 = new Car ();
        car1.name = "BMW";
        car1.color = "Black";

        Car car2 = new Car();
        System.out.println(car1.name);
        System.out.println(car2.color);

        System.out.println("________");
    }
}
