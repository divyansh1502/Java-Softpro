import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of square : ");
        int a = sc.nextInt();

        int area = a * a;
        int perimeter = 4 * a;
        System.out.println("Area of square : " + area );
        System.out.print("Perimeter of square : " + perimeter );
    }
}
