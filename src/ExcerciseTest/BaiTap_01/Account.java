package ExcerciseTest.BaiTap_01;

public class Account {
    private int id;
    private String name;
    private int balance;

    public Account(int id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void credit(int amount) {
        if(amount <= 0) {
            System.err.println("Số tiền muốn thêm phải lớn hơn 0.");
            return;
        }
        this.setBalance(this.getBalance() + amount);
        System.out.println("Số tiền tài khoản " + this.getName() + " là: " + this.getBalance());
    }

    public void debit(int amount) {
        if(amount > getBalance()) {
            System.out.println("Số tiền trừ phải nhỏ hơn số dư.");
            return;
        }
        this.setBalance(this.getBalance() - amount);
        System.out.println("Số tiền tài khoản " + this.getName() + " là: " + this.getBalance());
    }

    public void tranferTo(Account account, int amount) {
        if(amount > getBalance()) {
            System.err.println("Số tiền chuyển phải lớn hơn số dư.");
            return;
        }
        this.setBalance(this.getBalance() - amount);
        account.setBalance(account.getBalance() + amount);
        System.out.println("Số tiền tài khoản " + this.getName() + " là: " + this.getBalance());
        System.out.println("Số tiền tài khoản " + account.getName() + " là: " + account.getBalance());
    }
}
