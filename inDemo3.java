//WAP to demostrate concept of multi-level Inheritance
class  A{
    void showA() {
        System.out.println("This message from class A");
    }
}
class B extends A {
    void showB() {
        System.out.println("This message from class B");
    }
} 
class C extends B {
    void showC() {
        System.out.println("This message from class C");
    }
}


public class inDemo3 {
    public static void main(String[] args) {
        C c = new C();
        c.showA();
        c.showB();
        c.showC();
    }
}
