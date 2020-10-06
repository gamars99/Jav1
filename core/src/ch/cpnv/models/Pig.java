package ch.cpnv.models;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import ch.cpnv.models.data.Word;

public class Pig extends TextualObject {
    private String text;
    private Bubble scream = null;
    private Word word;

    public Pig(int srcX, int srcY, int srcWidth, int srcHeight, String text) {
        super(new Texture("pig.png"), srcX, srcY, srcWidth, srcHeight, text);
        this.text = text;
    }

    public String getWord() { return super.getText();}

    @Override
    public void draw(Batch batch) {
        super.draw(batch);
        if (scream != null) {
            scream.draw(batch);
        }
    }

    public void sayWord(){
        this.scream = new Bubble(this);
    }

    public void shutUp(){
        this.scream = null;
    }
}
