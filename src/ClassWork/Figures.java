package ClassWork;

public class Figures implements AreaFigures{

    private int aside;
    private int bside;

    public int getAside() {
        return aside;
    }

    public int getBside() {
        return bside;
    }

    public Figures() {
        System.out.println(getAllFigures());
    }

    public Figures(int aside) {
        this.aside = aside;
    }

    public Figures(int aside, int bside) {
        this.aside = aside;
        this.bside = bside;
    }

    // Площадь квадрата
    @Override
    public int getAreaCube() {
        int areacube = (int) Math.pow(getAside(), 2);
        return areacube;
    }

    // Площадь прямоугольника
    @Override
    public int getAreaRectangle() {
        int arearectangle = getAside() * getBside();
        return arearectangle;
    }

    // Сумма площади всех фигур
    @Override
    public int getAllFigures() {
        return getAreaCube()  + getAreaRectangle();
    }
}
