package scope;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Superman s = new Superman();
        System.out.println(s.name);
        System.out.println(s.address);

        String abc = "123";
        String def = "123";
        //Trong bộ nhớ heap có 1 vùng nhớ gọi là String Bool( chỉ có String mới có thể lưu trong String Bool).
        //Khi mình tạo biến có giá trị giống nhau(trong bộ nhớ String bool) trong bộ nhớ heap, tự gán abc = "123" = def;
        String hjk = new String("123");
        //Khi khởi tạo biến qua từ khóa NEW thì lưu trong bộ nhớ heap mặc dù bằng giá trị nên ko lưu trong bộ nhớ String bool.
        //Còn biến CỤC BỘ thì được lưu trong bộ nhớ Stack, chạy xog hàm tự hủy
        //String có tính chất ko thay đổi giá trị trừ khi bạn gán giá trị mới cho nó.


//        String a = "123";
//        String b = a;
//        String a = "345";
//        String b = "789";
//        Khi đó ô nhớ "123" thì vẫn còn đến khi nó quét xog bị hệ thống tự remove đi


        System.out.println(abc == def);//TRUE
        System.out.println(abc == hjk);//FALSE

        System.out.println(abc.equals(def));//TRUE
        System.out.println(abc.equals(hjk));//TRUE
        //EQUALS: là 1 phương thức bắt nguồn từ 1 object
        //EQUALS: phương thức so sánh 2 đối tượng với nhau về phần giá trị hay nội dung(bỏ qua so sánh địa chỉ)
        // và tìm hiểu phương thức HASH CODE


        Integer number1 = 10;
        int number2 = 10;
        //Biến object tự convert về biến nguyên thủy và ngược lại
        //kiểu int có thể null
        //kiểu objecr ko thể null nên phải convert về int để có thể null
        Integer number3 = new Integer(10);
        System.out.println("__________333");
        System.out.println(number2 == number3);
        System.out.println(number2 == number1);
        System.out.println(number1 == number3);

        System.out.println("_________");
        Dog d1 = new Dog("Shiba", 10);
        Dog d2 = new Dog("Shiba", 10);

        System.out.println(d1 == d2);//false
        System.out.println(d1.equals(d2));//false
        //chỉ Interger ms có tính năng connver
        //Ngoài đợi thực ko thể tồn tại 2 đối tg khác nhau, nhưng trong lập trình thì mik CÓ THỂ chỉnh điều kiện cho nó bằng nhau
        //List và Set trong java




                                                // MẢNG
        int[] arr1 = new int[]{1,2,3,4};
        System.out.print("Mảng arr là: ");
        for(int i=0 ; i<arr1.length ; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        int[] arr2 = new int[]{5,6,7,8};
        System.out.print("Mảng arr2 là: ");
        for(int i=0 ; i<arr2.length ; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        int sumLength = arr1.length + arr2.length;
//        System.out.println(sumLength);
        int[] arr3 = new int[sumLength];
        for(int i=0 ; i<sumLength ; i++) {
            if(i < arr1.length) {
                arr3[i] = arr1[i];
            } else {
                arr3[i] = arr2[i - arr1.length];
            }
        }
        System.out.print("Mảng arr3 đã ghép là: ");
        for(int i=0 ; i<arr3.length ; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}
