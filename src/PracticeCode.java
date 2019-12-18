import java.util.Scanner;

public class PracticeCode {
    public static void main(String[] args) {




                                                //Giải phương trình bậc nhất
        float a = 10;
        float b = 9;
        if(a == 0) {
            if(b == 0) {
                System.out.println("Phương trình vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            System.out.println("Phương trình có nghiệm duy nhất: x = " + (-b/a));
        }




                                                //Giải phương trình bậc hai
        float x = 0;
        float y = 1;
        float z = 0;
        if(x == 0) {
            if(y == 0 && z == 0) {
                System.out.println("Phương trình có vô số nghiệm.");
            } else {
                System.out.println("Phương trình có nghiệm duy nhất: x = " + (-z/y));
            }
        } else {
            float denta = y*y - 4*x*z;
            if(denta < 0) {
                System.out.println("Phương trình vô nghiệm");
            } else if(denta == 0) {
                System.out.println("Phương trình có nghiệm kép x1 = x2 = " + (-y/2*x));
            } else {
                System.out.println("Phương trình có 2 nghiệm phân biệt: x1 = " + (-y+Math.sqrt(denta))/2*x + " x2 =  " + (-y-Math.sqrt(denta))/2*x);
            }
        }
    }
}
