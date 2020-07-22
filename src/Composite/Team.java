package Composite;

import java.util.ArrayList;
import java.util.List;

public class Team implements Developer {

    private List<Developer> components = new ArrayList<>();

    public void removeComponent(Developer developer) {
        components.remove(developer);
    }

    public void addComponent(Developer component) {
        components.add(component);
    }

    @Override
    public void writeCode() {
        components.forEach(Developer::writeCode);
    }
}
