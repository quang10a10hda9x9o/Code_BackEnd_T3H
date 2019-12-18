package kickball;

public class Pertion {
    int f;

    public Pertion(int f) {
        this.f = f;
    }

    void kick(Ball ball) {
        System.out.println("Vị trí sau khi sút là: " + ball.move(f));
    }
}
