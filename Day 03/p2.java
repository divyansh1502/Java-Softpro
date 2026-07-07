//WAP tp find the factorial of the given number

import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find factorial: ");
        int n = sc.nextInt();
        int f = 1;
        while(n > 0) {
            f = f * n;
            n--;           
        }
        System.out.println("factorial: " +f);
         
    }
}
