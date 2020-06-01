package AbstractFactory.QATeam;

import AbstractFactory.ITester;

public class SeleniumTester implements ITester {

    @Override
    public void tests() {
        System.out.println("Tester writes test...");
    }
}
