package AbstractFactory.QATeam;

import AbstractFactory.IProgrammer;
import AbstractFactory.IProjectManager;
import AbstractFactory.ITester;

public class QATeamFactory implements IQATeamFactory {

    @Override
    public IProgrammer getProgrammer() {
        return new JavaProgrammer();
    }

    @Override
    public IProjectManager getProjectManager() {
        return new JavaPM();
    }

    @Override
    public ITester getTester() {
        return new SeleniumTester();
    }
}
