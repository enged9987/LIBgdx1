package gdxevent;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Gdxevent extends ApplicationAdapter implements InputProcessor{
    SpriteBatch batch;
    Texture img;
    Sprite sprite;
    @Override
    public void create () {
   	 batch = new SpriteBatch();
   	 img = new Texture("badlogic.jpg");
             	img = new Texture("badlogic.jpg");
            	sprite = new Sprite(img);
            	sprite.setPosition(Gdx.graphics.getWidth()/2 - img.getWidth()/2, Gdx.graphics.getHeight()/2 - img.getHeight()/2);
           	 
           	 
            	Gdx.input.setInputProcessor(this);
    }

    @Override
    public void render () {
   	 Gdx.gl.glClearColor(1, 0, 0, 1);
   	 Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
   	 batch.begin();
   	 batch.draw(sprite, sprite.getX(), sprite.getY(), sprite.getWidth()/2,sprite.getHeight()/2,
                    	sprite.getWidth(),sprite.getHeight(), sprite.getScaleX(),sprite.getScaleY(), sprite.getRotation());
   	 batch.end();
    }    


	@Override
	public boolean keyDown(int keycode) {
    	if(keycode== Input.Keys.LEFT){
        	sprite.translateX(-1f);
    	}
    	return false;
	}

	@Override
	public boolean keyUp(int i) {
    	//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            return false;
	}

	@Override
	public boolean keyTyped(char c) {
    	//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            return false;
	}

	@Override
	public boolean touchDown(int i, int i1, int i2, int i3) {
    	//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            return false;
	}

	@Override
	public boolean touchUp(int i, int i1, int i2, int i3) {
    	//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	return false;
        }

	@Override
	public boolean touchDragged(int i, int i1, int i2) {
    	//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	return false;
        }

	@Override
	public boolean mouseMoved(int i, int i1) {
    	//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            return false;
	}

	@Override
	public boolean scrolled(int i) {
    	//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return false;
	}
}
