package io.github.elfarsif.game.model;

import java.util.List;

public final class GameModel {
    private final List<Sprite> sprites;
    private final List<Room> rooms;

    public GameModel(List<Sprite> sprites, List<Room> rooms) {
        this.sprites = sprites;
        this.rooms = rooms;
    }
}
