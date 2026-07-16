
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        String revstr = "";       

        for (int i = str.length()-1; i >= 0; i--) {
            revstr += str.charAt(i);
        }
    if(str.equals(revstr)) {
        System.out.println("String is Palindrome");
    }
    else {
        System.out.println("Not a palindrome");
    }
    
}
}
