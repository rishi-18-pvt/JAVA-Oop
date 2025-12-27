package Encapsulation;
class Account{
    private int AccountNumber;
    private double BankBalance;

    public int getAccountNumber(){
        return AccountNumber;
    }
    public void setAccountNumber(int AccountNumber){
        this.AccountNumber = AccountNumber;
    }
    public double getBankBalance(){
        return BankBalance;
    }
    public void setBankBalance(double BankBalance){
        this.BankBalance = BankBalance;
    }
}

public class Bank {
    public static void main(String[] args) {
        Account ac = new Account();
        ac.setAccountNumber(234567890);
        ac.setBankBalance(345.0);
        System.out.println("Account Number: "+ac.getAccountNumber());
        System.out.println("Bank Balance: "+ac.getBankBalance());
    }
}
