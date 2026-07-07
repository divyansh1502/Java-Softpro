
import java.util.Scanner;

//WAP to craete an array of 5 numbers b y user iout and fint sum of number
public class p4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 5 numbers for sum : ");

        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("The sum of 5 numbers is : " + sum);
    }
}
