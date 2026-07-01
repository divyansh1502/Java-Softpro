//WAP tcheck that the given number is even or odd
import java.util.Scanner;

public class p5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a = sc.nextInt();

        if(a % 2 == 0) {
            System.out.println("Even Number");
        }
        else {
            System.out.println("Odd number");
        }
    }
}
