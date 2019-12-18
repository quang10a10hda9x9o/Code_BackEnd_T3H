package Exercise.Bai_Test_03;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Quan ly danh sach nguoi viet
        ArrayList<Vietnamese> arrayList = new ArrayList<>();
        //Quan ly danh sach nguoi nuoc ngoai
        ArrayList<Customer> arrayList1 = new ArrayList<>();

        int choose;
        Scanner input = new Scanner(System.in);
        do{
            showMenu();
            choose = Integer.parseInt(input.nextLine());

            switch (choose) {
                case 1:
                    //Nhập thông tin hóa đơn
                    int n;
                    System.out.println("Nhập số hóa đơn cần thêm: ");
                    n = Integer.parseInt(input.nextLine());
                    for (int i=0 ; i<n ; i++) {
                        Vietnamese vietnamese = new Vietnamese();
                        vietnamese.inputInfo();

                        //Lưu đối tượng vào mảng
                        arrayList.add(vietnamese);
                    }
                    break;
                case 2:
                    System.out.println("Danh sách đơn hàng là: ");
                    for (int i = 0; i < arrayList.size() ; i++) {
                        arrayList.get(i).showInfo();
                    }
                    System.out.println("_________________________");
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    System.out.println("Good Bye!!!");
                    break;
                default:
                    System.err.println("Nhập sai!!!");
                    break;
            }
        }while(choose != 5);

    }
    static void showMenu() {
        System.out.println("1. Thêm hóa đơn.");
        System.out.println("2. Hiển thị danh sách hóa đơn.");
        System.out.println("3. Trung bình thành tiền.");
        System.out.println("4. Xuất hóa đơn tháng 9 năm 2013.");
        System.out.println("5. Thoát.");
    }
}
