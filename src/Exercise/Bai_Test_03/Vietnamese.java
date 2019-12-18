package Exercise.Bai_Test_03;

import java.util.Scanner;

public class Vietnamese extends Customer {
    private String doituong;
    private int dinhmuc;
    Scanner input = new Scanner(System.in);

    public Vietnamese() {
        super();
    }

    public int getSoluong() {
        return soluong;
    }

    public int sumSoLuong() {
        this.soluong += soluong;
        return this.soluong;
    }

    public void inputInfo() {
        super.inputInfo();
        System.out.println("Nhập đối tượng: ");
        doituong = input.nextLine();

        System.out.println("Nhập định mức: ");
        dinhmuc = Integer.parseInt(input.nextLine());
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Đối tượng: " + doituong);
        System.out.println("Định mức: " + dinhmuc);
        if(soluong <= dinhmuc) {
            thanhtien = (int) soluong * dongia;
        } else {
            thanhtien = (int) (soluong * dongia * dinhmuc + (dinhmuc - soluong) * dongia * 2.5);
        }
        System.out.println("Thành tiền: " + thanhtien);
    }


}
