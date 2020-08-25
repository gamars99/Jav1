package ch.cpnv.gobangrybird;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.TimeUtils;

import java.awt.SystemTray;
import java.util.ArrayList;
import java.util.Random;
import ch.cpnv.models.*;

public class GobAngryBird extends ApplicationAdapter implements InputProcessor {
	public static long startTime = TimeUtils.millis();
	public SpriteBatch batch;
	public Texture img;
	public Bird bird;
	public Pig pig;
	public Wasp wasp;
	//Tnts
	public Tnt tnt;
	public ArrayList<Tnt> fTnt;
	//blocks
	public Block block;
	public ArrayList<Block> fBlock;
	public Slingshot slingshot;
	public Slingshotcache slingshotcache;
	public float dt;
	public MathUtils math;
	public float fire;
	public InputProcessor processor;

	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("background.jpg");
		bird = new Bird(0,0,512,501);
		pig = new Pig(0,0,922,814);
		wasp = new Wasp(0,0,960,635);

		fTnt = new ArrayList<Tnt>();
		for(int i = 0; i < 5; i++){
			tnt = new Tnt(0,0,894,894);
			fTnt.add(tnt);
		}

		fBlock = new ArrayList<Block>();
		for(int i = 0; i < 15; i++){
			block = new Block(0, 0, 84, 84);
			fBlock.add(block);
		}
		//block2 = new Block(0,0,84,84);
		slingshot = new Slingshot(0,0,98,295);
		slingshotcache = new Slingshotcache(0,0,98,295);
		setSize();
		setPosition();
		Gdx.input.setInputProcessor(this);
	}

	@Override
	public void render () {
		batch.begin();
			batch.draw(img, 0, 0);
			//draw tnt
			for(Tnt tnt : fTnt){
				tnt.draw(batch);
			}
			//draw block
			for(Block block : fBlock){
				block.draw(batch);
			}
			//draw slingshot
			slingshot.draw(batch);
			//draw birg
			bird.draw(batch);
			//draw slingshotcache
			slingshotcache.draw(batch);
			//draw pig
			pig.draw(batch);
			//draw wasp
			wasp.draw(batch);
		batch.end();
		update();
		touched();
	}

	public void setSize(){
		bird.setSize(100,100);
		pig.setSize(100,100);
		wasp.setSize(150,150);
		for(Tnt tnt : fTnt) {
			tnt.setSize(100, 100);
		}
	}

	public void setPosition(){
		int iTnt = 0;
		int iBlock = 0;
		bird.setPosition(120,410);
		pig.setPosition(1080,280);
		wasp.setPosition(1500,500);
		for(Tnt tnt : fTnt){
			System.out.print(fTnt.size());
			tnt.setPosition(580,280+90*iTnt);
			iTnt++;
		}
		for(Block block : fBlock) {
			block.setPosition(500+84*iBlock,200);
			iBlock++;
		}
		slingshot.setPosition(120,200);
		slingshotcache.setPosition(120,200);
	}

	public void update(){
		dt = Gdx.graphics.getDeltaTime();
		bird.move(dt);
		wasp.move((int) dt);
	}

	public void touched(){
		Rectangle rectanglebird = bird.getBoundingRectangle();
		Rectangle rectanglepig = pig.getBoundingRectangle();
		Rectangle rectanglewasp = wasp.getBoundingRectangle();
		//touche pig
		boolean birdToPigisOverlaping = rectanglebird.overlaps(rectanglepig);

		//touche wasp
		boolean birdToWaspisOverlaping = rectanglebird.overlaps(rectanglewasp);

		if(birdToPigisOverlaping || birdToWaspisOverlaping){
			bird.reset();
		}
	}

	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}

	@Override
	public boolean keyDown(int keycode) {
		return false;
	}

	@Override
	public boolean keyUp(int keycode) {
		return false;
	}

	@Override
	public boolean keyTyped(char character) {
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		bird.fire();
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		if(!bird.getmoving()) {
			bird.setPosition(bird.getX() + Gdx.input.getDeltaX(), bird.getY() - Gdx.input.getDeltaY());
		}
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		return false;
	}

	@Override
	public boolean scrolled(int amount) {
		return false;
	}
}
