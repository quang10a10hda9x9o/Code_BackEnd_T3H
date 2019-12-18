package ExcerciseCure.Homework3;

import java.util.ArrayList;
import java.util.List;

public class Repository {
    //List kiểu dữ liệu arr động
    private List<BillVietNam> billVietNamList = new ArrayList<>();
    private List<Billforeign> billforeignList = new ArrayList<>();

    //Khi khởi tạo như trên thì tạo ra 2 kho rỗng
    //Khi khởi tạo qua hàm tạo thì có thể truyền và thay đổi

    public void sumBuild () {
        System.out.println("Số hóa đơn tiền điện ở Viêt Nam là: " + billVietNamList.size());
        System.out.println("Số hóa đơn tiền điện ở nước ngoài là: " + billforeignList.size());
    }

    public void sumForeign() {
        float sum = 0;

        for(Billforeign b : billforeignList) {
            sum = b.getNumber() * b.getUnit();
        }
        System.out.println("Tổng số tiền điện của khách nước ngoài là: " + sum);
    }

    public List<BillVietNam> getBillVietNamList() {
        return billVietNamList;
    }

    public void setBillVietNamList(List<BillVietNam> billVietNamList) {
        this.billVietNamList = billVietNamList;
    }

    public List<Billforeign> getBillforeignList() {
        return billforeignList;
    }

    public void setBillforeignList(List<Billforeign> billforeignList) {
        this.billforeignList = billforeignList;
    }
}
