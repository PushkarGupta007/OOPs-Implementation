package GetterAndSetter;

public class Lecture2 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.setBread("Beagle");
        d.setSize(40);
        d.setColor("brownish-white");

        System.out.println(d.getBread());
        System.out.println(d.getColor());
        System.out.println(d.getsize());

    }

}
