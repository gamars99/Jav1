package ch.cpnv.models;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.TimeUtils;

import java.util.Random;

import ch.cpnv.gobangrybird.GobAngryBird;

public class Wasp extends MovingObject {
    float x;
    float y;
    float time;
    Vector2 cycleLength = new Vector2(1300,900); // time (1000 = 1sec)
    Vector2 cycleScale = new Vector2(1920 / 3-getWidth(), 1080 / 4);
    Vector2 centerPos = new Vector2(1300, 500);

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
        /*time += dt;
        if(time % 11 == 0) {
            x = -10 + (int) (Math.random() * ((10 - (-10)) + 1));
            y = -10 + (int) (Math.random() * ((10 - (-10)) + 1));
            this.translate(x, y);
        }*/

        long globalCounter = TimeUtils.timeSinceMillis(GobAngryBird.startTime);
        float x  = (float) Math.sin(globalCounter/cycleLength.x) * cycleScale.x + centerPos.x;
        float y = (float) Math.cos(globalCounter/cycleLength.y) * cycleScale.y + centerPos.y;

        this.setPosition(x, y);


    }
}
