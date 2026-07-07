
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character : ");
        String ch = sc.next().toLowerCase();

        if(ch.length() > 1) {
            System.out.print("Enter only character!");
        }
        else if(ch.equals("a") || ch.equals("e") || ch.equals("i") || ch.equals("o") || ch.equals("u")  ) {
            System.out.print("Input Character is Vowel ");
        }
        else {
            System.out.println("Input Character is Consonant");
        }
    }
}
