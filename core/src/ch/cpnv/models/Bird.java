package ch.cpnv.models;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.MathUtils;

public class Bird extends MovingObject {
    boolean moving = false;
    float time;
    float v0;
    float angle;
    MathUtils math;
    private int originX;
    private int originY;

    public Bird(int srcX, int srcY, int srcWidth, int srcHeight){
        super(new Texture("bird.png"),  srcX,  srcY,  srcWidth,  srcHeight);
        originX = 120;
        originY = 410;
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
            if(this.getY() < -500)this.reset();
        }
    }

    public void fire(/*float a, float v*/){
       /* v0 = v;
        angle = a;
        moving = true;*/

        if(!moving){
            double theta = 180.0 / Math.PI * Math.atan2(originX - this.getX(), originY - this.getY());
            this.angle = (float) (90-theta);
            double dist = Math.hypot(Math.abs(originX - this.getX()), Math.abs(originY-this.getY()));
            this.v0 = (float) (dist/15);
            this.moving = true;
        }
    }

    public void reset(){
        this.moving = false;
        this.setPosition(originX, originY);
        this.time = 0;
    }

    private float Vx(){
        return v0*math.cosDeg(angle);
    }
    private float Vy(float t){
        return v0*math.sinDeg(angle)-10*t;
    }

    public boolean getmoving(){ return moving; }
}
