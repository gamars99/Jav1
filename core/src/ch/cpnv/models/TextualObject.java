package ch.cpnv.models;

import com.badlogic.gdx.graphics.Texture;

public abstract class TextualObject extends PhysicalObject {

    protected String word;

    public TextualObject(Texture texture, int srcX, int srcY, int srcWidth, int srcHeight) {
        super(texture, srcX, srcY, srcWidth, srcHeight);
    }

    protected String getWord(){
        return word;
    }

}
