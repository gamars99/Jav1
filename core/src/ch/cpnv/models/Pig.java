package ch.cpnv.models;

import com.badlogic.gdx.graphics.Texture;

public class Pig extends TextualObject {
    private int Points;

    public Pig(int srcX, int srcY, int srcWidth, int srcHeight) {
        super(new Texture("pig.png"), srcX, srcY, srcWidth, srcHeight);
    }

    public void sayWord(){

    }
}
