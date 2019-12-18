package ExcerciseTest;

import ExcerciseTest.BaiTap_01.Account;
import ExcerciseTest.BaiTap_02.CheckDate;
import ExcerciseTest.BaiTap_03.BillForeign;
import ExcerciseTest.BaiTap_03.BillVietNam;
import ExcerciseTest.BaiTap_03.Customer;
import ExcerciseTest.BaiTap_03.Repository;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(123,"Quang Đẹp Trai", 200);
        Account account1 = new Account(234,"Chiến Lùn", 100);

        account.credit(50);
        account.debit(10);
        account.tranferTo(account1 , 49);

        System.out.println("_______________________________");
        CheckDate checkDate = new CheckDate(28,02,2009);
        System.out.println(checkDate.toString());

        System.out.println("_______________________________");
        CheckDate date = new CheckDate(10,03,1999);
        Customer customer = new Customer(15,20,10);
        BillVietNam billVietNam = new BillVietNam(123,"Quang",date,customer);
        BillForeign billForeign = new BillForeign(234,"John",new CheckDate(20,10,2019),10,30);

        //Khởi tạo danh sách rỗng
        Repository repository = new Repository();
        repository.sumBill();
        repository.sumForeign();

        //Lấy ra danh sách trong kho
        List<BillVietNam> billVietNamList = repository.getBillVietNamList();
        List<BillForeign> billForeignList = repository.getBillForeignList();

        //Thêm vào danh sách
        billVietNamList.add(billVietNam);
        billForeignList.add(billForeign);

        //Update(cất) vào kho
        repository.setBillVietNamList(billVietNamList);
        repository.setBillForeignList(billForeignList);
        repository.sumBill();
        repository.sumForeign();
    }
}
