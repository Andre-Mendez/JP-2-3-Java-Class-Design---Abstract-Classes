public class TestCustomerAccounts {
    public static void main(String[] args) {
        AbstractBankAccount[] bankAccount = new AbstractBankAccount[5];

        bankAccount[0] = new Account("Sanjay Gupta",11556,300);
        bankAccount[1] = new Account("He Xai", 22338, 500);
        bankAccount[2] = new Account("Ilya Mustafana", 44559, 1000);
        bankAccount[3] = new CreditAccount("A.N Other", 88776, 500);
        bankAccount[4] = new CreditAccount("Another",66778,1000,500);

        showAllCustomerAccounts(bankAccount);
        showAllAccounts(bankAccount);
        showAllCreditAccounts(bankAccount);
    }

    public static void showAllCustomerAccounts(AbstractBankAccount[] bankAccount){
        System.out.println("\nAll Customer Accounts**********");
        for(AbstractBankAccount i : bankAccount){
            System.out.println(i);
        }
    }

    public static void showAllAccounts(AbstractBankAccount[] bankAccount) {
        System.out.println("\nAll account types**********");
        for(AbstractBankAccount i : bankAccount){
            if(i instanceof Account){
                System.out.println(i);
            }
        }
    }

    public static void showAllCreditAccounts(AbstractBankAccount [] creditAccount){
        System.out.println("\nAll Credit account types**********");
        for(AbstractBankAccount i : creditAccount){
            if(i instanceof CreditAccount){
                System.out.println(i);
            }
        }
    }
}
