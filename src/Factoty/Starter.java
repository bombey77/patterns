package Factoty;

public class Starter {

    public static void main(String[] args) {
        Phone phone = new PhoneBuilderImpl()
                .setModel("iPhone")
                .setPrice(999)
                .build();

        System.out.println(phone.getModel());
        System.out.println(phone.getPrice());
    }
}
