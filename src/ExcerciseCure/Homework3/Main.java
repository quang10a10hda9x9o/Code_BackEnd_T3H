package ExcerciseCure.Homework3;

import ExcerciseCure.Homework2.Date;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Date d = new Date(1,2,2020);
        Customer customer = new Customer("Sinh hoạt",50,3000.0f,200);
        BillVietNam vn = new BillVietNam("01", "Quang",d,customer);

        Billforeign fr = new Billforeign("dh02", "John Weak",new Date(2,2,2020),
                "US",100,5000);
        //Khởi tạo kho
        Repository repository = new Repository();
        repository.sumBuild();
        System.out.println("_________________");
        //Lấy ra danh sách bill trong kho
        List<BillVietNam> listBillVN = repository.getBillVietNamList();
        List<Billforeign> listBillFR = repository.getBillforeignList();
        //Thêm mới hóa đơn vào danh sách
        listBillVN.add(vn);
        listBillFR.add(fr);

        //Đặt lại vào trong kho
        repository.setBillVietNamList(listBillVN);
        repository.setBillforeignList(listBillFR);

        repository.sumBuild();
        repository.sumForeign();
    }
}
