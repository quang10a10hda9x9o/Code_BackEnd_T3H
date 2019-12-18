package Test_Collection;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();
        List<String> arr1 = new ArrayList<>();
        arr.add("QuangBo");
        arr.add("BinhCon");
        arr.add("NgocCon");
        arr.add("NgocCon");
        arr.add("NgocCon");
        arr1.add("QuangDepTrai");
        arr1.add("QuangBo");

        System.out.println("Lớp arr là: " + arr);
        System.out.println("Lớp arr1 là: " + arr1);
        arr.removeAll(arr1);
        System.out.println("_________");
        System.out.println("Lớp arr là: " + arr);
        System.out.println("Lớp arr1 là: " + arr1);
    }
}
