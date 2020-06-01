package test;

public class LedLamp implements ILamp {

    @Override
    public void shy() {
        System.out.println("Led lamp is shyning...");
    }

    @Override
    public void down() {
        System.out.println("Hot lamp is shutting...");
    }
}
