package JavaCollections;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {
    public static void main(String[] Args){
        Map<String,String> t = new Hashtable<String,String>();//Default capacity is 11 and default load factor is 0.75

        //Adding elements
        t.put("AndersonInc","0758566791");
        t.put("Alex","123fd33");
        t.put("Josh","0758Josh91");
        t.put("Smart","@1234Sam");
        t.put("Smart","@1234S2m");//Hash table doesnt allow duplicate
        //t.put(null,null);//Null values are not accepted
        System.out.println(t);


        //Retrieve
        System.out.println( t.get("Anderson"));

        //All the other methods on the hash map apply as well so make sure to check out the hash map

    }
}
