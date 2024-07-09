// Interface can only contain the abstract method.

package Interface;

public class Lecture6 {
    public static void main(String[] args) {
        Remote remote = new Television();
        remote.volumeUp();
        remote.volumeDown();
        remote.powerOn();
        remote.powerOff();

    }

}

interface Remote {

    abstract public void volumeUp();

    abstract public void volumeDown();

    abstract public void powerOn();

    abstract public void powerOff();
}

class Television implements Remote {

    @Override
    public void volumeUp() {
        System.out.println("Turn the Volume up");
    }

    @Override
    public void volumeDown() {
        System.out.println("Turn the Volume Down");
    }

    @Override
    public void powerOn() {
        System.out.println("Power On");

    }

    @Override
    public void powerOff() {
        System.out.println("Power Off");

    }

}