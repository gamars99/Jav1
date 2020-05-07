package ch.cpnv.models;

import com.badlogic.gdx.graphics.Texture;

import javax.xml.datatype.Duration;

public class Bubble extends TextualObject {
    private Duration duration;

    public Bubble(Texture texture, int srcX, int srcY, int srcWidth, int srcHeight) {
        super(texture, srcX, srcY, srcWidth, srcHeight);
    }
}
