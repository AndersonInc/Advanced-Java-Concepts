package Generics;

import java.util.*;

public class SignUp<T> {
    Map<T,T> login = new HashMap<>();
    //List<Integer> login = new ArrayList<>();
    private T name;
    private T password;
    public SignUp(T n,T p){
        this.setName(n);
        this.setPassword(p);
        login.put(this.getName(),this.getPassword());
    }
    public void display(){
        System.out.println(login);
    }
    public void setName(T name) {
        this.name = name;

    }

    public T getName() {
        return name;
    }

    public void setPassword(T password) {
        this.password = password;
    }

    public T getPassword() {
        return password;
    }



}
