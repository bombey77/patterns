package Factoty;

public class PhoneBuilderImpl implements PhoneBuilder {

    Phone phone = new Phone();

    @Override
    public PhoneBuilder setModel(String model) {
        phone.setModel(model);
        return this;
    }

    @Override
    public PhoneBuilder setPrice(int price) {
        phone.setPrice(price);
        return this;
    }

    @Override
    public Phone build() {
        return phone;
    }
}
