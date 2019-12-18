package Collection;

import java.util.*;
import java.util.Set;


public class CollectionExample {
    public static void main(String[] args) {
        //Bình thường khởi tạo mảng TĨNH là : String[] list = new String[];
        //Đối với mảng tĩnh thì muốn thêm hoặc xóa ptu thì phải tạo 1 mảng mới để thêm hoặc bớt nó vào.
        List<Integer> test = new ArrayList<>();//Làm việc với kiểu dữ liệu động thì chỉ có kiểu object
        List<String> list = new LinkedList<>();//Khởi tạo 1 mảng ĐỘNG và có kiểu dữ liệu String
        List<String> list2 = new ArrayList<>();
        System.out.println(list.size());
        //arr.Length
        list.add("abc");
        list.add("bcd");
        list.add("def");
        list.add(1,"abc");
        list2.add("ABC");
        list.addAll(list2);
        list.addAll(1,list2);

        System.out.println(list.size());
        System.out.println("_______");
        System.out.println(list.contains("def"));//Kiểm tra có "def" trong mảng không
        //arr[i];
        System.out.println(list.get(1));//Lấy ra phần tử vị trí 1
        System.out.println(list.indexOf("abc"));//Tìm ra ptu ở vị trí đầu tiên
        for (String item : list) {
            System.out.println(item);
        }
//        list.clear(); Ứng dụng trong dọn rác
        System.out.println(list.isEmpty());
        System.out.println("________");
        list.remove("ABC");//Xóa phần tử tìm thấy đầu tiên
        list.set(0,"Quang");//Sửa lại phần tử
        list.toArray();//Chuyển từ mảng động về mảng tĩnh
        for (String item : list) {
            System.out.println(item);
        }
//        list.sort(); phải định nghĩa lại nếu muốn sắp xếp đối tượng

        List<String> tmp = Arrays.asList("123","456");
        System.out.println("Mảng tmp là: " + tmp);

        System.out.println("____________");
        Set<String> set = new HashSet<>();
        set.add("123");
        set.add("123");
        set.add("456");
        for(String s : set) {
            System.out.println(s);
        }

        Set<String> setInteger = new TreeSet<>(); // TreeSET sắp xếp giá trị tăng dần
        setInteger.add("cq52");
        setInteger.add("cq52");
        setInteger.add("ahh43dgfdg");
        setInteger.add("b11");
        for (String i : setInteger) {
            System.out.println(i);
        }

        Map<String,Integer> map = new TreeMap<>(); //TreeSMap sắp xếp giá trị tăng dần theo key
        map.put("3cjava",100);
        map.put("1aphp",200);
        map.put("2bC#",300);
        //map.entrySet();sẽ tách ra thành các entrySet
        //Duyệt qua key ptu Map
        for (String i : map.keySet()) {
            System.out.println("Key là: " + i);//lấy ra key
            System.out.println("Value là: " + map.get(i));//get(i) lấy ra giá trị của key
        }

        Map<String,List<Integer>> map2 = new TreeMap<>();
        List<Integer> isNumber = new ArrayList<>();
        isNumber.add(1);
        map2.put("d",isNumber);
        isNumber.add(2);
        map2.put("a",isNumber);
        isNumber.add(3);
        map2.put("a",isNumber);// Nếu key trung thì sẽ ghi đè
        for(String i: map2.keySet()) {
            System.out.println("Key là: " + i + " có value là: " + map2.get(i).size());
        }


        //                                      Đếm số lần xuất hiện dung map

        List<Integer> arr = Arrays.asList(1,2,1,1,3,2,5);
        Map<Integer,Integer> countMap = new HashMap<>();

        for(Integer i : arr) {
            if(countMap.containsKey(i)) {//duyet den so 1 check xem 1 da co trong map chua: dung true sai false
                countMap.put(i,countMap.get(i)+1);
            }else {
                countMap.put(i,1);
            }
            //Về tìm cách 2: Nếu bỏ if else mà chạy 1 vòng lặp for
        }
        System.out.println("__________");
        for(Integer key : countMap.keySet()) {
            System.out.println("Key là: " + key + " xuất hiện " + countMap.get(key));
        }
                                        //QUEUE
        System.out.println("__________");
        Queue<String> queue = new ArrayDeque<>();
        queue.add("Item 1");
        queue.add("Item 2");
        queue.add("Item 3");
        System.out.println(queue.poll());//Lấy ra item đầu tiên và xóa khỏi queue
        System.out.println(queue.peek());//Hàm lấy ra item đầu tiền của queue nhg ko xóa khỏi queue


                                        //STACK
        System.out.println("____________");
        Stack<String> stack = new Stack<>();
        stack.add("Item 1");
        stack.add("Item 2");
        System.out.println(stack.pop());//lấy ra và xóa thằng cuối cùng
        System.out.println(stack.peek());//Lấy ra thằng cuối cùng
    }
}
