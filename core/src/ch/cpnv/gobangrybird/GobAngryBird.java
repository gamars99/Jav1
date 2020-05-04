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
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("tnt.png");
		bird = new Bird();
		bird.setTexture("bird.png");
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 0, 0);
		//batch.draw(bird, 10, 0);
		batch.end();
	}

	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
