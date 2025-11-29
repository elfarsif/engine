package io.github.elfarsif.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import io.github.elfarsif.game.gdxAdapters.GdxRenderer;
import io.github.elfarsif.model.*;

public final class Game extends ApplicationAdapter {
    private final GameModel gameModel;
    private SpriteBatch batch;
    private GdxRenderer gdxRenderer;
    private Background background;

    public Game(GameModel gameModel){
        this.gameModel = gameModel;
        System.out.println("GAMEMODEL __________"+this.gameModel);
    }

    @Override
    public void create() {
        this.background = new Background(new Sprite(gameModel.getSprites().get(0).getName(),this.gameModel.getSprites().get(0).getImage()));
        this.batch = new SpriteBatch();
        this.gdxRenderer = new GdxRenderer(batch);

    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.begin();
        gdxRenderer.draw(this.background,0,0);
        batch.end();
    }

    @Override
    public void dispose() {
        batch.dispose();
    }
}
