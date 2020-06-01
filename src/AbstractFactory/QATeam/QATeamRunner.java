package AbstractFactory.QATeam;

import AbstractFactory.IProgrammer;
import AbstractFactory.IProjectManager;
import AbstractFactory.ITester;

public class QATeamRunner {

    public static void main(String[] args) {
        IQATeamFactory qaTeamFactory = new QATeamFactory();
        IProjectManager javaPM = qaTeamFactory.getProjectManager();
        IProgrammer javaProgrammer = qaTeamFactory.getProgrammer();
        ITester seleniumTester = qaTeamFactory.getTester();

        System.out.println("Project is starting...");
        javaPM.leadProject();
        javaProgrammer.writeCode();
        seleniumTester.tests();
    }
}
