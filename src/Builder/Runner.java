package Builder;

public class Runner {

    public static void main(String[] args) {
        Director director = new Director();
        director.setPhoneBuilder(new iPhoneBuilder());
        Phone iPhone = director.buildPhone();

        System.out.println(iPhone.getModel());
        System.out.println(iPhone.getPrice());
    }
}
