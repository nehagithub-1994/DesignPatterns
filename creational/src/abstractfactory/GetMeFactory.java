package abstractfactory;

public class GetMeFactory {

    public static AbstractFactory getFactory(String factory) {
        if (factory.equalsIgnoreCase("bank")) {
            return new BankFactory();
        } else {
            return new LoanFactory();
        }
    }
}
