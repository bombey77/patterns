package test;

public class HotLamp implements ILamp {

    @Override
    public void shy() {
        System.out.println("Hot lamp is shyning...");
    }

    @Override
    public void down() {
        System.out.println("Hot lamp is shutting...");
    }
}
