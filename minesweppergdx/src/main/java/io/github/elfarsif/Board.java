package io.github.elfarsif;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.List;

public class Board {
    private final List<List<Tile>> tiles;

    public Board(List<List<Tile>> tiles) {
        this.tiles = tiles;
    }

    public void draw(SpriteBatch batch) {
        for (List<Tile> tileRow:tiles){
            for (Tile tile: tileRow){
                tile.draw(batch);
            }
        }
    }
}
