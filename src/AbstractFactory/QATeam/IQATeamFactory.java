package AbstractFactory.QATeam;

import AbstractFactory.IProgrammer;
import AbstractFactory.IProjectManager;
import AbstractFactory.ITester;

public interface IQATeamFactory {

    IProgrammer getProgrammer();

    IProjectManager getProjectManager();

    ITester getTester();
}
