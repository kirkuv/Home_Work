package ClassWork;

public class Triangle implements Shape {
    private double a,b,c;
    public Triangle (int a, int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public int perimetr(){
        return (int) (a+b+c);
    }
    public String getName(){
        return "Треугольник";
    }
}
