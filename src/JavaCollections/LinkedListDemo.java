package JavaCollections;

import java.util.*;

public class LinkedListDemo {
    //The linked list implements methods in the list interface and the deque interface
    //the deque interface itself is a sub interface of the queue interface
    // which is also a sub interface of collection interface which is a sub interface of the collections framework

    public static void main(String[] Args){
        //Declaring a linked list
        LinkedList cities = new LinkedList();//For Heterogeous data
        LinkedList <String> banks = new LinkedList<String>(); //For homogeous data
        List crypto = new LinkedList();//Also acceptable

        //Adding elements to a linked list
        cities.add("Kampala");
        cities.add("Tokyo");
        cities.add("Berlin");
        cities.add("Nairobi");
        cities.add("Washington");

        banks.add("UBA");
        banks.add("CAIRO");
        banks.add("SWISS");
        banks.add("GLOTRANS");
        banks.add("DFCU");
        banks.add("CHINA_BANK");

        crypto.add(10000);
        crypto.add("Bitcoin");
        crypto.add(18.6);
        crypto.add("Solana");
        crypto.add(4503);
        crypto.add("USDT");

        //Tranversing the linkedLists
        System.out.println("\nCrypto Availabe");
        for (Object crypt : crypto)System.out.println(crypt);
        System.out.println("\nBanks Availabe");
        for (String bank : banks)System.out.println(bank);
        System.out.println("\nCities Availabe");
        for (Object city : cities)System.out.println(city);

        //sorting |Add |Shuffle |Remove |search
        Collections.sort(banks);
        System.out.println(banks);
        Collections.shuffle(crypto);
        System.out.println(crypto);

        banks.add("KCB");
        banks.addFirst("TAIM");
        System.out.println("New bank list after insertion"+banks);

        banks.remove("GLOTRANS");
        System.out.println("After removal of a bank"+banks);

        System.out.println(crypto.contains("Ether"));

        //Displaying using iterator
        Iterator it = cities.listIterator();
        System.out.println("Displaying using iterator");
        while (it.hasNext())System.out.println(it.next());
    }
}
