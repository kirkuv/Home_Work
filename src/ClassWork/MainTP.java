package ClassWork;
import java.util.Random;
import java.util.Scanner;
public class MainTP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите количество фигур: ");
        int num = scanner.nextInt();
        Shape[] shapes = new Shape[num];
        for (int i = 0; i < num; i++) {
            if (random.nextBoolean()){
                int a = random.nextInt(10);
                int b = random.nextInt(10);
                int c = random.nextInt(10);
                shapes[i] = new Triangle(a,b,c);
            }else {
                int width = random.nextInt(10);
                int height = random.nextInt(10);
                shapes[i] = new Rectangle(width,height);
            }
        }
        int totalP = 0;
        System.out.println("\nСписок фигур: ");
        for (Shape shape : shapes){
            System.out.println(shape.getName() + " c периметром: " +  " "+ shape.perimetr());
            totalP += shape.perimetr();
        }
        System.out.println("Сумма периметров всех фигур: "+ totalP);
    }
}
