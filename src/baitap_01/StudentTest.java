package baitap_01;

import java.util.*;

public class StudentTest {
    public static void main(String[] args) {
        //Khai baó mảng
        ArrayList<Student> studentList = new ArrayList<>();
        int choose;
        Scanner scan = new Scanner(System.in);
        showMenu();
        do {
            System.out.println("Chọn :");
            choose = Integer.parseInt(scan.nextLine());
            switch (choose) {
                case 1:
                    int n;
                    System.out.println("Nhập số sinh viên cần thêm");
                    n = Integer.parseInt(scan.nextLine());
                    for(int i=0 ; i<n ; i++) {
                        Student std = new Student();
                        std.inputInfo();

                        studentList.add(std);
                    }
                    break;
                case 2:
                    for (int i = 0; i < studentList.size(); i++) {
                        studentList.get(i).showInfo();
                    }
                    break;
                case 3:
                    int minIndex = 0;
                    int maxIndex = 0;
                    float minMark,maxMark;
                    //gán phần từ min, max vào vị trí phần tử đầu tiên
                    minMark = studentList.get(0).getMark();
                    maxMark = studentList.get(0).getMark();
                    for(Student student : studentList) {
                        for (int i = 1; i < studentList.size(); i++) {
                            if(studentList.get(i).getMark() < minMark) {
                                minIndex = i;
                                minMark = studentList.get(i).getMark();
                            }
                            if(studentList.get(i).getMark() > maxMark) {
                                maxIndex = i;
                                maxMark = studentList.get(i).getMark();
                            }
                        }
                    }

                    System.out.println("Sinh viên có điểm trung bình cao nhất: ");
                    studentList.get(maxIndex).showInfo();
                    System.out.println("Sinh viên có điểm trung bình thấp nhất: ");
                    studentList.get(minIndex).showInfo();
                    break;
                case 4:
                    System.out.println("Nhập rollNo cần tìm kiếm: ");
                    String rollNoSearch = scan.nextLine();
                    int count = 0;
                    for (Student student : studentList) {
                        if(student.getRollNo().equals(rollNoSearch)) {
                            student.showInfo();
                            count ++;
                        }
                        if(count == 0) {
                            System.out.println("Không tìm thấy sinh viên nào.");
                        }
                    }
                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:
                    System.out.println("Goodbye!!");
                    break;
                default:
                    System.out.println("Nhập sai");
                    break;
            }
        }while(choose != 7);
    }

    static void showMenu() {
        System.out.println("1. Nhập vào n sinh viên: ");
        System.out.println("2. Hiển thị thông tin tất cả sinh viên: ");
        System.out.println("3. Hiển thì maxMark và minMark");
        System.out.println("4. Tìm kiếm theo mã sinh viên");
        System.out.println("5. Hiển thị theo tên sinh viên(A-Z)");
        System.out.println("6. Hiển thị sinh viên là mark giảm dần");
        System.out.println("7. Thoát");
    }
}
