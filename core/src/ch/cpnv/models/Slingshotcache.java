package ch.cpnv.models;

import com.badlogic.gdx.graphics.Texture;

public class Slingshotcache extends PhysicalObject {

    public Slingshotcache(int srcX, int srcY, int srcWidth, int srcHeight) {
        super(new Texture("slingshot2.png"), srcX, srcY, srcWidth, srcHeight);
    }
}
