package ClassWork;

public class Main10 {
    public static void main(String... args){


        Figures[] figures = new Figures[5];

        figures[1] = new Figures(10, 5);     // Площадь прямоугольника

        int areacube = 0;
        int arearect = 0;

        for(int i = 0; i < figures.length; i++){
            if(i == 0){
                areacube = figures[i].getAreaCube();
                System.out.println("Площадь квадрата: " + areacube);
            }else if(i == 1){
                arearect = figures[i].getAreaRectangle();
                System.out.println("Площадь прямоугольника: " + arearect);
            }
            else if(i == 4){
                int result = areacube + arearect;
                System.out.println("Общая площадь: " + result);
            }
        }
    }
}
