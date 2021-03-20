package abstractfactory.bank;

public class HDFC implements Bank{
    @Override
    public String getBankName() {
        return "I am HDFC";
    }
}
