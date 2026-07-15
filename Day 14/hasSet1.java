//WAP to demonstrate the concept of LinkedHashSet
import java.util.*;

public class hasSet1 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> hs = new LinkedHashSet<>();
        hs.add(10);
        hs.add(50);
        hs.add(30);
        hs.add(80);
        hs.add(10);
        System.out.println("Elements of HashSet: ");
        for(Integer num : hs) {
            System.out.println(num);
        }
    }
}
