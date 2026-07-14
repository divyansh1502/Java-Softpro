//WAP to create a LinkedList of your friends and traverse it using iterator 
import java.util.*;
public class linkedList {
    public static void main(String[] args) {
        LinkedList<String> f = new LinkedList<>();
        f.add("Ram");
        f.add("Vijay");
        f.add("Raju");
        f.add("Kirti");
        f.add("Ananya");
        f.add("Alia");

        System.out.println("List of friends: ");

        // for(String name: f) {
        //     System.out.println(name);
        // }
        Iterator it = f.iterator();
        while (it.hasNext()) { 
            System.out.println(it.next());
        }

    }
}
