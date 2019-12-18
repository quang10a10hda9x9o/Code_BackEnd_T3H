package Exercise.Bai_Test_02;

import java.util.Scanner;

public class Time {
    private int day;
    private int month;
    private int year;

    public Time(int year) {
        this.year = year;
    }

//    public int showInfo() {
//
//    }

    public boolean isLeapYear(int year) {
        if((year%4==0 && year%100!=0) || year%400 ==0) {
            System.out.println(year + " là năm nhuận");
            return true;
        } else {
            System.out.println("Không phải năm nhuận");
            return false;
        }
    }

    public void testDay() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào tháng 1 đến tháng 12 năm " + year);
        month = input.nextInt();

        if(isLeapYear(year)) {
            switch (month) {
                case 1:
                    System.out.println("Tháng " + month + " có 31 ngày");
                    break;
                case 2:
                    System.out.println("Tháng " + month + " có 29 ngày");
                    break;
                case 3:
                    System.out.println("Tháng " + month + " có 31 ngày");
                    break;
                case 4:
                    System.out.println("Tháng " + month + " có 30 ngày");
                    break;
                case 5:
                    System.out.println("Tháng " + month + " có 31 ngày");
                    break;
                case 6:
                    System.out.println("Tháng " + month + " có 30 ngày");
                    break;
                case 7:
                    System.out.println("Tháng " + month + " có 31 ngày");
                    break;
                case 8:
                    System.out.println("Tháng " + month + " có 31 ngày");
                    break;
                case 9:
                    System.out.println("Tháng " + month + " có 30 ngày");
                    break;
                case 10:
                    System.out.println("Tháng " + month + " có 31 ngày");
                    break;
                case 11:
                    System.out.println("Tháng " + month + " có 30 ngày");
                    break;
                case 12:
                    System.out.println("Tháng " + month + " có 31 ngày");
                    break;
                default:
                    System.out.println("Nhập từ 1 đến 12");
                    break;
            }
        } else {
            switch (month) {
                case 1:
                    System.out.println("Tháng " + month + " có 31 ngày");
                    break;
                case 2:
                    System.out.println("Tháng " + month + " có 28 ngày");
                    break;
                case 3:
                    System.out.println("Tháng " + month + " có 31 ngày");
                    break;
                case 4:
                    System.out.println("Tháng " + month + " có 30 ngày");
                    break;
                case 5:
                    System.out.println("Tháng " + month + " có 31 ngày");
                    break;
                case 6:
                    System.out.println("Tháng " + month + " có 30 ngày");
                    break;
                case 7:
                    System.out.println("Tháng " + month + " có 31 ngày");
                    break;
                case 8:
                    System.out.println("Tháng " + month + " có 31 ngày");
                    break;
                case 9:
                    System.out.println("Tháng " + month + " có 30 ngày");
                    break;
                case 10:
                    System.out.println("Tháng " + month + " có 31 ngày");
                    break;
                case 11:
                    System.out.println("Tháng " + month + " có 30 ngày");
                    break;
                case 12:
                    System.out.println("Tháng " + month + " có 31 ngày");
                    break;
                default:
                    System.out.println("Nhập từ 1 đến 12");
                    break;
            }
        }
    }
}
