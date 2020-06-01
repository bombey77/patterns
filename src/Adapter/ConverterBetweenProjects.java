package Adapter;

public class ConverterBetweenProjects extends MySqlConnector implements DataBase {

    @Override
    public void insert() {
        insertObject();
    }

    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void select() {
        selectObject();
    }

    @Override
    public void delete() {
        deleteObject();
    }
}
