package Exercise;

public class DeBai {
    //                                                  BÀI 1
//    Mô tả: class Account có 3 biến private: id, name, balance.
//
//    Một hàm khởi tạo Account 3 thuộc tính id, name, balance.
//
//    credit(amount: int): Nạp tiền vào tài khoản, tài khoản sẽ được cộng lên một khoản amount. Kiểm tra tham số đầu vào phải là số dương.
//
//    debit(amount: int): Thanh toán tiền, tài khoản sẽ được trừ một số lượng tiền amount. Nếu số tiền thanh toán lớn hơn số tiền trong tài khoản thì thông báo thanh toán không thành công.
//
//    tranferTo(account: Account,int amount), chuyển tiền từ tài khoản này cho tài khoản khác. Ví dụ Account A có balance = 50, B có balance = 10. A.tranferTo(B, 10). A (balance = 40), B (balance = 20). Chú ý kiểm tra nếu chuyển số tiền nhiều hơn tài khoản hiện A có thông báo lỗi chuyển tiền không thành công.
//



    //                                                  BÀI 2
//            Bài 2 :
//    Triển khai class Date có 3 thuộc tính : day,month,year
//
//    Phương thức isLeapYear(): Kiểm tra năm nhuận, năm nhuận là năm chia hết cho 400 hoặc chia hết cho 4 nhưng không chia hết cho 100.
//
//    kiểm tra ngày tháng năm hợp lệ thì gợi ý:
//
//    Month: có giá trị từ 1 – 12
//
//    Các tháng 1, 3, 5, 7, 8, 10, 12 thì số ngày tối đa là 31 ngày
//
//    Tháng 2: nếu là năm nhuận thì số ngày tối đa là 29, còn lại là 28
//
//    Các tháng còn lại tối đa là 30 ngày.




                                                //BÀI 3
//            Bài 3:Xây dựng chương trình tính tiền điện của khách hàng. Thông tin bao gồm các loại khách hàng:
//        + Khách Việt Nam: mã khách hàng, họ tên, ngày ra hóa đơn(ngày, tháng, năm), đơn giá, định mức.
//    Thành tiền được tính như sau:
//            -Nếu số lượng <= định mức thì: thành tiền = số lượng * đơn giá.
//            -Ngược lại thì: thành tiền = số lượng * đơn giá + số KW vượt định mức * đơn giá * 2,5.
//        + Khách hàng nước ngoài: mã khách hàng, họ tên, ngày ra hóa đơn(ngày, tháng, năm), quốc tịch, số lượng, đơn giá
//    Thành tiền được tính như sau:
//        -thành tiền = số lượng * đơn giá;
//    Thực hiện các yêu cầu sau:
//        + Xây dựng chức năng thừa kế.
//        + Nhập xuất danh sách các đơn hàng
//        + Tính tổng số lượng đơn hàng
//        + Tính trung bình thành tiền của khách hàng nước ngoài
//        + Xuất ra các hoá đơn trong tháng 9 năm 2013( của 2 loại khách hàng).
}
