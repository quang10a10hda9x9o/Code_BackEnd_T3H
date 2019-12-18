package height1;

public class Person {
    String name;
    String gender;
    float point;

    public Person(String name, String gender, float point) {
        this.name = name;
        this.gender = gender;
        this.point = point;
    }

    void pass(Window window) {
        if(window.maxHeight > point) {
            System.out.println(name + " đã qua.");
        } else {
            System.out.println(name + " chưa qua.");
        }
    }
}
