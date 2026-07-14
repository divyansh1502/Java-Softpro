//WAP to create a LinkedList of 5 numbers and traverse it in forward and backward direction.
import java.util.*;
public class linkedList1 {
    public static void main(String[] args) {
        LinkedList<Integer> al = new LinkedList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        ListIterator it = al.listIterator();
        System.out.println("Traversal in forward direction: ");
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("Traversal in backward direction: ");
        while(it.hasPrevious()) {
            System.out.println(it.previous());
        }
    }
}
