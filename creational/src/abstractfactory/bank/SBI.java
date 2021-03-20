package abstractfactory.bank;

public class SBI implements Bank {
    @Override
    public String getBankName() {
        return "I Am SBI";
    }
}
