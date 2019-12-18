package baitap_01;

import java.util.Scanner;

public class Student extends Person {
    String rollNo;
    float mark;
    String email;

    //Tạo hàm không đối

    public Student() {
    }

    //Override lại thằng input: gõ "input" => enter
    @Override
    public void inputInfo() {
        //gọi thằng cha Persion
        super.inputInfo();

        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào mã sinh viên: ");
        //code đầy đủ
        while(true) {
            String rollnoInput = input.nextLine();
            boolean check = setRollNo(rollnoInput);
            if(check) {
                break;
            }
        }
        //code ngắn gọn
//        while(!setRollNo(input.nextLine()));
        System.out.println("Nhập vào điểm trung bình: ");
        while (true) {
            float markInput = Float.parseFloat(input.nextLine());
            boolean check = setMark(markInput);
            if(check) {
                break;
            }
        }

        System.out.println("Nhập vào địa chỉ email: ");
        while(true) {
            String emailInput = input.nextLine();
            boolean check = setEmail(emailInput);
            if(check) {
                break;
            }
        }
    }


    //Tạo bộ get set

    public String getRollNo() {
        return rollNo;
    }

    public boolean setRollNo(String rollNo) {
        if(rollNo != "" && rollNo.length() == 8) {
            this.rollNo = rollNo;
            return true;
        } else {
            System.err.println("Mời bạn nhập lại mã sinh viên: ");
            return false;
        }
    }

    public float getMark() {
        return mark;
    }

    public boolean setMark(float mark) {
        if(mark >=0 && mark <=10) {
            this.mark = mark;
            return true;
        } else {
            System.err.println("Nhập lại điểm(0<=điểm<=10): ");
            return false;
        }
    }

    public String getEmail() {
        return email;
    }

    public boolean setEmail(String email) {
        if(email != null && email.contains("@") && !email.contains(" ")) {
            this.email = email;
            return true;
        } else {
            System.err.println("Nhập lại địa chỉ email:");
            return false;
        }
    }

    public boolean checkScholarshit() {
        if(mark >=8) {
            return true;
        } else {
            return false;
        }
    }
}
