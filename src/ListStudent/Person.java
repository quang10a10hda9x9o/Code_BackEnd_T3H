package ListStudent;

public class Person {
    String name;
    String gender;
    float point;

    public Person(String name, String gender, int point) {
        this.name = name;
        this.gender = gender;
        this.point = point;
    }

    void pass() {
        if(point >= 0 && point < 5) {
            System.out.println(name + " là học sinh yếu;");
        } else if(point >= 5 && point < 6.5) {
            System.out.println(name + " là học sinh trung bình;");
        } else if(point >= 6.5 && point <8) {
            System.out.println(name + " là học sinh khá;");
        } else if(point >=8 && point <=10) {
            System.out.println(name + " là học sinh giỏi;");
        } else {
            System.out.println("Mời bạn nhập lại.");
        }
    }
}



