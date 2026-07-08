public class averageArray {
    public static void main(String[] args) {
        int[] arr = {48, 65, 36, 96, 24, 67, 12, 45, 99, 49};
        System.out.print("Average of all numbers in Array : " + avg(arr));
    }
    static int avg(int[] arr) {
        int sum = 0;
        int avg = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        avg = sum / arr.length;
        return avg;
    }
}
