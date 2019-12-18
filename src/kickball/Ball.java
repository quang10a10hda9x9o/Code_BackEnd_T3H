package kickball;

public class Ball {
    int m;
    int distence;

    Ball(int m, int distance) {   //Hàm khởi tạo
        this.m = m;
        this.distence = distance;
    }

    public int move(int f) {
        int s = f * m;
        this.distence += s;
        return this.distence;
    }

//    public void moveAnother(int f) {
//        int s = f * m;
//        this.distence += s;
//        System.out.println("Khoang cach hien tai la: " + this.distence);
//    }
}
