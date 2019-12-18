package ExcerciseCure.Homework2;

public class Date {
    private int day;
    private int month;
    private int year;

    public boolean isLeapYear(int year){
        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
        return true;
        return false;
    }

    public Date(int day, int month, int year) {
        //Check ngay trong hàm khởi tạo
        //Kiểm tra năm không hợp lệ
        if(year < 0) {
            System.err.println("Năm không hợp lệ");
            return;
        }
        //Kiểm tra tháng không hợp lệ
        if(month < 1 || month > 12) {
            System.err.println("Tháng không hợp lệ");
            return;
        }
        //Kiểm tra ngày của tháng 2 năm nhuận không hợp lệ
        if(month == 2 && isLeapYear(year)) {
            if(day < 1 || day > 29 ) {
                System.err.println("Năm nhuận tháng 2 bắt đầu từ 1 -> 29");
                return;
            }
        }
        //Kiểm tra ngày của tháng 2 năm không hợp lệ
        if(month == 2 && !isLeapYear(year)) {
            if(day < 1 || day > 28) {
                System.err.println("Năm không nhuận tháng 2 bắt đầu từ 1 -> 28");
                return;
                //nếu ko có return dừng ngay
            }
        }

        //Kiểm tra ngày trong các tháng
        if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12) {
            if(day < 1 || day > 31) {
                System.err.println("Ngày trong tháng " + month + " không hợp lệ");
            }
        } else {
            if(day < 1 || day > 30) {
                System.err.println("Ngày trong tháng " + month + " không hợp lệ");
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
        return "Date{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}
