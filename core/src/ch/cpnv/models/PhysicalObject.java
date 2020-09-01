package ch.cpnv.models;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class PhysicalObject extends Sprite {

    public PhysicalObject(Texture texture, int srcX, int srcY, int srcWidth, int srcHeight){
        super(texture,  srcX, srcY, srcWidth, srcHeight);
    }
}
