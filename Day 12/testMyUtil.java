import java.util.Scanner;
import mypack.pack1.myUtil;

public class testMyUtil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        myUtil m = new myUtil();
        System.out.println("Enter 1st number");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number");
        int b = sc.nextInt();
        int sum = m.add(a, b);
        int g = m.greatest(a, b);
        System.out.println("Sum: " + sum);
        System.out.println("Greatest: " + g);
    }
}
