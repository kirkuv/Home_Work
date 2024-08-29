package Home_Work_5.collection;

import Home_Work_5.Animal;
import Home_Work_5.RandomGenerate;

import java.util.HashSet;
import java.util.List;

import static Home_Work_5.RandomGenerate.random;

public class HsCollectionAnimals {
    private String [] nicks;
    private int age;

    public HsCollectionAnimals(int age, String[] nicks) {
        this.nicks = nicks;
        this.age = age;
    }

    public List<Animal> generateAnimals (int count){
        List<Animal> animalList = new HashSet<E>();
        for (int i = 0; i < count; i++) {
            int age = random.nextInt(15)+1;
            String nick = RandomGenerate.generateRandomStringN(nicks);
            animalList.add(new Animal(age,nick));
        }return animalList;
    }
}
