package ch.cpnv.gobangrybird;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import ch.cpnv.models.*;

public class GobAngryBird extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	Bird bird;
	Pig pig;
	Wasp wasp;
	Tnt tnt;
	Block block, block2, block3;
	Slingshot slingshot;
	Slingshotcache slingshotcache;

	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("background.jpg");
		bird = new Bird(0,0,512,501);
		pig = new Pig(0,0,922,814);
		wasp = new Wasp(0,0,960,635);
		tnt = new Tnt(0,0,894,894);
		block = new Block(0,0,84,84);
		block2 = new Block(0,0,84,84);
		slingshot = new Slingshot(0,0,98,295);
		slingshotcache = new Slingshotcache(0,0,98,295);
		setSize();
		setPosition();
	}

	@Override
	public void render () {


		update();

		batch.begin();
			batch.draw(img, 0, 0);
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
			//draw tnt
			tnt.draw(batch);
			//draw block
			block.draw(batch);
			block2.draw(batch);
		batch.end();

	}

	public void setSize(){
		bird.setSize(100,100);
		pig.setSize(100,100);
		wasp.setSize(150,150);
		tnt.setSize(100,100);
	}

	public void setPosition(){
		bird.setPosition(120,410);
		pig.setPosition(780,200);
		wasp.setPosition(1500,500);
		tnt.setPosition(560,280);
		block.setPosition(500,200);
		block2.setPosition(584,200);
		slingshot.setPosition(120,200);
		slingshotcache.setPosition(120,200);
	}

	public void update(){
		bird.translate(0,-1);
	}

	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
