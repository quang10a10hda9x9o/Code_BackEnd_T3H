package baitap_01;

import java.util.Scanner;

public class Person {
    String name;
    String gender;
    String birthday;
    String addrest;

    //Hàm tạo không đối số
    public Person() {
    }

    //Hàm tạo có đối số
    public Person(String name, String gender, String birthday, String addrest) {
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.addrest = addrest;
    }

    //Tạo hàm inputInfo
    public void inputInfo() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào tên: ");
        name = input.nextLine();

        System.out.println("Nhập giới tính: ");
        gender = input.nextLine();

        System.out.println("Nhập ngày sinh: ");
        birthday = input.nextLine();

        System.out.println("Nhập địa chỉ: ");
        addrest = input.nextLine();
    }

    //Tạo hàm showInfo
    public void showInfo() {
        System.out.println("Tên: " + name);
        System.out.println("Giới tính: " + gender);
        System.out.println("Ngày sinh: " + birthday);
        System.out.println("Địa chỉ: " + addrest);
    }

    //Thêm get set
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getGender() {
//        return gender;
//    }
//
//    public void setGender(String gender) {
//        this.gender = gender;
//    }
//
//    public String getBirthday() {
//        return birthday;
//    }
//
//    public void setBirthday(String birthday) {
//        this.birthday = birthday;
//    }
//
//    public String getAddrest() {
//        return addrest;
//    }
//
//    public void setAddrest(String addrest) {
//        this.addrest = addrest;
//    }
}
