
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        System.out.print("Enter the number to check the number is Prime or not : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if(n%i==0) {
                count++;
            } 
        }
        if(count==2) {
            System.out.print("Prime number");
        }
        else {
            System.out.print("Not prime");
        }
    }
}
