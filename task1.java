class Animal {
    void sound() {
        System.out.println("Animal Class");
    }
}
class Dog extends Animal {
    void sound() {
        System.out.println("Bark...");
    }
}
class Cat extends Animal {
    void sound() {
        System.out.println("Meoww...");
    }
}
class Cow extends Animal {
    void sound() {
        System.out.println("Mooo...");
    }
}

public class task1 {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
        Animal b = new Cat();
        b.sound();
        Animal c = new Cow();
        c.sound();
    }
}