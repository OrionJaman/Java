public class main {
    public static  void main(String[] args){
        BankAccount account = new BankAccount("123456789c",100.00);

       try{
           account.deposit(50.0);
           System.out.println("Attempting to withdraw $200.0");
           account.withdraw(200.0);
       }
       catch (InsufficientFundsException e){
           System.out.println(e.getMessage());
       }
       catch (InvalidAmountException e) {
           System.out.println(e.getMessage());
       }
        try {
            System.out.println("Attempting to withdraw $50.0");
            account.withdraw(50.0);

        }
        catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
        catch (InvalidAmountException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Attempting to deposit -$10.0");
            account.deposit(-10.0);

        }
        catch (InvalidAmountException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Final balance: $" + account.getBalance());
            System.out.println("End of transaction.");
        }
    }
}
