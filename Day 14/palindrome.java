
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String name = sc.nextLine();
        boolean check = true;

               

        for (int i = 0; i < (int)(name.length() / 2); i++) {
            int n = name.charAt(name.length() - 1);
            if(name.charAt(i) == n) {
                n--;
                continue;
             } else {
                check=true;
             }
    }
    if(check == true) {
        System.out.println("String is Palindrome");
    }
    else {
        System.out.println("Not a palindrome");
    }
    
}
}
