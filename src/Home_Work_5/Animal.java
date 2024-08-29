package Home_Work_5;

import java.io.File;

public class Animal {
    private int age;
    private String nick;


    public Animal (int age, String nick){
        setAge(age);
        this.nick = nick;
    }
    public void setAge (int age){
        if (age>= 1 && age <= 15){
            this.age=age;
        }else {
            throw new IllegalArgumentException("Возраст должен быть от 1 до 15 лет");
        }
    }

    public int getAge() {
        return age;
    }

    public String getNick() {
        return nick;
    }
    @Override
    public String toString(){
        return "Animal Nick: "+ nick + ", Age: " + age;
    }

}
