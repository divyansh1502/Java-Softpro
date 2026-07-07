
import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for its factorial : ");
        int a = sc.nextInt();

        int b = fact(a);
        System.out.println("Factorial : " + b); 
    }
    static int fact(int n) {
        if(n == 1 || n == 0) return 1;
        else return n*fact(n-1);
    }
}
