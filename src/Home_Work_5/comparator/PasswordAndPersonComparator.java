package Home_Work_5.comparator;

import Home_Work_5.dto.Person;

import java.util.Comparator;

public class PasswordAndPersonComparator implements Comparator<Person> {
    public int compare (Person p1, Person p2){
        int lenghtComparison = Integer.compare(p1.getPassword().length(),p2.getPassword().length());
            if (lenghtComparison != 0){
                return lenghtComparison;
            }return p1.getName().compareTo(p2.getName());
    }

  //  @Override
   // public int compareTo(Person o) {
    //    return 0;
    // }
}
