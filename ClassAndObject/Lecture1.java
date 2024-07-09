package ClassAndObject;

public class Lecture1 {

    public static void main(String[] args) {
        // Dog1
        Dog d1 = new Dog();
        d1.bread = "Beagle";
        d1.size = 50;
        d1.color = "Brownish white";
        d1.bark();
        d1.run();
        System.out.println(d1.bread);
        System.out.println(d1.color);
        System.out.println(d1.size);

        // Dog2
        Dog d2 = new Dog();
        d2.bread = "Dalmation";
        d2.size = 60;
        d2.color = "Black-white";
        d2.bark();
        d2.run();
        System.out.println(d2.bread);
        System.out.println(d2.color);
        System.out.println(d2.size);

        Rectangle r1 = new Rectangle();
        r1.breadth = 5;
        r1.length = 5;
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());

        Rectangle r2 = new Rectangle(2, 5);
        System.out.println(r2.getArea());
        System.out.println(r2.getPerimeter());
    }

}