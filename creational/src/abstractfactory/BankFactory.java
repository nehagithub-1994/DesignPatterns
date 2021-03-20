package abstractfactory;

import abstractfactory.bank.Axis;
import abstractfactory.bank.Bank;
import abstractfactory.bank.HDFC;
import abstractfactory.bank.SBI;
import abstractfactory.loan.Loan;

import java.util.Locale;

public class BankFactory extends AbstractFactory{

    Bank getBank(String name) {
        switch (name.toLowerCase(Locale.ROOT)) {
            case "hdfc":
                return new HDFC();
            case "axis":
                return new Axis();
            case "sbi":
                return new SBI();
            default:
                return null;
        }
    }

    @Override
    Loan getLoan(String loan) {
        return null;
    }
}
