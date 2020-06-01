package Adapter;

public class Runner {

    public static void main(String[] args) {
        ConverterBetweenProjects converter = new ConverterBetweenProjects();
        converter.insert();
        converter.update();
        converter.select();
        converter.delete();
    }
}
