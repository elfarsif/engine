package io.github.elfarsif.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import io.github.elfarsif.dto.GameModelDto;
import io.github.elfarsif.dto.SpriteDto;

import java.util.List;

public final class Game extends ApplicationAdapter {
    private final GameModelDto gameModelDto;
    private SpriteBatch batch;
    private BitmapFont font;

    public Game(GameModelDto gameModelDto){
        this.gameModelDto = gameModelDto;
//        GameModel gameModel = mapper.toModel(gameModelDto);
    }

    @Override
    public void create() {
        batch = new SpriteBatch();
        font = new BitmapFont(); // default font
        System.out.println("FROM GAME__"+this.gameModelDto);
        List<SpriteDto> spriteDTOs = this.gameModelDto.getSpriteDtos();
        Texture texture = new Texture(Gdx.files.absolute(spriteDTOs.get(0).getFilepath()));

    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.begin();
        font.draw(batch, "Hello LibGDX!", 100, 150);
        batch.end();
    }

    @Override
    public void dispose() {
        batch.dispose();
        font.dispose();
    }
}
