package ch.cpnv.models;

import com.badlogic.gdx.graphics.Texture;
import ch.cpnv.models.data.Word;

public abstract class TextualObject extends PhysicalObject {

    protected String text;

    public TextualObject(Texture texture, int srcX, int srcY, int srcWidth, int srcHeight, String text) {
        super(texture, srcX, srcY, srcWidth, srcHeight);
        this.text = text;
    }
    protected String getText(){
        return this.text;
    }

}
