public class CarLoan {
    /*
    A car loan program that prints out the monthly payment
    Author: Narmadha
    */
    int carLoan = 10000;
    public CarLoan(int loanLength, int interestRate, int downPayment){
        if (loanLength <= 0 || interestRate <=0){
            System.out.println("Error! You must take out a valid car loan.");
        }
        else if (downPayment >= carLoan){
            System.out.println("The car can be paid in full.");
        }
        else{
            int remainingBalance = carLoan - downPayment;
            int months = loanLength * 12;
            int monthlyBalance = remainingBalance / months;
            int interest = monthlyBalance * interestRate/100;
            int monthlyPayment = monthlyBalance + interest;
            System.out.println("Monthly Payment for your Loan: "+monthlyPayment);
        }
    }

    public static void main(String[] args) {

        CarLoan swift = new CarLoan(2, 4, 1500);

    }
}