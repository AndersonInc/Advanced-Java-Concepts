package JavaCollections;

import java.util.*;

public class QueueDemo {
    public static void main(String[] Args){
        //Declaring
        Queue que = new PriorityQueue();

        //Adding elements
        que.add("A");
        que.add("B");
        que.add("C");
        que.offer("D");
        System.out.println(que);

        //Getting head element
        System.out.println(que.peek()); //Returns null if queue is empty
        //System.out.println(que.element());//Returns NoSuchElementException

        //return and remove element from que
//        que.remove();
//        System.out.println(que);

        que.poll();
        System.out.println(que);

        //Traversing the que
        System.out.println("Printing the elemnts of the que using Iterator");
        Iterator it = que.iterator();
        while(it.hasNext())System.out.println(it.next());
        }
}
