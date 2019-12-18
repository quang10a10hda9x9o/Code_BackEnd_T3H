    //Đề bài
    //https://www.youtube.com/watch?v=wyz8PNPlkRM&list=PLE1qPKuGSJaCwhwNSBH6AaK9j8wfhL4WK
import java.util.Scanner;
public class ExerciseJava1 {
    public static void main(String[] args) {
//        ExportString();
        CheckEventOdd(1);
        Caculate(3, 4);
        Compare(5 ,1);
//        FindMax(1,2,3,4);
        CS(3,4);
        Circle(5);
        PTBacNhat(0,2);
        PTBacHai(0,1,1);
    }


                                            // Hiển thị chuỗi vừa nhập(Bài 1)
    public static void ExportString() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi muốn hiển thị.");
        String str = input.nextLine();
        System.out.println("Chuỗi bạn vừa nhập là: " + str);
    }


                                            // kiểm tra chẵn lẻ(Bài 2)
    public static void CheckEventOdd(int a) {
        if(a>0 && a%2==0) {
            System.out.println(a + " là số chẵn dương");
        } else if(a<0 && a%2==0) {
            System.out.println(a + " là số chẵn âm");
        } else if(a>0 && a%2!=0) {
            System.out.println(a + " là số lẻ dương");
        } else if(a<0 && a%2!=0) {
            System.out.println(a + " là số lẻ âm");
        }
    }


                                            // tính tổng hiệu tích thương của 2 số (Bài 3)
    public static void Caculate(int a, int b) {
        int sum = a + b;
        int effect = a - b;
        int calculus = a * b;
        int love = a / b;
        System.out.println("Tổng hiệu tích thương của " + a + " và " + b + " là:");
        System.out.println(sum + " " + effect + " " + calculus + " " + love);
    }


                                            // so sánh 2 số a và b (Bài 4)
    public static void Compare(int a, int b) {
        if(a > b) {
            System.out.println(a + " lớn hơn " + b);
        } else if(a < b) {
            System.out.println(a + " nhỏ hơn " + b);
        } else {
            System.out.println(a + " bằng " + b);
        }
    }


                                            // tìm max (Bài 5)
//    public static void FindMax(int a, int b, int c, int d) {
//        int max = a;
//        if(a == b && b == c && c == d) {
//            System.out.println("Không có số lớn nhất");
//        } else if(max < b) {
//            b = max;
//        } else if(max < c) {
//            c = max;
//        } else if(max < d) {
//            d = max;
//        }
//        System.out.println("Số max là: " + max);
//    }


                                            //Tính chu vi diện tích hình chữ nhật (Bài 6)
    public static void CS(int a, int b) {
        int s = a * b;
        int c = (a + b)*2;
        System.out.println("Diện tích hình chữ nhật là: " + s);
        System.out.println("Chu vi hình chữ nhật là: " + c);
    }


                                            //Tính chu vi diện tích hình tròn (Bài 7)
    public static void Circle(double r) {
        final double PI = 3.14;
        double s = r * r * PI;
        double c = 2 * r * PI;
        System.out.println("Diện tích hình tròn là: " + s);
        System.out.println("Chu vi hình tròn là: " + c);
    }


                                            //Giải và biện luận phương trình bậc nhất(Bài 8)
    public static void PTBacNhat(int a, int b) {
        if( a == 0) {
            if(b == 0) System.out.println("Phương trình có vô số nghiệm");
            else System.out.println("Phương trình vô nghiệm");
        } else {
            if(b == 0) System.out.println("Phương trình vô nghiệm");
            else System.out.println("Phương trình có nghiệm x = " + (-b/a));
        }
    }


                                            //Giải và biện luận phương trình bậc hai
    public static void PTBacHai(int a, int b, int c) {
        if(a == 0) {
            if(b == 0) {
                if(c == 0) System.out.println("Phương trình có vô số nghiệm");
                else System.out.println("Phương trình vô nghiệm");
            } else {
                if(c == 0) System.out.println("phương trình vô nhiệm");
                else System.out.println("Phương trình có 1 nghiệm x = " + (-c/b));
            }
        } else {
            int dt = b*b - 4*a*c;
            if(dt < 0) System.out.println("Phương trình vô nghiệm");
            else if(dt == 0) System.out.println("Phương trình có nghiệm kép: x1 = x2 = " + (-b/2*a));
            else {
                System.out.println("Phương trình có 2 nghiệm phân biệt");
                System.out.println("x1 = " + (-b+Math.sqrt(dt))/2*a);
                System.out.println("x2 = " + (-b-Math.sqrt(dt))/2*a);
            }
        }
    }
}
