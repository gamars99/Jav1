package ch.cpnv.models;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.MathUtils;

public class Bird extends MovingObject {
    boolean moving = true;
    float time;
    float v0;
    float angle;
    MathUtils math;

    public Bird(int srcX, int srcY, int srcWidth, int srcHeight){
        super(new Texture("bird.png"),  srcX,  srcY,  srcWidth,  srcHeight);
    }

    @Override
    public void accelerate(int dt) {

    }

    @Override
    public void setTexture(String s) {

    }

    public void move(float dt) {

        if(moving){
            time += dt;
            this.translate(this.Vx(), this.Vy(time));
        }
    }

    public void fire(float a, float v){
        v0 = v;
        angle = a;
        moving = true;
    }

    private float Vx(){
        return v0*math.cosDeg(angle);
    }
    private float Vy(float t){
        return v0*math.sinDeg(angle)-10*t;
    }
}
