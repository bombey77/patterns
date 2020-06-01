package test;

public abstract class Room {

    private ILamp lamp;

    public Room(ILamp lamp) {
        this.lamp = lamp;
    }

    public ILamp getLamp() {
        return lamp;
    }

    public abstract void on();

    public abstract void off();
}
