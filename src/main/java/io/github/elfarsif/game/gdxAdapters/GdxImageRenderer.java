package io.github.elfarsif.game.gdxAdapters;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import io.github.elfarsif.game.model.Image;

import java.util.HashMap;
import java.util.Map;

public class GdxImageRenderer implements ImageRenderer {
    private final SpriteBatch batch;
    private final Map<String, Texture> textureCache = new HashMap<>();

    public GdxImageRenderer(SpriteBatch batch){
        this.batch = batch;
    }

    @Override
    public void draw(Image image, float x, float y) {
        Texture texture = this.getTexture(image);
        batch.draw(texture,x,y,image.getWidth(),image.getHeight());
    }

    private Texture getTexture(Image image) {
        return textureCache.computeIfAbsent(image.getFilepath(), path ->
                new Texture(Gdx.files.absolute(path))
                );
    }
}
