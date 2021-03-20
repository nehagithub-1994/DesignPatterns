package abstractfactory;

import abstractfactory.bank.Bank;
import abstractfactory.loan.HomeLoan;
import abstractfactory.loan.Loan;
import abstractfactory.loan.PersonalLoan;

public class LoanFactory extends AbstractFactory {

    @Override
    Loan getLoan(String loan) {
        switch (loan) {
            case "home":
                return new HomeLoan();
            case "personal":
                return new PersonalLoan();
            default:
                return null;
        }
    }

    @Override
    Bank getBank(String bank) {
        return null;
    }


}
