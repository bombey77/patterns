package Builder;

public abstract class PhoneBuilder {

    Phone phone;

    public void createPhone() {
        phone = new Phone();
    }

    abstract void setModel();
    abstract void setPrice();

    public Phone getPhone() {
        return phone;
    }
}
