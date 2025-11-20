package io.github.elfarsif;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Tile {
    private final Sprite sprite;
    private final int x,y;

    public Tile(Sprite sprite, int x, int y) {
        this.sprite = sprite;
        this.x = x;
        this.y = y;
    }


    public void draw(SpriteBatch batch) {
        batch.draw(sprite,x,y,sprite.getWidth(),sprite.getHeight());
    }


    public int getX() {        return x;    }
    public int getY() {        return y;    }

    public Sprite getSprite() {        return sprite;    }
}
