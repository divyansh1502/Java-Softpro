
class Bank {
    void getInterestRate() {
        System.out.println("Interest Rate Calculator");
    }
}
class SBI extends Bank {
    void getInterestRate() {
        System.out.println("SBI Interest Rate");
    }
}
class HDFC extends Bank {
    void getInterestRate() {
        System.out.println("HDFC Interest Rate");
    }
}
class ICICI extends Bank {
    void getInterestRate() {
        System.out.println("ICICI Interest Rate");
    }
}

public class task2 {
    public static void main(String[] args) {
        
        Bank b;

        b = new SBI();
        b.getInterestRate();

        b = new HDFC();
        b.getInterestRate();

        b = new ICICI();
        b.getInterestRate();
    }
}
