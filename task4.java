import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Principle : ");
        float p = sc.nextInt(); 
        System.out.print("Enter the Rate : ");
        int r = sc.nextInt(); 
        System.out.print("Enter the Time : ");
        float t = sc.nextInt(); 

        float si = (p * r * t)/100;

        System.out.print("Simple Interest : " + si);
    }
}
