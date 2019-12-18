public class demoArray {
    public static void main(String[] args) {
        int[] a = new int[10];
//        a[9] = 10;
        System.out.println(a[9]);
        for(int i=0 ; i<a.length ; i++) {
            a[i] =i;
        }
        for(int i=0 ; i<a.length ; i++) {
            System.out.println(a[i]);
        }

                                                //Sắp xếp tăng dần và max
        int[] number = {3,2,0,9,0,7};
        for(int i=1 ; i<number.length-1 ; i++) {
            for(int j=i+1 ; j<number.length ; j++) {
                if(number[i] > number[j]) {
                    int tg = number[i];
                    number[i] = number[j];
                    number[j] = tg;
                }
            }
        }

        System.out.print("Mảng sắp xếp tăng dần trừ vị trí đầu là: ");
        for(int i=0 ; i<number.length ; i++) {
            System.out.print(number[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < number.length; i++) {
            System.out.println("Phần tử lớn nhất trong mảng(C1) là: " +number[0]);
            System.out.println("Phần tử lớn thứ hai trong mảng là: " +number[1]);
            break;
        }

                                                //Tìm max trong dãy C2
        int max = number[0];
        for(int i=0 ; i<number.length ; i++) {
            if(max < number[i]) {
                max = number[i];
            }
        }
        System.out.println("Số lớn nhất trong mảng(C2) là: " + max);
                                                //Tìm max trong dãy C3
        int max1 = number[0];
        int count = 0;
        for(int i=0 ; i<number.length ; i++) {
            count = 0;
            for(int j=i+1 ; j<number.length ; j++) {
                count = number[i] > number[j] ? number[i] : number[j];
            }
            if(max1 < count) {
                max1 = count;
            }
        }
        System.out.println("Số lớn nhất trong mảng(C3) là: " + max1);
    }
}
