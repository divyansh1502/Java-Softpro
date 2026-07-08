
import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {45, 65, 25, 87, 69, 94, 26, 10, 364, 45};

        System.out.print("Enter the target : ");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        find(arr, target);
    }
    static void find(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                System.out.print("Target found at index : " + i);
                return;
            }
            
        }
        System.out.println("Target not found");
    }
}
