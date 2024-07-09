package Inheritance;

public class Lecture3 {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.name = "Labrador";
        d.color = "black";

        d.run();
        d.bark();

    }
}

// Parent Class
class Animal {
    String name;

    public void run() {
        System.out.println(name + " is runing");
    }
}

// Child class
class Dog extends Animal {
    String color;

    public void bark() {
        System.out.println(color + " color Dog is barking");
    }
}

// Child class
class Cat extends Animal {
    String pattern;

    public void meow() {
        System.out.println("Meow! Meow!");
    }
}

// Types of Inheritance
// 1-Single Inheritance.
// 2-Multiple Inheritance.
// 3-Multi-Level Inheritance.
// 4-Hierarchical Inheritance.
// 5-Hybrid Inheritance.
