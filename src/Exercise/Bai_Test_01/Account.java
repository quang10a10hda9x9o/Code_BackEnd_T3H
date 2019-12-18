package Exercise.Bai_Test_01;

public class Account {
    private int id;
    private String name;
    private int balance;

    public Account(int id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public void showInfo() {
        System.out.println("_________________________________________");
        System.out.println("Tên: " + name);
        System.out.println("Id: " + id);
        System.out.println("Tài khoản: " + balance);
    }

    public int Credit(int amount) {
        if(amount > 0) {
            this.balance += amount;
            System.out.printf("Nạp tiền thành công");
        } else {
            System.err.println("Số tiền thêm > 0");
        }
        return this.balance;
    }

    public int Debit(int amount) {
        if(balance > amount) {
            this.balance = balance - amount;
            System.out.println("Thanh toán thành công");
        } else {
            System.err.println("Số tiền tài khoản không đủ");
        }
        return this.balance;
    }

    public int TranferTo(Account account, int amount) {
        if (balance >= amount) {
            balance -= amount;
            account.balance += amount;
            System.out.println("Chuyền tiền thành công");
        } else {
            System.err.println("Số tiền tài khoản không đủ");
        }
        return this.balance;
    }
}
