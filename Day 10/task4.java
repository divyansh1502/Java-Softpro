public class task4 {
  public static void main(String[] args) {

    try {
        int a = 10/0;
    }
    catch(ArithmeticException a1) {
        System.out.println("Can't divide a number by 0 exception occur : ");
    }
    try {
        int[] arr = {1, 2, 6};
        System.out.println(arr[4]);
    } 
    catch(IndexOutOfBoundsException i1) {
        System.out.println("Can't acces element which does not exist in array");
    }
    try {
        String str = "MMA420";
        int num = Integer.parseInt(str);
            System.out.println(num);
    } 
    catch (NumberFormatException e) {
            System.out.println("Can't convert a string containing letters into a number.");
    }
    finally {
        System.out.println("Finally block is always executed ");
    }
    
  }  
}
