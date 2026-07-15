
import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("C");
        al.add("C++");
        al.add("Java");
        al.add("Python");
        al.add("C#"); 
        al.add(2,"PHP"); 
        // System.out.println(al);
        System.out.println("List of programming Languages");
        // for(String p : al) {
        //     System.out.println(p);
        // }
        for(int i = 0; i <al.size(); i++) {
            System.out.println(al.get(i));
        }
        
    }
}
