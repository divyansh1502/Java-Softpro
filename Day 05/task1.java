
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String s = sc.next();

        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            s.charAt(i);
            reverse += s.charAt(i);
        }
        System.out.print(reverse);
    }
}
