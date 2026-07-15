import java.util.*;

public class treeSet {
    public static void main(String[] args) {
        TreeSet<Integer> hs = new TreeSet<>();
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
