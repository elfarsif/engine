package io.github.elfarsif.dto;

import java.util.List;

public final class RoomDto {
    private final String name;
    private final List<LayerDto> layers;

    public RoomDto(String name, List<LayerDto> layers) {
        this.name = name;
        this.layers = layers;
    }

    @Override
    public String toString() {
        return "RoomDto{" +
                "name='" + name + '\'' +
                ", layers=" + layers +
                '}';
    }
}
