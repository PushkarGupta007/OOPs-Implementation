// Rules for abstract keyword
// Abstract class a class is declared by using abstract keyword, we cannot create object of the abstract class,It may or may not contain the object.
//An abstract method belongs to an abstract class, and it does not have a body. The body is provided by the subclass.

package Abstract;

public class Lecture5 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.name = "Labrador";
        d.run();
    }

}

abstract class Animal {
    String name;

    abstract public void run();
}

// Child class
class Dog extends Animal {
    String color;

    @Override // We write this so that compiler knows that we have override the method.
    public void run() {

        System.out.println(name + " is running");
    }

    public void bark() {
        System.out.println(color + " color Dog is barking");
    }
}
