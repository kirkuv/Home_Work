package Home_Work_5.dto;

import java.io.File;

public class Person {
    private String nick;
    private String password;
    private String name;


    public Person (String nick, String password, String name){
        this.nick = nick;
        setPassword (password);
        this.name = name;
    }
    public void setPassword (String password){
        if (password.length()>= 5 && password.length()<= 10){
            this.password=password;
        }else {
            throw new IllegalArgumentException("Пароль должен содержать от 5 до 10 символов!");
        }
    }
    public String getNick() {
        return nick;
    }
    public String getPassword() {
        return password;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString(){
        return "Nick: " +nick+", Name: " + name + ", Password: "+ password;
    }
}