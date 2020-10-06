package ch.cpnv.models;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.math.Vector2;

import java.util.Vector;

import javax.xml.datatype.Duration;

public class Bubble extends TextualObject {
    private static final String PICNAME = "bubble.png";
    private static final int WIDTH = 260;
    private static final int HEIGHT = 160;
    private static final int BUBBLE_OFFSET = 20;
    private static final int TEXT_OFFSET_x = 40;
    private static final int TEXT_OFFSET_y = 100;

    private BitmapFont font;

    public Bubble(Pig pig){
        super(new Texture(PICNAME), WIDTH, HEIGHT, TEXT_OFFSET_x, TEXT_OFFSET_y, pig.getWord());
        setBounds(pig.getX()-WIDTH/2-BUBBLE_OFFSET, pig.getY()+100, WIDTH, HEIGHT);
        font = new BitmapFont();
        font.setColor(Color.BLACK);
        font.getData().setScale(2);
    }

    public void draw(Batch batch){
        super.draw(batch);
        font.draw(batch, getText(), getX()+TEXT_OFFSET_x, getY()+TEXT_OFFSET_y);
        //font.draw(batch, "alskjd", getX()+TEXT_OFFSET_x, getY()+TEXT_OFFSET_y);
    }
    /*public Bubble(Texture texture, int srcX, int srcY, int srcWidth, int srcHeight) {
        super(texture, srcX, srcY, srcWidth, srcHeight);
    }*/
}
