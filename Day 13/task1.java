import java.util.*;

public class task1 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(48);
        al.add(75);
        al.add(49);
        al.add(78);
        al.add(50);
        al.add(23);
        al.add(13);
        int sum = 0;
        for(Integer a: al) {
            sum += a;
        }
        System.out.println("Sum: " + sum);
        int avg;
        avg = sum / al.size();
        System.out.println("Average: " + avg);
        

    }
}