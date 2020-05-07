package ch.cpnv.models;

import com.badlogic.gdx.graphics.Texture;

public class Wasp extends MovingObject {

    public Wasp(int srcX, int srcY, int srcWidth, int srcHeight) {
        super(new Texture("wasp.png"), srcX, srcY, srcWidth, srcHeight);
    }

    @Override
    public void accelerate(int dt) {

    }
    @Override
    public void setTexture(String s) {

    }
}
