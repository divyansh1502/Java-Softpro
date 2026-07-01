import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length : ");
        int l = sc.nextInt();
        System.out.print("Enter breadth : ");
        int b = sc.nextInt();
        System.out.print("Enter height : ");
        int h = sc.nextInt();

        int vol = l*b*h;

        System.out.print("Volume of Cubiod is : " + vol);
    }
}