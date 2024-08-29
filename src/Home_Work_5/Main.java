package Home_Work_5;

import Home_Work_5.collection.CollectionOperationsAnimals;
import Home_Work_5.collection.CollectionOperationsPerson;
import Home_Work_5.comparator.AnimalComparator;
import Home_Work_5.comparator.AnimalComparatorNick;
import Home_Work_5.comparator.PasswordAndPersonComparator;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        String[] namesA = new String[]{"Tuzik", "Bobik", "Sobaka", "Graf"};
        String filenameA = new String("Список2.txt");
        String[] namesP = new String[]{"Kirill", "Paxa", "Alex", "Sasha"};
        String filenameP = new String("Список1.txt");
        int age = 0;



        CollectionOperationsPerson collectionCreator = new CollectionOperationsPerson(namesP,namesA,filenameP,filenameA);
        CollectionOperationsAnimals collectionCreatorA = new CollectionOperationsAnimals(age, namesA);

        List<Person> listP = collectionCreator.generatePersons(100);

        List<Animal> listA = collectionCreatorA.generateAnimals(100);
        AnimalComparator AC = new AnimalComparator();
        AnimalComparatorNick ACN = new AnimalComparatorNick();
        Collections.sort(listA, AC.thenComparing(ACN));
        PasswordAndPersonComparator PPC = new PasswordAndPersonComparator();
        Collections.sort(listP,PPC);



        //RandomGenerate.generateRandomString();
        System.out.println(RandomGenerate.generateRandomString());
        //RandomGenerate.generateRandomStringN(namesP);
        System.out.println(RandomGenerate.generateRandomStringN(namesP));
        //RandomGenerate.generateRandomStringN(namesA);
        System.out.println(RandomGenerate.generateRandomStringN(namesA));
        //RandomGenerate.generateAllSymbol();
        System.out.println(RandomGenerate.generateAllSymbol());
        RandomGenerate.generateRandomRussianString();
        System.out.println(RandomGenerate.generateRandomRussianString());
        //RandomGenerate.generateRandomFromFile(Person.filename);
        //System.out.println(RandomGenerate.generateRandomFromFile(Person.filename));

        String nameP = RandomGenerate.generateRandomFromFile(filenameP);
        System.out.println(nameP);
        String nameA = RandomGenerate.generateRandomFromFile(filenameA);
        System.out.println(nameA);



       /* try {
            BufferedReader br = new BufferedReader(new FileReader("Списки.txt"));
            String line;
            List<String> lines = new ArrayList<>();
            while ((line=br.readLine())!=null) {
                lines.add(line);
            }
            System.out.println(lines.get(0));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        */
    }
}
