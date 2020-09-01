package ch.cpnv.models;

import com.badlogic.gdx.graphics.Texture;

public class Slingshot extends PhysicalObject {

    public Slingshot(int srcX, int srcY, int srcWidth, int srcHeight) {
        super(new Texture("slingshot1.png"), srcX, srcY, srcWidth, srcHeight);
    }
}
