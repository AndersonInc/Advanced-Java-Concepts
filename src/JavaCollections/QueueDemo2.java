package JavaCollections;

import java.util.*;

public class QueueDemo2 {
    public static void main(String[] Args){
        Queue lq = new LinkedList();//LinkedQueue allows heterogeous data
        lq.add("A");
        lq.add("B");
        lq.add("C");
        lq.offer(100);
        lq.offer(100);
        lq.offer(1200);
        System.out.println(lq);

        //Remove element
        lq.remove();
        System.out.println(lq);

        //Checking head
        System.out.println(lq.peek());
        System.out.println(lq.element());
    }
}
