package test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Runner {

    int x = 0;

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Roman");
        list.add("Kathy");
        Stream<String> stringStream = list.stream();


        Runner runner = new Runner();
        runner.print(runner.x);
        runner.print(runner.x);
    }

    private void print(int x) {
        x = 12;
        this.x = 23;
        System.out.println(this.x);
    }
}
