package Exercise.Bai_Test_01;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(123,"Nguyen Van Quang",100);
        Account account1 = new Account(234,"Nguyen Van Chien",200);

        account.Credit(100);
        account.showInfo();

        account.Debit(50);
        account.showInfo();

        account.TranferTo(account1,50);
        account.showInfo();
        account1.showInfo();
    }
}
