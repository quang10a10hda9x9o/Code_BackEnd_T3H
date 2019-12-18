package height;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("Quang", 2);
        Person p1 = new Person("Chien", 1);
        Window w = new Window(1);
        p.pass(w);
        p1.pass(w);
    }
}
