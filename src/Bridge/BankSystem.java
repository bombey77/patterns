package Bridge;

public class BankSystem extends Program {

    public BankSystem(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("developing bank system...");
        getDeveloper().writeCode();
    }
}
