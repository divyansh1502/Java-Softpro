
public class task3 {
    public static void main(String[] args) {
        
        int[] arr = {5, 4, 9, 8, 3};
        try {
        for (int index = 0; index <= arr.length; index++) {
            System.out.println(arr[index]);
        }
        }
        catch(ArrayIndexOutOfBoundsException e1) {
            System.out.println("You are accesing element outside of an array exception occur : " + e1);
        }
    }
}
