
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        int sum = 0;

        while(n > 0) {
            int ld = n % 10;           
            n = n / 10;
            sum = (sum + ld)*10;
        }
        sum = sum / 10;
        System.out.println(sum);
    }
}
