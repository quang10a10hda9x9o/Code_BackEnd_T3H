package kickBall1;

import java.util.Random;

public class Ball {
    float m;
    float v;
    float s;
    float sum;

    public Ball(float m, float v) {
        this.m = m;
        this.v = v;
    }

    public float s(Person person) {
        s = m*v*person.f;
        this.sum += s;
        return this.sum;
    }
}
