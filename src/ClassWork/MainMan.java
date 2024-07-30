package ClassWork;

public class MainMan {
    public static void main(String[] args) {
        Man man1 = new Man();
        Man man2 = new Man();
        Man man3 = new Man();

        man1.grow();
        man2.grow();
        man3.grow(49);


        System.out.println(man1.getHairLenghts());
        System.out.println(man2.getHairLenghts());
        System.out.println(man3.getHairLenghts());
    }
}
