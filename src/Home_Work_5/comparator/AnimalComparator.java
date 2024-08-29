package Home_Work_5.comparator;

import Home_Work_5.Animal;

import java.util.Comparator;

public class AnimalComparator implements Comparator<Animal> {
        @Override
    public int compare(Animal o1, Animal o2) {
        if(o1.getAge() > o2.getAge()){
            return 1;
        }
        if (o1.getAge() == o2.getAge())
            return 0;
        return -1;
    }
}
