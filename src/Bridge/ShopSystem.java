package Bridge;

public class ShopSystem extends Program {

    public ShopSystem(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("developing shop system...");
        getDeveloper().writeCode();
    }
}
