package scope;

public class Superman {
    public String name;
    public  static String address = "Hà Nội"; // khởi tạo chương trình biến static tự chạy
    private Dog dog = new Dog("Shiba", 10); // biến istance

    public void fly() {
        int h = 100; // biến cục bộ: chạy xog hàm tự hủy
        System.out.println("Đang bao ở độ cao: " + h);
    }
}
