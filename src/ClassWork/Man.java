package ClassWork;

import java.util.Random;

public class Man {
  private int hairLenghts;
    //private int hairLenghts;
    public void grow(){
        Random random = new Random();
        hairLenghts = hairLenghts + random.nextInt(10);
    }
    public void grow (int lenght){
        hairLenghts = hairLenghts + lenght;
    }


    public int getHairLenghts() {
        return hairLenghts;
    }
}
