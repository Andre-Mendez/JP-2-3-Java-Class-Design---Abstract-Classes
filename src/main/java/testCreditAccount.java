
public class testCreditAccount {


    public static void main(String[] args) {
        Account A1 = new Account("Sanjay Gupta",11556,300);
        // Using default constructor
//        Account A2 = new Account();
//        Account A3 = new Account();

        // Instantiate 2 credit accounts
        // Using default constructor
        CreditAccount C1 = new CreditAccount("A.N Other", 88776, 500);
        // Using constructor with values which will call constructor from super
        CreditAccount C2 = new CreditAccount("Another",66778,1000,500);

        //Set values of Instances created using default constructor
//        A2.setAccountName("He Xai");
//        A2.setAccountNum(22338);
//        A2.setBalance(500);
//
//        A3.setAccountName("Ilya Mustafana");
//        A3.setAccountNum(44559);
//        A3.setBalance(1000);


        // Print accounts
        System.out.println(A1);
//        A2.print();
//        A3.print();
        System.out.println(C1);
        System.out.println(C2);
    }
}

