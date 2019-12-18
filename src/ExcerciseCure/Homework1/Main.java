package ExcerciseCure.Homework1;

public class Main {
    public static void main(String[] args) {
        Account account = new Account("Chien", 1, 0.0);
        Account account1 = new Account("Quang", 2, 0.0);

//        account.credit(-5000);
        account.credit(3000);
        account1.credit(500);

        account.debit(2000);

        account.transferTo(account1,1000);
    }
}
