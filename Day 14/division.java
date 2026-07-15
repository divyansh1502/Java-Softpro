
import java.util.InputMismatchException;
import java.util.Scanner;



public class division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
           System.out.println("Enter 1st number: ");
        double a = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        double b = sc.nextInt();

        double result = a/b; 

        System.out.println("Answer: " + result);
        } catch (ArithmeticException e) {
            System.out.println("You cannot divide a number by 0");
        }
        catch(InputMismatchException e1) {
            System.out.println("Enter only numeric values");
        }
        
    }
}
