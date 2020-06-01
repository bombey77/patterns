package Builder;

public class iPhoneBuilder extends PhoneBuilder {

    @Override
    public void setModel() {
        phone.setModel("iPhone");
    }

    @Override
    public void setPrice() {
        phone.setPrice(999);
    }
}
