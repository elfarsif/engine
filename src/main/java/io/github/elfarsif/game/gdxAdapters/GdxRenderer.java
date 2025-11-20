package io.github.elfarsif.game.gdxAdapters;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import io.github.elfarsif.game.model.Drawable;

import java.util.HashMap;
import java.util.Map;

public final class GdxRenderer {
    private final SpriteBatch batch;
    //Caching should be moved, preferably a system where Textures are preloaded before renderer
    private final Map<String, Texture> textureCache = new HashMap<>();

    public GdxRenderer(SpriteBatch batch){
        this.batch = batch;
    }

    public void draw(Drawable drawable, float x, float y) {
        Texture texture = this.getTexture(drawable.getImage());
        batch.draw(texture,x,y,drawable.getWidth(),drawable.getHeight());
    }

    private Texture getTexture(Drawable drawable) {
        return textureCache.computeIfAbsent(drawable.getFilepath(), path ->
                new Texture(Gdx.files.absolute(path))
                );
    }
}
