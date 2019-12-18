package oop;

public abstract class Shape {
    //private là phạm vi truy cập: tính đóng gói: private, protected, public, default.
    //Khi khai báo private: chỉ trong class đó ms có thể sử dụng, ngoài hàm ko thể sử dụng.
    //Khi khai báo protected: dùng trong cả thg cha và thằng kế thừa của thằng cha

    protected int a;
    protected String name;
    //Khai báo phương thức, abstract là trừu tượng hay chưa biết tính gì định nghĩa ntn
    //Khi phương thức để abstract thì class cũng phải để abstract
    //Tính trừu tượng thể hiện rõ qua abstract và interface
    public abstract int area();

    public Shape(int a, String name) {
        this.a = a;
        this.name = name;
    }

//    public abstract int area();
//    public abstract int printf();
}
