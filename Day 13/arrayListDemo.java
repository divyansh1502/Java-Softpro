//WAP to create an ArrayList of user defined object
import java.util.*;

class Person {
    int id; //instance variable
    String name; //instance variable

    Person(int id, String name) { //Constructor
    this.id = id;
    this.name = name;
    }
}


public class arrayListDemo {
    public static void main(String[] args) {
        ArrayList<Person> al = new ArrayList<>();
        al.add(new Person(1, "Divyansh"));
        al.add(new Person(2, "Ajay"));
        al.add(new Person(3, "Rahul"));
        al.add(new Person(4, "Nidhi"));

        System.out.println("List of Person: ");
        for(Person p: al) {
            System.out.println(p.id + "\t" + p.name);
        }
    }
}
