package Exercise.Bai_Test_03;

import java.util.Scanner;

public class Customer {
    private int makh;
    private String hoten;
    private String day;
    public int soluong;
    public int dongia;
    public int thanhtien;

    public Customer() {

    }

    public void inputInfo() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập mã khách hàng: ");
        makh = Integer.parseInt(input.nextLine());

        System.out.println("Nhập tên khách hàng: ");
        hoten = input.nextLine();

        System.out.println("Nhập ngày ra hóa đơn: ");
        day = input.nextLine();

        System.out.println("Nhập số lượng: ");
        soluong = Integer.parseInt(input.nextLine());

        System.out.println("Nhập đơn giá: ");
        dongia = Integer.parseInt(input.nextLine());
    }

    public void showInfo() {
        System.out.println("Mã khách hàng: " + makh);
        System.out.println("Họ tên: " + hoten);
        System.out.println("Ngày ra hóa đơn: " + day);
        System.out.println("Số lượng: " + soluong);
        System.out.println("Đơn giá: " + dongia);
    }
}


