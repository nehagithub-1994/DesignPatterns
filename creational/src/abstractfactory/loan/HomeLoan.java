package abstractfactory.loan;

public class HomeLoan extends Loan{
    @Override
    public void getInterestRate(double rate) {
        rate = 2.5;
    }

    public static void main(String[] args) {
        HomeLoan h = new HomeLoan();
        h.calculateLoanPayment(500000,10);
    }
}
