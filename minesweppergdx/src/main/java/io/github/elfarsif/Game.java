package io.github.elfarsif;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class Game extends ApplicationAdapter {
    private SpriteBatch batch;
    private BitmapFont font;
    private static final int SCALE =3;
    private static final int TILESIZE =16*SCALE;
    private static final int BOARD_WIDTH = 10;
    private static final int BOARD_HEIGHT = 10;
    private List<Tile> tileRow;
    private Tile tile1,tile2;
    private Sprite tileUnknown;
    private Board board;

    @Override
    public void create() {
        batch = new SpriteBatch();
        font = new BitmapFont();

        this.tileUnknown = new Sprite(new Texture(Gdx.files.absolute("C:\\Users\\fnelf\\Documents\\java projects\\engine\\minesweppergdx\\src\\main\\resources\\TileUnknown.png")));
        this.tileUnknown.setSize(TILESIZE,TILESIZE);

        this.tileRow = new ArrayList<>();
        int rowX=0;
        for (int i = 0;i<BOARD_WIDTH;i++){
                tileRow.add(new Tile(tileUnknown,rowX,0));
            rowX+=TILESIZE;
        }

        int t = 2;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(1,1);
        map.put(2,2);
        map.put(3,2);

        int[] ans = new int[2];
        for (Integer number: map.keySet()){

        }


        List<List<Tile>> tiles = new ArrayList<>();
        tiles.add(this.tileRow);
        this.board = new Board(tiles);
    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.begin();
        this.draw(batch);
        batch.end();
    }

    private void draw(SpriteBatch batch) {
//        this.tileUnknown.draw(batch);
        this.board.draw(batch);

    }

    @Override
    public void dispose() {
        batch.dispose();
        font.dispose();
    }
}
