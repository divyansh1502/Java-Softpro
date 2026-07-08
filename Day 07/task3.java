
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int[][] a = new int[3][3];
        int[][] b = new int[3][3];

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
            }
        }
        boolean result = compare(a,b);
        if(result == true) {
            System.out.println("Equal Matrices");
        }
        else {
            System.out.println("Unequal Matrices");
        }

    }
    static boolean compare(int[][] a, int[][] b) {
        if(a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if(a[i].length != b[i].length) {
                return false;
            }
            for (int j = 0; j < a[i].length; j++) {
            if(a[i][j] != b[i][j]) {
                return false;
            }
        }
        }
        
        return true;
    }

}

