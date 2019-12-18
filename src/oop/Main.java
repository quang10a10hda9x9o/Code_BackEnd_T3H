package oop;
//B1: Xác định các đối tượng tham gia vào bài toán
//B2: Xác định thuộc tính và phương thức của đối tượng

public class Main {
    public static void main(String[] args) {
        //Hàm khởi tạo đối tượng
        Parent parent = new Parent();
        Parent children = new Children();//???? bản chất thg children kế thừa hết thuộc tính của thg cha nên có thể gán cho thg cha
        Triangle triangle = new Triangle(10, 10, "Tam giác");
        Circle circle = new Circle(10,"Hình tròn");
        Square square = new Square(10,"Hình vuông");

        triangle.print();
        circle.print();
        square.print();
    }
}
