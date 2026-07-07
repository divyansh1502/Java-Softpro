
/*
How to take input from user in java?
You can use Scanner class object to take input from user in java.
Scanner is a class available in java.util package.

Package:- A package in Java is a way to group related classes, interfaces, enums, and sub-packages together.
*/
// for integer type varibale(int) input we use nextInt().
//for double type varibale sc.nextDouble();
//for float type varibale sc.nextFloat();
//for String type varibale sc.nextLine();



import java.util.Scanner;
public class p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your 1st number : ");
        int a = sc.nextInt();
        System.out.print("Enter your 2nd number : ");
        int b = sc.nextInt();
        int c = a + b;
        System.out.print("The sum of " + a + " and " + b + " is : "  + c);

    }
}
