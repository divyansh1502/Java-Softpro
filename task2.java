
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number : ");
        int a = sc.nextInt();
        System.out.print("Enter the 2nd number : ");
        int b = sc.nextInt();

        if(a>b) {
            System.out.print(a + " is greatest");
        }
        else if(a<b) {
            System.out.print(b + " is greatest");
        }
        else {
            System.out.print("Both are equal");
        }
    }
}
