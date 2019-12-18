package oop;

public class Circle extends Shape {
    public Circle(int h, int a, String name) {
//        gọi đến thằng cha
        super(a,name);
    }

    public Circle(int a, String name) {
        super(a, name);
    }

    //Khi mà dùng extends bị lỗi thì dùng: ALT + ENTER(override) hoặc thêm abstract
    @Override
    public int area() {
        int s = (int) Math.PI*a*a;
        return s;
    }

    public void print() {
        //Có thể dùng luôn hàm area vì hàm trả về số
        System.out.println("Diện tích của hình: " + name + " là : " + area());
    }
}
