public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber,double initialBalance){
        this.balance = initialBalance;
        this.accountNumber = accountNumber;
    }
    public void deposit (double amount) throws InvalidAmountException{
        if(amount<=0){
            throw new InvalidAmountException("Invalid deposit amount: " + amount);
        }
        balance += amount;
        System.out.println("Depositing $" + amount);
        System.out.println("New balance: $" + balance);
    }
    public void withdraw( double amount ) throws InvalidAmountException,InsufficientFundsException{
        if(amount<=0){
            throw new InvalidAmountException("Invalid deposit amount: " + amount);
        }
        if (amount >balance){
            throw new InsufficientFundsException("Insufficient funds for withdrawal: " + amount);
        }
        balance -= amount;
        System.out.println("Withdrawing $" + amount);
        System.out.println("New balance: $" + balance);
    }
    public double getBalance() {
        return balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
}
