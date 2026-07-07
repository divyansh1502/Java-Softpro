//WAP to find the greatest b/w two number
import java.util.Scanner;

public class p2 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the 1st  number : ");
    int a = sc.nextInt();
    System.out.print("Enter the 2nd  number : ");
    int b = sc.nextInt();

    p2 obj = new p2();
    int c = obj.greatest(a, b);
    System.out.print("Greatest : " + c);
   } 
   int greatest(int x, int y) {
      if(x>y) {
        return x;
      }
      else {
        return y;
      }
   }
}
