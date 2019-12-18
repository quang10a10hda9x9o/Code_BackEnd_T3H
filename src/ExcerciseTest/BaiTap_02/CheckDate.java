package ExcerciseTest.BaiTap_02;

public class CheckDate {
    private int day;
    private int month;
    private int year;

    public boolean isLeapYear(int year) {
        //Kiểm tra năm
        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
            return true;
        return false;
    }

    public CheckDate(int day, int month, int year) {
        //Kiểm trả năm
        if(year < 0 ) {
            System.err.println("Năm phải lớn hơn 0");
            return;
        }
        //Kiểm tra tháng
        if(month < 1 || month > 12) {
            System.err.println("Tháng từ 1 -> 12.");
            return;
        }
        if(month == 2 && isLeapYear(year)) {
            if(day < 1 || day > 29) {
                System.err.println("Năm nhuận tháng 2 có thể từ 1 -> 29");
                return;
            }
        }
        if(month == 2 && !isLeapYear(year)) {
            if(day < 1 || day > 28) {
                System.err.println("Năm không nhuận tháng 2 có thể từ 1->28");
                return;
            }
        }
        //Kiểm tra ngày
        if(month == 1 ||month == 3 ||month == 5 ||month == 7 ||month == 8 ||month == 10 ||month == 12) {
            if(day < 1 || day > 31) {
                System.err.println("Ngày không thỏa mãn(1 <= day <= 31).");
            }
        }
        else {
            if(day < 1 || day > 30) {
                System.err.println("Ngày không thỏa mãn(1 <= day <= 30");
            }
        }
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "CheckDate{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}
