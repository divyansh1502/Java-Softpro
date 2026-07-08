public class sumArray {
    public static void main(String[] args) {
        int[] arr = {48, 65, 36, 96, 24, 67, 12, 45, 99, 49};
        System.out.print("Sum of all numbers in Array : " + sum(arr));
    }
    static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
