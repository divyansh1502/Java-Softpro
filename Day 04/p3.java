
import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter 5 numbers : ");

        for(int i = 0; i < arr.length; i++) {
             arr[i] = sc.nextInt();
        }
        System.out.println("Entered 5 numbers are : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
