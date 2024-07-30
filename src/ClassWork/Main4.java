package ClassWork;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        String correctName = "name";
        int maxAttent = 4;
        int attent =0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < maxAttent; i++) {
            if (correctName.equals(scanner.nextLine())){
                System.out.println("Molodec");
                break;
            }
            System.out.println("povtori");
            attent++;
        }
        if (attent==maxAttent){
            System.out.println("LOX");
        }

    }

}
