
import java.util.*;


//WAP to demonstrate concept of hierarchical Inheritance
class shape {
    int s;
    void setValue(int side) {
        s = side;
    }
}
class square extends shape {
    int area() {
        return s * s; 
    }
}
class cube extends shape {
    int volume() {
        return s * s * s; 
    }
}

public class inDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        square sq = new square();
        System.out.print("Enter the side : ");
        int s = sc.nextInt();
        sq.setValue(s);
        int a = sq.area();
        System.out.println("Arae of Square : " + a); 

        cube cu = new cube();
        System.out.print("Enter the side : ");
        int n = sc.nextInt();
        cu.setValue(n);
        int v = cu.volume();
        System.out.println("Volume of Cube : " + v); 
    }
    
}

