import java.sql.SQLOutput;
import java.util.Scanner;
public class testScanner {
    public static void main(String[] args) {

                                                //FIND MY LOVE OLD
//        Scanner input = new Scanner(System.in);
//        System.out.println("Mời bạn nhập vào tên người yêu cũ : ");
//        String mylove_old = input.next();
//        System.out.println("Tên người yêu cũ của bạn là : " + mylove_old);


                                                //TÍNH TỔNG
//        Scanner input = new Scanner(System.in);
//        System.out.println("Nhập vào số a: ");
//        int a = input.nextInt();
//        System.out.println("Nhập vào số b: ");
//        int b = input.nextInt();
//        int sum = a + b;
//        System.out.println("Hai số bạn vừa nhập là: " + a + " và " + b);
//        System.out.println("Có tổng = " + sum);


                                                //NHẬP THÔNG TIN SINH VIÊN
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập tên sinh viên: ");
        String fullName = input.nextLine();
        System.out.println("Nhập tuổi sinh viên: ");
        int age = input.nextInt();
        System.out.println("Nhập vào lớp: ");
        String class1 = input.nextLine();
        System.out.println("THÔNG TIN SINH VIÊN: ");
        System.out.println("Họ và tên: " + fullName);
        System.out.println("Tuổi: " + age);
        System.out.println("Giới tính: " + class1);
    }
}