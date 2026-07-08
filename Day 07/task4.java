
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][3];
        System.out.print("Enter the value in matrix : ");
        for(int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr.length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }
        for(int row = 0; row < arr.length; row++) {
            for(int col = 0; col < arr.length; col++) {
                System.out.print(arr[col][row] + "    ");
            }
            System.out.println();
        }
    }
}
