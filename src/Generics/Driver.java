package Generics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Driver {
    public static void main(String[] Args){
//        SignUp<String> signUp = new SignUp<>();
        Map<Integer,Integer> log = new HashMap<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your details here");
        System.out.println("Enter your Username here: ");
        //String uname = input.nextLine();
        int uname = Integer.parseInt(input.nextLine());
        System.out.println("Enter your password here: ");
        //String pass = input.nextLine();
        int pass = Integer.parseInt(input.nextLine());
        //SignUp<String> signUp = new SignUp<>(uname,pass);
        SignUp<Integer> signUp = new SignUp<>(uname,pass);
        signUp.display();

//        System.out.println(signUp.getName());
//        System.out.println((signUp.getName()).getClass().getSimpleName());
//        log.put(uname,pass);
//        System.out.println(log);

    }
}
