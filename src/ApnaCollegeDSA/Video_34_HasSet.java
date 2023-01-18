package ApnaCollegeDSA;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class Video_34_HasSet {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(5);
        hs.add(1);
        hs.remove(5);
        System.out.println(hs);
        // iterator

        Iterator it = hs.iterator();
        //iterator has mainly 2 property
        //next();
        System.out.println(it);
    /*    System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());

        //hasNext();
        System.out.println(it.hasNext());
        System.out.println(it.next());
        System.out.println(it.hasNext());
*/
        // to print all element using iterator
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
