package ch.cpnv.models;

import com.badlogic.gdx.graphics.Texture;

public class Bird extends MovingObject {

    public Bird(int srcX, int srcY, int srcWidth, int srcHeight){
        super(new Texture("bird.png"),  srcX,  srcY,  srcWidth,  srcHeight);
    }

    @Override
    public void accelerate(int dt) {

    }

    @Override
    public void setTexture(String s) {

    }
}
