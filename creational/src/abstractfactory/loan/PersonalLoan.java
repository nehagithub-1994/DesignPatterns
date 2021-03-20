package abstractfactory.loan;

public class PersonalLoan extends Loan{
    @Override
    public void getInterestRate(double rate) {
        rate = 4.5;
    }
}
