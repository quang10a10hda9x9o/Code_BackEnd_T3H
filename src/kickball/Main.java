package kickball;

public class Main {
    public static void main(String[] args) {
        Ball b = new Ball(3,6);
        System.out.println("Giá trị m :" + b.m);
        System.out.println("Giá trị khoảng cách là :" + b.distence);
        Pertion p = new Pertion(10);
        p.kick(b);
        p.kick(b);
    }
}
