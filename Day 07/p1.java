//WAP to find sum of two matrices

import java.util.*;

public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] a = new int[3][3];
        int [][] b = new int[3][3];
        int [][] c = new int[3][3];

        System.out.println("Enter matrix A of 3*3");
            for (int row = 0; row < a.length; row++) {
                for (int col = 0; col < a[row].length; col++) {
                    a[row][col] = sc.nextInt();
                }
            }
        System.out.println("Enter matrix B of 3*3");
            for (int row = 0; row < a.length; row++) {
                for (int col = 0; col < b[row].length; col++) {
                    b[row][col] = sc.nextInt();
                    c[row][col] = a[row][col] + b[row][col];
                }
            }
            System.out.println("Sum of two matrix : ");
            for (int row = 0; row < a.length; row++) {
                for (int col = 0; col < a[row].length; col++) {
                    System.out.print(c[row][col] + "      ");
                }
                System.out.println();
            }

    }
}
