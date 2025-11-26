package io.github.elfarsif.dto;

import java.util.List;

public final class RoomDto {
    private final String name;
    private final List<LayerDto> layers;

    public RoomDto(String name, List<LayerDto> layers) {
        this.name = name;
        this.layers = layers;
    }

    public String getName() {        return name;    }
    public List<LayerDto> getLayers() {        return layers;    }
    @Override
    public String toString() {
        return "RoomDto{" +
                "name='" + name + '\'' +
                ", layers=" + layers +
                '}';
    }
}
