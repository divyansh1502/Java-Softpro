
class overload {
    int add(int a, int b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
    double add(double a, double b) {
        return a + b;
    }
}

public class task2 {
    public static void main(String[] args) {
        overload a = new overload();
        int x = a.add(2,5);
        System.out.println(x);
        int y = a.add(2,5, 6);
        System.out.println(y);
        double z = a.add(12.0,5.0);
        System.out.println(z);
    }
}
