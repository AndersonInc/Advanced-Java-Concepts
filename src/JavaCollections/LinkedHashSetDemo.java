package JavaCollections;

import java.util.*;

public class LinkedHashSetDemo {
    public static void main(String[] Args){
        //Declaring. this can be declared in all the possible ways a hashset is declared
        Set lset =new LinkedHashSet();

        lset.add(3);
        lset.add(301);
        lset.add(67);
        lset.add(5);
        System.out.println(lset);

        if (lset.contains(5))lset.add(6);
        System.out.println(lset);
    }
}
