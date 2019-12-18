import javax.sound.midi.Soundbank;

public class demoString {
    public static void main(String[] args) {
        String str = "Đây là đoạn văn str";
        System.out.println(str.length());
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str);
        str = "Đây là đoạn văn str thứ 2";
        System.out.println(str);
        String test = "Đây là đoạn văn";
        String testB = "Đây là đoạn văn B";
        String testC = "Đây là đoạn C";
        //Một số method chính
        //charAt() :xuất phần tử đầu
        System.out.println(str.charAt(2));
        //concat() :nối chuỗi
        System.out.println(str.concat(" của Quang"));
        //length() :độ dài chuỗi
        String a = "abcd";
        System.out.println(a.length());
        //conpareTo() :lấy giá trị ASCII trừ cho nhau
        System.out.println(str.compareTo(test));
        System.out.println(test.compareTo(str));
        System.out.println(test.compareTo(testB));
        // int + String + int => String
        System.out.println(str.length() + "-" + test.length());
        System.out.println(testB.length() + "-" + testC.length());
        //contain() : tìm kiếm trong chuỗi ký tự đúng trả về true
        System.out.println(str.contains("Q"));
        //equals : so sánh 2 chuỗi
        System.out.println(str.equals("Đây là đoạn văn str thứ 2"));




                                                //Bài tập
                                                //Đếm số lần xuất hiện nhiều nhất trong chuỗi
        String k = "Bdddffff   fffjf   FFFFFjjfjjfjf";
        int max1 = 0;
        char l = k.charAt(0);
        int count1 = 0;
        for(int i=0 ; i<k.length() ; i++) {
            count1 = 0;
            for(int j=i ; j<k.length() ; j++) {
                if(k.charAt(i) == k.charAt(j)) {
                    count1++;
                }
            }
            if(max1 < count1) {
                max1 = count1;
                l = k.charAt(i);
            }
        }

        System.out.println("Số lần xuất hiện nhiều nhất ký tự " + l + " là " + max1 + " trong chuỗi " + k);

                                                //Tính tổng các chữ số có trong dãy
        int[] arr1 = {1,2,3,3,4,5,6,2,2,3,4};
        int sum = 0;
        for(int i=0 ; i<arr1.length ; i++) {
            sum += arr1[i];
        }
        System.out.println("Tổng các ký tự trong dãy đó là: " + sum);


                                                //StringBuffer : chuỗi có thể sửa đổi
        StringBuffer str1 = new StringBuffer("Hellooo");
//        String str2 = " bố ";
//        str1.append(str2);
        str1.append(" Quang."); //chèn thêm vào cuối
        System.out.println(str1);
        str1.insert(6, "Bố "); //chèn thêm vào vị trí
        System.out.println(str1);
        str1.replace(5 , 6, " "); //thay thế
        System.out.println(str1);
        str1.delete(9,11); //xóa
        System.out.println(str1);
        str1.reverse(); // đảo ngược
        System.out.println(str1);
        str1.reverse();
        System.out.println(str1);
    }
}
