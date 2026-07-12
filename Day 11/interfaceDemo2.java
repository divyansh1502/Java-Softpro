//First Meeting
interface School {
    void registration();
    void feeSubmission();
    void batchAllotment();
}
//Second Meeting
abstract class test1 implements School {
    public void registration() {
        System.out.println("Logic of registration");
    }
}
//Third Meeting
abstract class test2 extends test1 {
    public void feeSubmission() {
        System.out.println("Logic of fee submission");
    }
}
//Fourth Meeting
class test3 extends test2 {
    public void batchAllotment() {
        System.out.println("Logic of batchAllotment");
    }
}
public class interfaceDemo2 {
    public static void main(String[] args) {
        test3 t = new test3();
        t.registration();
        t.feeSubmission();
        t.batchAllotment();
    }
}
