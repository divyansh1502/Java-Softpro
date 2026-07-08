
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int[][] a = new int[3][3];
        int[][] b = new int[3][3];
        int[][] c = new int[3][3];

        System.out.print("Enter Matrix A : ");
        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < a.length; col++) {
                a[row][col] = sc.nextInt();
            }
        }
        System.out.print("Enter Matrix B : ");       
        for (int row = 0; row < b.length; row++) {
            for (int col = 0; col < a.length; col++) {
                b[row][col] = sc.nextInt();
                c[row][col] = a[row][col] - b[row][col];
            }
        }
        System.out.println("Subtraction of Matrix A and Matrix B is : : ");       
        for (int row = 0; row < c.length; row++) {
            for (int col = 0; col < c.length; col++) {
                System.out.print(c[row][col]);
            }
            System.out.println();
        }

    }
}
