
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 10 number in array : \n");

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target number : ");
        int target = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                found = true;
                System.out.print("Found at index : " + i);
                break;
            }
    }
    if(!found) {
        System.out.print("Not found");
    }
}
}
