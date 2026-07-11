class figure {
    int area(int s) {
        return s * s;
    }
    int area(int l, int b) {
        return l * b;
    }
    double area(double r) {
        return 3.14 * r * r;
    }
}

public class overLoadingDemo {
    public static void main(String[] args) {
        figure f = new figure();
        int a = f.area(15); 
        System.out.println("Area of Square : " + a);
        int b = f.area(15, 4); 
        System.out.println("Area of Rectangle` : " + b);
        double c = f.area(5.0); 
        System.out.println("Area of Circle : " + c);
    }
}
