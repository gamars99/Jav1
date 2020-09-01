/*package ch.cpnv.models;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.math.Vector2;

import ch.cpnv.gobangrybird.GobAngryBird;
import ch.cpnv.models.*;

import java.util.ArrayList;
import java.util.List;

public final class Scenery {

    public static final int BLOCK_SIZE = 30;
    private List<Pig> pigs;
    private List<Block> boxes;

    private List<PhysicalObject> scene;

    public Scenery() {
        scene = new ArrayList<>();
        generateBoxes();
        generatePigs();
    }

    public void addElement(PhysicalObject object) {
        scene.add(object);
    }

    public void addFloor() {
        for (int i = 5; i < 1920 / BLOCK_SIZE; i++) {
            addElement(new Block(new Vector2(i * BLOCK_SIZE, 40), BLOCK_SIZE, BLOCK_SIZE));
        }
    }

    public void draw(Batch batch) {
        for (Pig pig : pigs) {
            pig.draw(batch);
        }
        for (Block box : boxes) {
            Block.draw(batch);
        }
    }

//    public void drawObject(Batch batch, List<PhysicalObject> objects) {
//        for (PhysicalObject object : objects) {
//            object.draw(batch);
//        }
//    }

    public void generatePigs() {
        pigs = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Vector2 randomPos = new Vector2(AngryWordsMain.rand.nextInt(AngryWordsMain.WORLD_WIDTH), AngryWordsMain.FLOOR_HEIGHT);
            pigs.add(new Pig(randomPos, 75, 75));
        }
    }

    public void generateBoxes() {
        boxes = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Vector2 randomPos = new Vector2(AngryWordsMain.rand.nextInt(AngryWordsMain.WORLD_WIDTH), AngryWordsMain.FLOOR_HEIGHT);
            Box boxToAdd = new Box(randomPos, 75, 75);
            if (isBoxXBetween(boxToAdd.getX(), boxToAdd.getX() + boxToAdd.getWidth())) {
                boxToAdd.setY(boxToAdd.getY() + boxToAdd.getHeight());
            }
            boxes.add(boxToAdd);
        }
    }

    public boolean isBoxXBetween(float a, float b) {
        for (Box box : boxes) {
            if (isObjectXBetween(box, a, b)) {
                return true;
            }
        }
        return false;
    }

    public boolean isObjectXBetween(PhysicalObject object, float a, float b) {
        return (a < object.getX() + object.getWidth() && a > object.getX()) ||
                (b < object.getX() + object.getWidth() && b > object.getX());
    }
}*/