package kickBall1;

public class Main {
    public static void main(String[] args) {
        Ball b = new Ball(1,2);
        System.out.println("Quả bóng bạn nhập có m = " + b.m + " và v = " + b.v);
        Person p = new Person(3);
        b.s(p);
        b.s(p);
        b.s(p);
        System.out.println("Quãng đường quả bóng đi được là: " + b.sum);
    }
}
