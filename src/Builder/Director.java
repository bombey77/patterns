package Builder;

public class Director {

    PhoneBuilder phoneBuilder;

    public void setPhoneBuilder(PhoneBuilder phoneBuilder) {
        this.phoneBuilder = phoneBuilder;
    }

    public Phone buildPhone() {
        phoneBuilder.createPhone();
        phoneBuilder.setModel();
        phoneBuilder.setPrice();
        Phone phone = phoneBuilder.getPhone();
        return phone;
    }
}
