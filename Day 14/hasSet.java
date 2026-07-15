
import java.util.HashSet;

//WAP to understand the concept of HashSet.


public class hasSet {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
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
