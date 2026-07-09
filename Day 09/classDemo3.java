//WAP to demonstrate the concept of constructor
//this:- this is a keyword refers the object of current class

class student {
    int rollno;
    String name;
    student(int rollno, String name) { //Constructor
        this.rollno = rollno;
        this.name = name;
    }
    void display() {
        System.out.println("Roll no:- " + this.rollno);
        System.out.println("Name :- " + this.name);
    }
}
class classDemo3 {
    public static void main(String[] args) {
        student s1 = new student(1001, "Vikram");
        student s2 = new student(1002, "Satyam");
        s1.display();
        s2.display();
    }
}
