package abstractfactory;

import abstractfactory.bank.Bank;
import abstractfactory.loan.Loan;

import javax.print.Doc;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Operate {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        System.out.println("Enter the bank you would like to take loan from:");
        String bankname = scanner.nextLine();
        System.out.println("Enter the type of loan you wish to take");
        String loan = scanner.nextLine();
        AbstractFactory abstractFactory = GetMeFactory.getFactory("Bank");
        Bank bank = abstractFactory.getBank(bankname);
        System.out.println("Enter the intrest rate for" + bank.getBankName());
        Double rate = Double.parseDouble(scanner.nextLine());
        System.out.print("\n");
        System.out.print("Enter the loan amount you want to take: ");

        double loanAmount=Double.parseDouble(scanner.nextLine());
        System.out.print("\n");
        System.out.print("Enter the number of years to pay your entire loan amount: ");
        int years=Integer.parseInt(scanner.nextLine());

        System.out.print("\n");
        System.out.println("you are taking the loan from "+ bank.getBankName()+"for years"+years);

        AbstractFactory loanFactory = GetMeFactory.getFactory("Loan");
        Loan l=loanFactory.getLoan(loan);
        l.getInterestRate(rate);
        l.calculateLoanPayment(loanAmount,years);


    }
}
