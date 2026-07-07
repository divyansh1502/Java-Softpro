import java.util.Scanner;
public class p6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Sentence : ");
        String a = sc.nextLine();
        System.out.print("Find what : ");
        String fw = sc.nextLine();
        System.out.print("Replace with : ");
        String rw = sc.nextLine();

        System.out.println("Modified Sentence : " + a.replace(fw,rw));
    }
}

