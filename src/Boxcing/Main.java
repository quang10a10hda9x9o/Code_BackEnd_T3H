package Boxcing;

public class Main {
    public static void main(String[] args) {
        Boxer boxer1 = new Boxer("Quang",10,100,40);
        Boxer boxer2 = new Boxer("Chien",15,100,40);
        int round = 0;
        if(boxer1.dame > boxer2.dame) {
            round = 2;
        } else {
            round = 1;
        }
        while(boxer1.hp > 0 && boxer2.hp >0) {
            if(round % 2 == 0) {
                boxer2.hit(boxer1);
            } else {
                boxer1.hit(boxer2);
            }
            round++;
        }
    }
}
