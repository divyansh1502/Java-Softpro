//WAp to demonstrate  the concept of class with variables and methods 

class employee {
    int empid;
    String empname;
    double salary;
    void setValue(int eid, String ename, double sal) {
        empid = eid;
        empname = ename;
        salary = sal; 
    }
    void display() {
        System.out.println("Employee id : " + empid);
        System.out.println("Employee Name : " + empname);
        System.out.println("Employee salary : " + salary);
    }
}
class classDemo2 {
    public static void main(String[] args) {
        employee e1 = new employee();
        e1.setValue(1001, "Shivam", 80000);
        e1.display();
        employee e2 = new employee();
        e2.setValue(1002, "Divyansh", 60000);
        e2.display();
    }
}

