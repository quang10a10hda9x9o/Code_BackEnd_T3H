package ExcerciseTest.BaiTap_03;

import java.util.ArrayList;
import java.util.List;

public class Repository {
    List<BillVietNam> billVietNamList = new ArrayList<>();
    List<BillForeign> billForeignList = new ArrayList<>();

    public void sumBill() {
        System.out.println("Tổng số hóa đơn của người Việt Nam là: " + billVietNamList.size());
        System.out.println("Tổng số hóa đơn của người nước ngoài là: " + billForeignList.size());
    }

    public void sumForeign() {
        int sumMoney = 0;
        for(BillForeign bill : billForeignList) {
            sumMoney += bill.getNumber() * bill.getUnit();
        }
        System.out.println("Tổng tiền hóa đơn của khách nước ngoài là: " + sumMoney);
    }

    public List<BillVietNam> getBillVietNamList() {
        return billVietNamList;
    }

    public void setBillVietNamList(List<BillVietNam> billVietNamList) {
        this.billVietNamList = billVietNamList;
    }

    public List<BillForeign> getBillForeignList() {
        return billForeignList;
    }

    public void setBillForeignList(List<BillForeign> billForeignList) {
        this.billForeignList = billForeignList;
    }

}
