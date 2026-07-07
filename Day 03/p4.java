//WAP to print even numbers from 1 to 100

public class p4 {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            if(i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}