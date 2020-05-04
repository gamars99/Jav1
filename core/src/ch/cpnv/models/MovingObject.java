package ch.cpnv.models;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.math.Vector2;

public abstract class MovingObject extends PhysicalObject {

    public Vector2 speed;

    public void move(int dt){

    }

    public abstract void accelerate(int dt);

    public abstract void setTexture(String s);
}
