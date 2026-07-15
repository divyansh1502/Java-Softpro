
import java.util.*;


public class numberGuessing {
    public static void main(String[] args) {
        int num = (int)(Math.random() * 100) + 1;

        Scanner sc = new Scanner(System.in);
        
        boolean guessed;

        for (int i = 1; i <= 5; i++) {
    System.out.print("Attempt " + i + " - Enter a number between 1 and 100: ");

    System.out.println("Enter a number between 1 to 100: ");
    int target = sc.nextInt();

    if (target > num) {
        System.out.println("Number is too big");
    } else if (target < num) {
        System.out.println("Number is too small");
    } else {
        System.out.println("Great!! You guessed the right number.");
        guessed = true;
        break;
    }
}       if(guessed = true) {
            System.out.println("Random number is : " + num);
        }
    }
}
