package Home_Work_5.comparator;

import Home_Work_5.Person;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person>{
        //implements Comparator<Person>{
  //  public int compare (Person p1, Person p2){
 //       return Integer.compare(p1.getPassword().length(),p2.getPassword().length());
 //   }

    public static Comparator<Person>
    passwordLenghtComparator(){
        return Comparator.comparingInt(p->p.getPassword().length());
    }
    public static Comparator<Person> passwordAndNickComparator(){
        return Comparator.comparingInt((Person p)->p.getPassword().length()).thenComparing(Person::getNick);
    }

    @Override
    public int compare(Person o1, Person o2) {
        return 0;
    }

    @Override
    public Comparator<Person> thenComparing(Comparator<? super Person> other) {
        return Comparator.super.thenComparing(other);
    }
}
