
import java.util.*;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> al = new ArrayList<>();
        System.out.print("Enter the size of ArrayList: ");
        int size = sc.nextInt();
        System.out.println("Enter the elements of ArrayList: ");
        for (int i = 0; i < size; i++) {
            int n = sc.nextInt();
            al.add(i, n);
        }
        System.out.print("Enter target number for its frequency : ");
        int n = sc.nextInt();
        int count = 0;
        for(Integer a:al) {
            if(n == a) {
                count++;
            }
        }
                    System.out.println("Frequency of target number is : " + count);

    }
}
