
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers : ");
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int positive= 0, negative = 0, zero = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 0) {
                positive++;
            }
            else if(arr[i] < 0) {
                negative++;
            }
            else {
                zero++;
            }
        }
        System.out.print("Positive Numbers : " + positive + " Negative Numbers : " + negative + " Zeros : " + zero);
    }      
}