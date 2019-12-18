import java.util.Scanner;
public class functionJava {
    public static void main(String[] args) {
        sum(1,8,101);
        giaiPTBacNhat(3,4);
        myLove("Ngô Thị Tâm");
        testInt(7);
        introduce("Nguyễn Văn Quang", 20, "1908E");
        Scanner input = new Scanner(System.in);
        System.out.print("Nhậ1p vào hệ số a = ");
        int a = input.nextInt();
        System.out.print("Nhập vào hệ số b = ");
        int b = input.nextInt();
        System.out.print("Nhập vào hệ số c = ");
        int c = input.nextInt();
        System.out.println("Phương trình bạn vừa nhập là: " + a + "x2 + " + b
        + "x + " + c + " = 0");
        giaiPTBacHai(a,b,c);

        print(5,2);
    }

    public static int sum(int a, int b, int c) {
        int sum = a + b + c;
        System.out.println("Tổng của 3 số đó là: " + sum);
        return sum;
    }


                                            //Hàm giải phương trình bậc nhất
    public static float giaiPTBacNhat(float a, float b) {
        float x = -b/a;
        if(a == 0) {
            if(b == 0) {
                System.out.println("Phương trình vô số nghiệm");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        } else {
            System.out.println("Phương trình có nghiệm : " + x);
        }
        return x;
    }


                                            //Hàm in thông tin
    public static void myLove(String fullName) {
        System.out.println("Tên người yêu cũ của bạn là: " + fullName);
    }


                                            //Hàm kiểm tra chẵn lẻ
    public static int testInt(int x) {
        if(x%2 == 0) {
            System.out.println(x + " là số chẵn.");
        } else {
            System.out.println(x + " là số lẻ.");
        }
        return x;
    }

    public static void print(float tuSo, float mauSo) {
        float phanSo = tuSo/mauSo;
        System.out.println("Phan so co ket qua la: " + phanSo);
    }


                                            //Hàm hiển thị thông tin sinh viên
    public static void introduce(String fullName, int age, String class1) {
        System.out.println("THÔNG TIN CỦA SINH VIÊN LÀ: ");
        System.out.println("Họ và tên: " + fullName);
        System.out.println("Tuổi: " + age);
        System.out.println("Lớp: " + class1);
    }


                                            //Hàm giải phương trình bậc hai
    public static void giaiPTBacHai(float a, float b, float c) {
        if(a == 0) {
            if(b == 0) {
                if(c == 0) {
                    System.out.println("Phương trình có vô số nghiệm.");
                } else {
                    System.out.println("Phương trình vô nghiệm.");
                }
            } else {
                System.out.println("Phương trình có nghiệm x = " + -c/b);
            }
        } else {
            float denta = b*b - 4*a*c;
            float x1;
            float x2;
            if(denta < 0) {
                System.out.println("Phương trình vô nghiệm.");
            } else if(denta == 0) {
                System.out.println("Phương trình có nghiệm duy nhất x1 = x2 = " + -b/2*a);
            } else {
                System.out.println("Phương trình có 2 nghiệm : ");
                System.out.println("x1 = " + (-b+Math.sqrt(denta))/2*a);
                System.out.println("x2 = " + (-b-Math.sqrt(denta))/2*a);
            }
        }
    }
}
