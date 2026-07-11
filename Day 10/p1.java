//WAP a program to demonstrate the concept of method overriding

class X {
    void m1() {
        System.out.println("m1 of X");
    }
    void m2() {
        System.out.println("m2 of X");
    }
}
class Y extends X {
    void m1() {
        System.out.println("m1 of Y");
    }
    void m3() {
        System.out.println("m3 of Y");
    }
}

public class p1 {
    public static void main(String[] args) {
        
        X x = new X();
        x.m1();
        x.m2();

        Y y = new Y();
        y.m1();
        y.m2();
        y.m3();
    }
}
