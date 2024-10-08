package Home_Work_5;

import Home_Work_5.collection.CollectionOperationsAnimals;
import Home_Work_5.collection.CollectionOperationsPerson;
import Home_Work_5.collection.LlCollectionAnimals;
import Home_Work_5.comparator.AnimalComparator;
import Home_Work_5.comparator.AnimalComparatorNick;
import Home_Work_5.comparator.PasswordAndPersonComparator;
import Home_Work_5.dto.Animal;
import Home_Work_5.dto.Person;

import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String[] namesA = new String[]{"Tuzik", "Bobik", "Sobaka", "Graf"};
        String filenameA = new String("Список2.txt");
        String[] namesP = new String[]{"Kirill", "Paxa", "Alex", "Sasha"};
        String filenameP = new String("Список1.txt");
        int age = 0;
        long time;


        CollectionOperationsPerson collectionCreator = new CollectionOperationsPerson(namesP,namesA,filenameP,filenameA);
        CollectionOperationsAnimals collectionCreatorA = new CollectionOperationsAnimals(age, namesA);
        AnimalComparator AC = new AnimalComparator();
        AnimalComparatorNick ACN = new AnimalComparatorNick();
        PasswordAndPersonComparator PPC = new PasswordAndPersonComparator();

        List<Person> listP = collectionCreator.generatePersons(100_000);
        time = System.currentTimeMillis();
        Collections.sort(listP,PPC);
        time = System.currentTimeMillis() - time;
        System.out.println(time + " мс время сортровки коллекции");
        
        time = System.currentTimeMillis();
        List<Animal> listA = collectionCreatorA.generateAnimals(100_000);
        time = System.currentTimeMillis() - time;
        System.out.println(time + " Мс Время Создание коллекции");
        Collections.sort(listA, AC.thenComparing(ACN));
        time = System.currentTimeMillis();
        LlCollectionAnimals llCollectionAnimals = new LlCollectionAnimals(age,namesA);
        List<Animal> animalList = collectionCreatorA.generateAnimals(1_000_000);
        Collections.sort(animalList,ACN);
        time = System.currentTimeMillis() - time;
        System.out.println(time + " Мс Время Создание коллекции и сортировки на 1_000_000");
        //RandomGenerate.generateRandomString();
        System.out.println(RandomGenerate.generateRandomString() + ": рандом");
        //RandomGenerate.generateRandomStringN(namesP);
        System.out.println(RandomGenerate.generateRandomStringN(namesP) + ": рандом имен людей");
        //RandomGenerate.generateRandomStringN(namesA);
        System.out.println(RandomGenerate.generateRandomStringN(namesA) + ": рандом кличек");
        //RandomGenerate.generateAllSymbol();
        System.out.println(RandomGenerate.generateAllSymbol() + ": генерация символов");
        RandomGenerate.generateRandomRussianString();
        System.out.println(RandomGenerate.generateRandomRussianString() + ": генерация русских букв");
        //RandomGenerate.generateRandomFromFile(Person.filename);
        //System.out.println(RandomGenerate.generateRandomFromFile(filenameA) );

        String nameP = RandomGenerate.generateRandomFromFile(filenameP);
        System.out.println(nameP + ": рандомное имя из файла");
        String nameA = RandomGenerate.generateRandomFromFile(filenameA);
        System.out.println(nameA + ": рандомное имя из файла");
        time = System.currentTimeMillis();
        List<Person> tree = collectionCreator.generatePersons(100_000);
        HashSet<Person> personHashSet = collectionCreator.listToHS(tree);
        time = System.currentTimeMillis() - time;
        System.out.println(time + " Мс Время Создание коллекции HashSet");

        long startiterationTime = System.currentTimeMillis();
        Iterator<Person> itr = listP.iterator();
        int count = 0;
        while (itr.hasNext()){
            itr.next();
            count++;
        }
        System.out.println("В коллекции listP "+ count+ " элементов");
        long iterationDuration = System.currentTimeMillis() - startiterationTime;
        System.out.println("Итерация через Iterator заняла "+iterationDuration +" ms");

        long startLoopTime = System.currentTimeMillis();
        Object [] array = listP.toArray();
            for (Object obj : array){
            }
            long loopDuration = System.currentTimeMillis()-startLoopTime;
        System.out.println("Итерация через обычный цикл заняла "+ loopDuration + " мс");

        long startRemoveIteratorTime = System.currentTimeMillis();
        itr = listP.iterator();
        while (itr.hasNext()){
            itr.next();
            itr.remove();
        }
        long finishRemoveTime = System.currentTimeMillis() - startRemoveIteratorTime;
        System.out.println("Удаление через Iterator заняло " + finishRemoveTime + " ms");

        //TreeSet<Person> personTreeSet = collectionCreator.listToTS(tree);
       // Collections.sort(personHashSet, new PersonComparator()); НЕЛЬЗЯ СОРТРОВАТЬ!!!!

    }
}
