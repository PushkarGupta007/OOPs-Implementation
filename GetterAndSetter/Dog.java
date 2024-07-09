package GetterAndSetter;

public class Dog {
    private String bread;
    private int size;
    private String color;

    public void bark() {
        System.out.println(bread + " is barking");
    }

    public void run() {
        System.out.println(color + " color dog is runing");
    }

    // Getter And Setter

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public int getsize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
