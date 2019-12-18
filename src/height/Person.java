package height;

public class Person {
    String name;
    int height;

    public Person(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public void pass(Window window) {
        if(height > window.height) {
            System.out.println("Bạn chưa qua");
        } else {
            System.out.println("Bạn đã qua");
        }
    }
}
