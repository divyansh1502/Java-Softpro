
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sentence : ");
        String s = sc.nextLine();

        System.out.println("Modified Sentence : " + s.replace(" ", "_"));
    }
}
