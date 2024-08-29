package Home_Work_5.comparator;

import Home_Work_5.Animal;

import java.util.Comparator;

public class AnimalComparatorNick implements Comparator<Animal> {

    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getNick().compareTo(o2.getNick());
    }
}
