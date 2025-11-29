package io.github.elfarsif.model;

import java.util.List;

public final class GameModel {
    private final List<Sprite> sprites;
    private final List<Room> rooms;

    public GameModel(List<Sprite> sprites, List<Room> rooms) {
        this.sprites = sprites;
        this.rooms = rooms;
    }

    public List<Sprite> getSprites() {        return sprites;    }

    public List<Room> getRooms() {        return rooms;    }

    @Override
    public String toString() {
        return "GameModel{" +
                "sprites=" + sprites +
                ", rooms=" + rooms +
                '}';
    }
}
