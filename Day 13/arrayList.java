import java.util.*;

public class arrayList {
    public static void main(String[] args) {
        ArrayList <Integer> al = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 Numbers: ");
        for (int i = 0; i < 5; i++) {
            int n = sc.nextInt();
            al.add(i,n);
        }
        System.out.println(al);
        Collections.sort(al);
        System.out.println("Smallest Number: " + al.get(0));
        System.out.println("Greatest Number: " + al.get(al.size()-1));

    }
}