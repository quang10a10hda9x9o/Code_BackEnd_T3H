package Boxcing;

import java.util.Random;

public class Boxer {
    String name;
    int dame;
    int hp;
    int missRate;

    public Boxer(String name, int dame, int hp, int missRate) {
        this.name = name;
        this.dame = dame;
        this.hp = hp;
        this.missRate = missRate;
    }

    int decreaseHp(int dame){
        this.hp -= dame;
        return this.hp;
    }

    public void hit(Boxer boxer) {
        Random r = new Random();
        this.missRate = r.nextInt(100);
        if(boxer.missRate>70) {
            System.out.println(this.name + "Đã đánh trượt" + boxer.name);
            System.out.println(this.name + " Miss : " + this.missRate);
            System.out.println(boxer.name + " Miss : " + boxer.missRate);
        }else {
            boxer.decreaseHp(this.dame);
            System.out.println(this.name + " HP : " + this.hp + " Miss :" + this.missRate);
            System.out.println(boxer.name + " HP : " + this.hp + " Miss :" + boxer.missRate);
        }
    }
}


