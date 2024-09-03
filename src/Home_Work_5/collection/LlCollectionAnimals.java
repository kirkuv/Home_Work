package Home_Work_5.collection;

import Home_Work_5.dto.Animal;
import Home_Work_5.RandomGenerate;

import java.util.LinkedList;
import java.util.List;

import static Home_Work_5.RandomGenerate.random;

public class LlCollectionAnimals {
    private String [] nicks;
    private int age;

    public LlCollectionAnimals(int age, String[] nicks) {
        this.nicks = nicks;
        this.age = age;
    }

    public List<Animal> generateAnimals (int count){
        List<Animal> animalList = new LinkedList<>();
        for (int i = 0; i < count; i++) {
            int age = random.nextInt(15)+1;
            String nick = RandomGenerate.generateRandomStringN(nicks);

            animalList.add(new Animal(age,nick));
        }return animalList;
    }
}
