
public class Account extends AbstractBankAccount{

    private int bonusValue;

    //overloaded constructor for Account
    Account(String name, int num,int amt)
    {
        super(name, num, (amt + calculateInitialBonusValue(amt)));
        bonusValue = calculateInitialBonusValue(amt);
    }

    public static int calculateInitialBonusValue(int amt){
        if(amt >= 1 && amt <= 100){
            return 10;
        } else if(amt <= 200){
            return 20;
        } else {
            return 30;
        }
    }

    //make a deposit to the balance
    public void deposit(int amt) {
        if(amt > 100){
            balance=balance+(amt + (int) (bonusValue * 0.1));
        } else {
            balance = balance + amt;
        }
    }
    //make a withdrawal from the balance
    public void withdraw(int amt)
    {
        balance=balance-amt;
    }
    //modifier to set the accountName
    public void setAccountName(String name)
    {
        accountName = name;
    }
    //modifier to set the accountNumber
    public void setAccountNum(int num)
    {
        accountNum = num;
    }
    //modifier to set the balance
    public void setBalance(int num)
    {
        balance = num;
    }
    //accessor to get the accountName
    public String getAccountName ( ) {

        return accountName;
    }

    //accessor to get the accountNumber
    public int getAccountNum ( ) {

        return accountNum;
    }
    //accessor to get the account balance
    public int getBalance() {

        return balance;
    }

    public String getBankName() {
        return InterfaceBankAccount.BANK;
    }

    //print method
    public void print() {
        System.out.println("\n" +
                "Bank Name         : " + getBankName() +
                "\nAccount Holder    : " + accountName +
                "\nAccount Number    : " + accountNum +
                "\nAccount Balance   : " + balance);
    }
}
