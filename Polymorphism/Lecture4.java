package Polymorphism;

public class Lecture4 {
    public static void main(String[] args) {
        // Upcasting
        // Parent --> Child (The process of converting a subclass reference to a
        // superclass reference.)

        // DownCasting Child-->Parent (The process of converting a superclass reference
        // to a subclass reference.)
        Animal c = new Cat();
        c.run();

        Dog d = new Dog();
        d.run();
    }

}

// Parent Class
class Animal {
    String name;

    public void run() {
        System.out.println("Animal is runing");
    }
}

// Child class
class Dog extends Animal {
    String color;

    public void run() {
        // The super keyword refers to superclass (parent) objects.
        super.run();
        System.out.println("Dog is running");
    }

    public void bark() {
        System.out.println(color + " color Dog is barking");
    }
}

// Child class
class Cat extends Animal {
    String pattern;

    public void run() {
        System.out.println("Cat is running slow");
    }

    public void meow() {
        System.out.println("Meow! Meow!");
    }
}
