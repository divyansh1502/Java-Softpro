public class findMin {
    public static void main(String[] args) {
        int[] arr = {44, 25, 87, 96, 63, 12, 34, 57, 75, 67};
        System.out.print("Maximum element : " + min(arr));
    }
    static int min(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
