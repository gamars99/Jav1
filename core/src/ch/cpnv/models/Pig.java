package ch.cpnv.models;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

public class Pig extends TextualObject {
    private String text;

    public Pig(int srcX, int srcY, int srcWidth, int srcHeight, String text) {
        super(new Texture("pig.png"), srcX, srcY, srcWidth, srcHeight);
        this.text = text;
    }

    public void sayWord(){

    }

    public String getText() { return text;}
}
