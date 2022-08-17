
public class CreditAccount extends AbstractBankAccount{

    private int creditLimit;

    //default constructor for CreditAccount
    CreditAccount(String name, int num, int amt){
        super(name, num, amt);
        this.creditLimit=calculateCreditLimit(amt);
    }
    //overloaded constructor for CreditAccount
    CreditAccount(String name, int num,int amt,int credit)
    {
        super(name,num,amt);
        this.creditLimit=credit;
    }

    public static int calculateCreditLimit(int amt){
        if(amt >= 1 && amt <= 2000){
            return 100;
        } else if(amt <= 4000){
            return 200;
        } else {
            return 300;
        }
    }

    @Override
    public void deposit (int amt){
        balance = balance+amt;
    }

    @Override
    public void withdraw(int amt) {

    }

    @Override
    public int getBalance() {
        return 0;
    }

    @Override
    public String getBankName() {
        return BANK;
    }

    public void setCreditLimit(int num)
    {
        creditLimit = num;
    }
    public int getCreditLimit ( ) {

        return creditLimit;
    }
    public void print() {
        System.out.println("\nBank Name      : " + getBankName() +
                           "\nAccount Holder : " + accountName +
                           "\nAccount Number : " + accountNum +
                           "\nAccount Balance: " + balance +
                           "\nCredit Limit   : " + creditLimit);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nCredit Limit    : " + creditLimit;
    }
}
