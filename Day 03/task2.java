
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        System.out.print("Enter the number for its table : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " *" + i + " = " + n*i);
        }
    }
}