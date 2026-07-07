
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.print("Enter 10 Array Elements : ");
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the elements to check its position is even or odd : ");
        int n = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == n) {
                if(i % 2 == 0) {
                    System.out.println("Even Position, " + arr[i] + " is at " + i + " position");
                }
                else {
                    System.out.println("Odd Position, " + arr[i] + " is at " + i + " position");
                }
            }
        }
    }
}
