public class findMax {
    public static void main(String[] args) {
        int[] arr = {44, 25, 87, 96, 63, 12, 34, 57, 75, 67};
        System.out.print("Maximum element : " + max(arr));
    }
    static int max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
