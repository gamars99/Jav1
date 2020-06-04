package ch.cpnv.models;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;

public abstract class MovingObject extends PhysicalObject {

    public Vector2 speed;

    public MovingObject(Texture texture, int srcX, int srcY, int srcWidth, int srcHeight) {
        super(texture,  srcX, srcY, srcWidth, srcHeight);
    }

    public abstract void accelerate(int dt);

    public abstract void setTexture(String s);
}
