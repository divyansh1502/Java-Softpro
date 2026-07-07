
import java.util.Scanner;

// Fibonacci of nth term
public class task5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the nth term for its Fibo series : ");
        int n = sc.nextInt();

        int a = 1,b = 1;
        System.out.print(a + " " + b + " ");
        if (n == 0 || n == 1) {
            System.out.print("1");
        } 
        else {
            
            for (int i = 3; i <= n; i++) {
                int next = a + b;
                a = b;
                b = next;
                System.out.print(b + " ");

            }
        }
    }
}
