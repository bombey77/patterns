package AbstractFactory.QATeam;

import AbstractFactory.IProjectManager;

public class JavaPM implements IProjectManager {

    @Override
    public void leadProject() {
        System.out.println("PM leads team...");
    }
}
