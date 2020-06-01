package test;

public class Kitchen extends Room {

    public Kitchen(ILamp lamp) {
        super(lamp);
    }

    @Override
    public void on() {
        System.out.println("begin");
        getLamp().shy();
    }

    @Override
    public void off() {
        getLamp().down();
        System.out.println("ending");
    }
}
