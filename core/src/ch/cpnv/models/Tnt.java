package ch.cpnv.models;

import com.badlogic.gdx.graphics.Texture;

public class Tnt extends PhysicalObject {
    private int negativePoints;

    public Tnt(int srcX, int srcY, int srcWidth, int srcHeight) {
        super(new Texture("tnt.png"), srcX, srcY, srcWidth, srcHeight);
    }
}
