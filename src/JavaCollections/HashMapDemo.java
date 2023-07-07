package JavaCollections;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] Args){
        //Declaration
        HashMap<Integer,String> m = new HashMap<Integer,String>();//Heterogeoous declaration of the map
        //Inserting Values in the hashMap
        m.put(122,"JOEL2:76");
        m.put(123,"23241:76");
        m.put(124,"12345678");
        System.out.println(m);

        //Searching through the hash map
        if (m.containsKey(123))System.out.println(m.get(123));

        System.out.println(m.keySet());//returns all keys
        System.out.println(m.values());//Returns all values in the collection

        System.out.println(m.entrySet());//Returns all entries a set object

        //Looping through the keys
        for (Object key:m.keySet())System.out.println(key);

        //Entry Methods
        System.out.println();
        for(Map.Entry entry:m.entrySet())System.out.println(entry);

    }
}
