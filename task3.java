
class calculator {
    int add(int a, int b) {
        return a + b;
    }
    double add(double a, double b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
    
}

public class task3 {
    public static void main(String[] args) {
        calculator a = new calculator();

        int x = a.add(10, 45);
        System.out.println(x);
        double y = a.add(12.0,5.0);
        System.out.println(y);
        int z = a.add(2,5, 6);
        System.out.println(z);
        
    }
}
