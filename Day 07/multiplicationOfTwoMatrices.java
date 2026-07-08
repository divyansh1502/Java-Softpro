import java.util.Scanner;

public class multiplicationOfTwoMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][3];
        int[][] arr1 = new int[3][3];
        System.out.println("Enter the value in matrix A : ");
        for(int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }
        System.out.println("Enter the value in matrix B : ");
        for(int row = 0; row < arr1.length; row++) {
            for (int col = 0; col < arr1[row].length; col++) {
                arr1[row][col] = sc.nextInt();
            }
        }
        for(int row = 0; row < arr.length; row++) {
            for(int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] * arr1[col][row] + "   ");
            }
            System.out.println();
        }
    }
}
