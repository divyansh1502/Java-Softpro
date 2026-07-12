//WAP to demonstrtae the concept of Interface

interface myInterface {
    void m1(); //public abstract void m1();
    void m2(); //public abstract void m2();
}
class testInterface  implements myInterface{
    public void m1() {
        System.out.println("M1() Executed");
    }
    public void m2() {
        System.out.println("M2() Executed");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        testInterface ti = new testInterface();
        ti.m1();
        ti.m2();
    }
}
