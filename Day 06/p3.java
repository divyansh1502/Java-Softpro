//WAP to find the greatest b/w two number
import java.util.Scanner;

public class p3 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the 1st  number : ");
    int a = sc.nextInt();
    System.out.print("Enter the 2nd  number : ");
    int b = sc.nextInt();
    System.out.print("Enter the 3rd  number : ");
    int c = sc.nextInt();

    int d = greatest(a,b,c);
    System.out.print("Greatest : " + d);
   } 
   static int greatest(int x, int y, int z) {
      if(x>y && x>z) {
        return x;
      }
      else if(y>x && y>z) {
        return y;
      }
      else {
        return z;
      }
   }
}
