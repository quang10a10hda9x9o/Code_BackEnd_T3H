package height1;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Quang", "nam", 163);
        Person p2 = new Person("Chien", "nam", 175);
        Window w = new Window(170);
        p1.pass(w);
        p2.pass(w);
    }
}
