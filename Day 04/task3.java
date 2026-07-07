
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 10 numbers inside the array : ");

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int even = 0, odd = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                even++;
            }
            else {
                odd++;
            }
        }
        System.out.println("Even numbers : " + even);
        System.out.println("Odd numbers : " + odd);
    }
}
