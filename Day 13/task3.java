
import java.util.*;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter target number for its frequency : ");
        int n = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        al.add(25);
        al.add(25);
        al.add(13);
        al.add(25);
        al.add(47);
        al.add(85);
        al.add(75);
        al.add(14);
        al.add(25);
        al.add(17);
        int count = 0;
        for(Integer a:al) {
            if(n == a) {
                count++;
            }
        }
                    System.out.println("Frequency of target number is : " + count);

    }
}
