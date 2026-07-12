//WAP to take empid, empname and salary as input and display it.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ExDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int empid;
        String empname;
        double salary;
        System.out.println("Enter Employee ID : ");
        empid = Integer.parseInt(br.readLine());
        System.out.println("Enter Employee name : ");
        empname = br.readLine();
        System.out.println("Enter Employee Salary : ");
        salary = Double.parseDouble(br.readLine());
        System.out.println("Employee Details : ");
        System.out.println("Employee ID : " + empid);
        System.out.println("Employee name : " + empname);
        System.out.println("Employee salary : " + salary);
    }
}