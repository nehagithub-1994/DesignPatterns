package abstractfactory;

import abstractfactory.bank.Bank;
import abstractfactory.loan.Loan;

public abstract class AbstractFactory {
    abstract Bank getBank(String bank);

    abstract Loan getLoan(String loan);
}
