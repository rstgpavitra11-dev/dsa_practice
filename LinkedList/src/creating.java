import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class creating {
    public static void main(String[] args) {
        int arr[]={21,23,43,45,6,56,5};
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(12);
        ll.add(0,23);
        ll.add(56);
        ll.add(78);
        ll.add(89);
        ll.add(27);

        ll.addFirst(11);
        Iterator<Integer> it = ll.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println(ll.contains(13));
        // reverse iterator
        ll.removeLastOccurrence(27);
        Iterator<Integer> op = ll.descendingIterator();
        while(op.hasNext()){
            System.out.println(op.next());
        }

    }
}
/*
addFirst()	Adds an element to the beginning of the list
addLast()	Add an element to the end of the list
removeFirst()	Remove an element from the beginning of the list
removeLast()	Remove an element from the end of the list
getFirst()	Get the element at the beginning of the list
getLast()	Get the element at the end of the list
*/