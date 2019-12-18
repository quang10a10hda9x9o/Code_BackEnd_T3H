package exception;

public class ExampleException {
    public static void main(String[] args) {
        int a = 5;
        int A = 5000;
        int B = 3000;
        int C = -0;
        try {//Đoạn code tiềm ẩn lỗi, bắt buộc phải có CATCH HOẶC FINALLY
            //TRY bắt lỗi ở đâu thì nhảy luôn xuống CATCH catch ko tìm thấy xuống catch dưới và đến hết rồi chạy sang
            //FINALLY và kết thúc
            System.out.println("Bắt đầu thực hiện phép chia");
//            String b = null;
//            System.out.println(b.length());
//            System.out.println("Kết quả của phép chia là: " + a / 0);
            System.out.println("Kết quả là: " + a/1);
            System.out.println("_____________________________________");
            if(C > A) {
                 throw new MoneyException("Số tiền vượt quá hạn cho phép.");
            }if(C <= 0 ) {
                throw new MoneyException("Số tiền chuyển không được âm");
            } else {
                 throw new MoneyException("Chuyển tiền thành công.");
            }
        }catch (MoneyException moneyException) {
            System.out.println(moneyException.getMessage());
        }
        catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("Null pointer");
        }
        catch (Exception e) {
            e.printStackTrace();//Hiện rõ lỗi và dòng
            System.out.println("Không được phép chia cho số 0");
        }
    }
}
