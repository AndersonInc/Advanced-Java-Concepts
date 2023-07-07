package JavaCollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] Args){
        //Declaring a hashset
        HashSet hs = new HashSet<>();//Heterogenous data default load size =0.75,initial size 16
        Set banks = new HashSet(5, 0.90F);
        //Adding elements to the hashmet
        hs.add("JOEl2:28");
        hs.add("JOEl2:27");
        hs.add("Genesis3:15");
        System.out.println(hs);

        banks.add("DFCU");
        banks.add("KCB");
        banks.add("DTB");
        banks.add("CAIRO");
        banks.add("TAIM");
        banks.add("EQUITY");
        System.out.println(banks);
        System.out.println(banks.size());

        //Removing elements |Searching |Traversing
        if(banks.contains("TAIM")){
            banks.remove("TAIM");
            System.out.println(banks);
        }

        //foreach loop
        System.out.println("\nReading contents of the bank object using foreach loop");
        for(Object bank: banks){
            System.out.println(bank);
        }

        //iterator
        Iterator it = hs.iterator();
        System.out.println("\nHash set using iterator");
        while (it.hasNext())System.out.println(it.next());

        //AddAll and RemoveAll methods
        System.out.println("Add all at work");
        Set mix = new HashSet();
        mix.addAll(banks);
        mix.addAll(hs);
        System.out.println(mix);

        mix.removeAll(banks);
        System.out.println(mix);

    }
}
