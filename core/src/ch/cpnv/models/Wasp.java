package ch.cpnv.models;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.MathUtils;

import java.util.Random;

public class Wasp extends MovingObject {
    MathUtils math;
    float x;
    float y;
    float time;

    public Wasp(int srcX, int srcY, int srcWidth, int srcHeight) {
        super(new Texture("wasp.png"), srcX, srcY, srcWidth, srcHeight);
    }

    @Override
    public void accelerate(int dt) {

    }
    @Override
    public void setTexture(String s) {

    }

    public void move(int dt) {
        time += dt;
        if(time % 11 == 0) {
            x = -10 + (int) (Math.random() * ((10 - (-10)) + 1));
            y = -10 + (int) (Math.random() * ((10 - (-10)) + 1));
            this.translate(x, y);
        }


    }
}
