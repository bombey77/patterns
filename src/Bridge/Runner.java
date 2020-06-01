package Bridge;

public class Runner {

    public static void main(String[] args) {
        Program[] programs = new Program[] {
                new BankSystem(new JavaDeveloper()),
                new ShopSystem(new CppDeveloper())
        };

        for (Program program : programs) {
            program.developProgram();
        }
    }
}
