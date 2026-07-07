
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of minutes : ");
        int n = sc.nextInt();

        int result = minCal(n);

        System.out.println("Cost of " + n + " minutes is : " + result);
    }
    static int minCal(int a) {
        int money = 0;
        if(a <= 50) {
            return 0;
        }
        else if (a > 50 && a <= 100) {
            money = a - 50;
        }
        else {
            money = 100 + (a-100)*2 - 50;
        }
        return money;
    }
}
