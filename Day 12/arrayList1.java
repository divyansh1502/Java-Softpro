import java.util.*;

public class arrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(15);
        al.add(48);
        al.add(68);
        al.add(02);
        al.add(46);
        al.add(33);
        al.add(17);
        System.out.println("Original List " + al);
        Collections.sort(al);
        System.out.println("List in asc order: " + al);
        Collections.reverse(al);
        System.out.println("List in desc order: " + al);
    }
}
