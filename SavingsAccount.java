public class SavingsAccount {

    int balance;

    public SavingsAccount(int initialBalance){
        balance = initialBalance;
    }

    public void checkBalance(){
        System.out.println("Hello!");
        System.out.println("Your balance is "+ balance);
    }

    public void deposit(int amountToDeposit){
        balance += amountToDeposit;
        System.out.println("You just deposited "+ amountToDeposit);
    }
    public int withdraw(int amountToWithdraw){
        balance -= amountToWithdraw;
        System.out.println("You just withdrew "+ amountToWithdraw);
        return amountToWithdraw;
    }

    public String toString()
    {
        return "This is a Bank's saving account with balance "+balance;
    }
    public static void main(String[] args){
        SavingsAccount savings = new SavingsAccount(2000);
        System.out.println(savings);
        //Check balance:
        savings.checkBalance();


        //Withdrawing:
        int afterWithdraw = savings.withdraw(89);

        //Check balance:
        savings.checkBalance();

        //Deposit:
        savings.deposit(1586);

        //Check balance:
        savings.checkBalance();

        //Deposit:
        savings.deposit(1499);

        //Check balance:
        savings.checkBalance();

    }
}