package oop;

public class Square extends Shape {

    public Square(int h, int a, String name) {
//        gọi đến thằng cha
        super(a,name);
    }

    public Square(int a, String name) {
        super(a, name);
    }

    //Khi mà dùng extends bị lỗi thì dùng: ALT + ENTER(override) hoặc thêm abstract
    @Override
    public int area() {
        int s = a*a;
        return s;
    }

    public void print() {
        //Có thể dùng luôn hàm area vì hàm trả về số
        System.out.println("Diện tích của hình: " + name + " là : " + area());
    }
}
