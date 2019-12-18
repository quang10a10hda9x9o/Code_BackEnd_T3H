package oop;
//Hàm tính diện tích tam giác
public class Triangle extends Shape {
    private int h;

    public Triangle(int h, int a, String name) {
//        gọi đến thằng cha
        super(a,name);
        this.h = h;
    }
    //Khi mà dùng extends bị lỗi thì dùng: ALT + ENTER(override) hoặc thêm abstract
    @Override
    public int area() {
        int s = h*a/2;
        return s;
    }

    public void print() {
        //Có thể dùng luôn hàm area vì hàm trả về số
        System.out.println("Diện tích của hình: " + name + " là : " + area());
    }
}
