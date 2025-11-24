package io.github.elfarsif.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import io.github.elfarsif.dto.GameModelDto;
import io.github.elfarsif.game.gdxAdapters.GdxRenderer;
import io.github.elfarsif.game.model.Background;
import io.github.elfarsif.game.model.Image;
import io.github.elfarsif.game.model.Sprite;

public final class Game extends ApplicationAdapter {
    private final GameModelDto gameModelDto;
    private SpriteBatch batch;
    private Image image;
    private GdxRenderer gdxRenderer;
    private Background background;

    public Game(GameModelDto gameModelDto){
        this.gameModelDto = gameModelDto;
//        GameModel gameModel = mapper.toModel(gameModelDto);
        System.out.println("GAMEMODELDTO __________"+gameModelDto);
    }

    @Override
    public void create() {
        this.image = new Image(
                gameModelDto.getSpriteDtos().get(0).getImageDto().getWidth(),
                gameModelDto.getSpriteDtos().get(0).getImageDto().getHeight(),
                gameModelDto.getSpriteDtos().get(0).getImageDto().getFilepath());
        this.background = new Background(new Sprite(gameModelDto.getSpriteDtos().get(0).getName(),this.image));
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
