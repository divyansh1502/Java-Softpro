import java.util.*;

public class task2 {
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
        int even = 0;
        int odd = 0;
        for(Integer a: al) {
            if(a % 2 == 0) {
                even++;
            }
            else {
                odd++;
            }
        }
        System.out.println("Even: " + even);

        System.out.println("Odd: " + odd);
        

    }
}