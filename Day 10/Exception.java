//WAP to find division of two numbers

import java.util.*;

public class Exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter 1st number: ");
            int x = sc.nextInt();
            System.out.println("Enter 2nd number: ");
            int y = sc.nextInt();

            int z = x / y;
            System.out.println("Result: " + z);
        } catch (InputMismatchException Ex1) {
            System.out.println("Enter numbers only!!");
            
        } catch (ArithmeticException Ex2) {
            System.out.println("you can't divide a number by 0");
        }

    }
}
