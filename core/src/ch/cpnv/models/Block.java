package ch.cpnv.models;

import com.badlogic.gdx.graphics.Texture;

public class Block extends PhysicalObject {

    public Block(int srcX, int srcY, int srcWidth, int srcHeight) {
        super(new Texture("block.png"), srcX, srcY, srcWidth, srcHeight);
    }
}
