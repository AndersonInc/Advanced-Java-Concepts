package JavaCollections;

import java.util.*;

public class ArrayListDemo1 {
    public static void main(String[] Args){
        //Declaring an array list.
        ArrayList al = new ArrayList();// this stores heterogeous data
        //ArrayList <String> all = new ArrayList<String>(); This would form an homogenous list of the wrapper class string

        //Similarly we cadeclare the arraylist using a reference of the root class list
        //List al = new ArrayList();

        //Adding a new element to the list
        al.add(100);
        al.add("String");
        al.add(13.7);
        al.add(true);
        System.out.println(al);
        System.out.println(al.contains(4));
        al.remove(13.7);
        System.out.println(al);
        al.add(1,13.56);
        System.out.println(al);

        //Demonstrating on homogenous list
        ArrayList <Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(8);
        numbers.add(45);
        numbers.add(0);
        System.out.println(numbers);

        //Sorting the numbers
        Collections.sort(numbers,Collections.reverseOrder());
        System.out.println(numbers);// After sorting

        //Replacing
        numbers.set(3,11);
        System.out.println(numbers);

        //Searching through the numbers
        System.out.println(numbers.contains(8));

        List names = new ArrayList();
        names.add("Anderson");
        names.add("Nixon");
        names.add("Sam");
        names.add("Josh");

        //Checking whether list is empty
        System.out.println(names.isEmpty());

        //Using loops to traverse a list
        //for loop
        System.out.println("Reading elements using for loop");
        System.out.println("The index of Anderson is: "+names.indexOf("Anderson"));
//        for(int i =names.toArray().length -1;i>= 0;i--){
//            System.out.println(names.get(i));
//        }
        //int l = numbers.size();
       // for(int i = numbers.toArray().length -1;i >= 0;i--) System.out.println(numbers.get(i));

        //for each

        for (Object e:numbers
             ) {
            System.out.println(e);


        }
        //iterator
        System.out.println("Reading values by the iterator");
        Iterator it = names.iterator();
        while(it.hasNext()) System.out.println(it.next());

        //Add Multiple objects to list
        List both = new ArrayList();
        both.add(names);
        both.add(numbers);
        System.out.println(both);
        try {
            Collections.sort(both);
            System.out.println(both);
        } catch (Exception e) {
            System.out.println("Caught an exception "+e);
        }

        //Shuffling
        Collections.shuffle(numbers);
        System.out.println("Elements in the list after shuffling: "+numbers);

        //Converting arrayList to array and vice versa
        String [] banks = {"DTB","KCB","UBA"};
        for (String v:banks
             ) {
            System.out.println(v);

        }

        List Arrls = new ArrayList(Arrays.asList(banks));
        System.out.println(Arrls);

    }
}
