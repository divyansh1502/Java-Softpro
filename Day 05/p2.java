//WAP to take name as inout and use methods

import java.util.*;

public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.nextLine();
        System.out.println("Name in Upper Case: " + name.toUpperCase());
        System.out.println("Name in Lower Case: " + name.toLowerCase());
        System.out.println("Length of name: " + name.length());
    }
}
