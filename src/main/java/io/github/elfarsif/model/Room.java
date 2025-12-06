package io.github.elfarsif.model;

import java.util.List;

public final class Room {
    private final List<Layer> layers;

    public Room(List<Layer> layers) {
        this.layers = layers;
    }

    public List<Layer> getLayers(){return this.layers;}
    @Override
    public String toString() {
        return "Room{" +
                "layers=" + layers +
                '}';
    }
}
