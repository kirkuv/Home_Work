package Home_Work_5.collection;

import Home_Work_5.dto.Person;
import Home_Work_5.RandomGenerate;

import java.util.*;
import java.util.ArrayList;


public class CollectionOperationsPerson {
    private String[] names;
    private String [] nick;
    private String filenames;
    private String fileNick;

    public CollectionOperationsPerson(String[] names, String[] nick, String filenames, String fileNick) {
        this.names = names;
        this.nick = nick;
        this.filenames = filenames;
        this.fileNick = fileNick;
    }

    public List<Person> generatePersons (int count){
        List<Person> personList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            String nick = RandomGenerate.generateRandomString();
            String password = RandomGenerate.generateRandomString();
            String name = RandomGenerate.generateRandomStringN(names);
            personList.add(new Person(nick,password,name));
        }return personList;
    }

    public HashSet<Person> listToHS(List<Person> pl){
        return new HashSet<>(pl);
    }
   // public TreeSet<Person> listToTS (List<Person> treepl){
    //    return new TreeSet<>(treepl);
   // }
}
