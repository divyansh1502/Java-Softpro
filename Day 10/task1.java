
class Employee {
    void calculateSalary() {
        System.out.println("Salary Calculator");
    }
}
class Manager extends Employee {
    void calculateSalary() {
        System.out.println("Manager Salary : 80,000");
    }
}
class Developer extends Employee {
    void calculateSalary() {
        System.out.println("Developer salary : 60,000");
    }
}
class Intern extends Employee {
    void calculateSalary() {
        System.out.println("Intern Salary :35,000");
    }
}

public class task1 {
    public static void main(String[] args) {
        
        Employee e1 = new Manager();
        e1.calculateSalary();

        e1 = new Developer();
        e1.calculateSalary();

        e1 = new Intern();
        e1.calculateSalary();
    }
}
