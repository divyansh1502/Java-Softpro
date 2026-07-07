//WAP to compare two string for equality

import java.util.*;
public class p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st String : ");
        String str1 = sc.nextLine();
        System.out.print("Enter the 2nd String : ");
        String str2 = sc.nextLine();
        if(str1.equals(str2)) {
            System.out.println("Both Strings are equal");
        }
        else {
            System.out.println("Both Strings are not equal");
        }
    }
    
}
