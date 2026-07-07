
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Starting Range : ");
        int a = sc.nextInt();
        System.out.print("Enter the Ending Range : ");
        int b = sc.nextInt();

        for (int i = a; i <= b; i++) {
            if(i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

    }
}
