
import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Base : ");
        int b = sc.nextInt();
        System.out.print("Enter the Exponent : ");
        int e = sc.nextInt();

        int result = power(b,e);
        System.out.print("Result : " + result);
    }
    static int power(int x, int y) {
        int result = 1;
        for (int i = 1; i <= y; i++) {
            result *= x;
        }
        return result;
    }
}
//Day 07 task
