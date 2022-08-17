abstract public class AbstractBankAccount {
    public final String BANK = "JavaBank";
    protected String accountName;
    protected int accountNum;
    protected int balance;

    public AbstractBankAccount(String name, int num,int amt) {
        accountName=name;
        accountNum=num;
        balance=amt;
    }

    abstract public void deposit(int amt);
    abstract public void withdraw(int amt);
    abstract public int getBalance();
    abstract public String getBankName();

    public void setAccountName(String name)
    {
        accountName = name;
    }
    public void setAccountNumber(int num)
    {
        accountNum = num;
    }
    public void setBalance(int num)
    {
        balance = num;
    }
    public String getAccountName() {
        return accountName;
    }
    public int getAccountNumber() {
        return accountNum;
    }

    @Override
    public String toString() {
        return "\n \nBank Name      : " + getBankName() +
                  "\nAccount Holder : " + accountName +
                  "\nAccount Number : " + accountNum +
                  "\nAccount Balance: " + balance;
    }
}
