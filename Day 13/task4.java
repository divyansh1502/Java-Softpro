/*
Iterate through a LinkedList using:
-> for loop
-> Iterator
-> ListIterator
*/

import java.util.*;

public class task4 {
    public static void main(String[] args) {
        LinkedList<String> al = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of ArrayList: ");
        int size = sc.nextInt(); 
        System.out.print("Enter the String: ");
        for (int i = 0; i <= size; i++) {
            String s = sc.nextLine();
            al.add(s);
        }
        System.out.println("Traverse using for each-loop");
        for(String p : al) {
            System.out.println(p);
        }
        Iterator it = al.iterator();
        System.out.println("Traverse using iterator: ");
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        ListIterator li = al.listIterator();
        System.out.println("Traverse useing ListIterator in forward direction: ");
        while(li.hasNext()) {
            System.out.println(li.next());
        }
        System.out.println("Traverse useing ListIterator in backward direction: ");
        while(li.hasPrevious()) {
            System.out.println(li.previous());
        }
    }
}
