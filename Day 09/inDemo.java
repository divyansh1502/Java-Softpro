//WAP to demostrate concept of inheritance 

class runDog {
    void bark() {
        System.out.println("Sheruuuuu!!!!");
        System.out.println("Bhau.... Bhau....");
    }
}
class bulldog extends runDog {
    void growl() {
        System.out.println("Tuffy..");
        System.out.println("Gurr.. gurr..");
    }
}
class inDemo {
    public static void main(String[] args) {
        bulldog dog = new bulldog();
        dog.bark();
        dog.growl();
    }
}