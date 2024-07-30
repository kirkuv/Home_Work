package ClassWork;

public class Rectangle implements Shape {
    private double width, height;
    public Rectangle (int width, int height) {
        this.width = width;
        this.height = height;
    }
    public int perimetr(){
        return (int) (2 * (width+height));
    }
    public String getName(){
        return "Прямоугольник";
    }
}
