package Bridge;

public abstract class Program {

    private Developer developer;

    public Program(Developer developer) {
        this.developer = developer;
    }

    public Developer getDeveloper() {
        return developer;
    }

    public abstract void developProgram();
}
