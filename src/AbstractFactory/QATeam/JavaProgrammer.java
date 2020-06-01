package AbstractFactory.QATeam;

import AbstractFactory.IProgrammer;

public class JavaProgrammer implements IProgrammer {

    @Override
    public void writeCode() {
        System.out.println("Java programmer writes code...");
    }
}
