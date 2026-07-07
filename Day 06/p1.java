//WAP  to find sum  of two numbers using user defined methods

import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int b = sc.nextInt();

        int sum = add(a,b); // calling position, a and b are actual position.
        System.out.print("Sum : " + sum);

    }
    static int add(int x, int y) { //method defination, x and y are formal parameter
        return x + y;
    } 
}
