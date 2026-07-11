//WAP to demostrate the concept of class

class myClass {
    void sayHello(String name) {
        System.out.println("Hello " + name);
    }
}

class creatingClass {
    public static void main(String[] args) {
        myClass obj = new myClass();
        obj.sayHello("Divyansh Singh");
    }
}
