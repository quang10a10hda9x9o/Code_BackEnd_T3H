package Exercise.Bai_Test_03;

import java.util.Scanner;

public class Foreigner extends Customer {
    private String quoctich;
    Scanner input = new Scanner(System.in);
    public Foreigner() {
        super();
    }

    public void inputInfo() {
        super.inputInfo();
        System.out.println("Nhập quốc tịch");
        quoctich = input.nextLine();
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Quốc tịch: " + quoctich);
        thanhtien = (int) soluong * dongia;
        System.out.println("Thành tiền: " + thanhtien);
    }
}
