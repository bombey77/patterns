package Factoty;

public interface PhoneBuilder {

    PhoneBuilder setModel(String model);
    PhoneBuilder setPrice(int price);
    Phone build();
}
