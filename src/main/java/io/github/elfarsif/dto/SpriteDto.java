package io.github.elfarsif.dto;

import java.util.Objects;

public final class SpriteDto {
    private final String name;
    private final ImageDto imageDto;

    public SpriteDto(String name, ImageDto imageDto) {
        this.name = name;
        this.imageDto = imageDto;
    }

    public ImageDto getImageDto() {        return imageDto;    }
    public String getName() {        return name;    }

    @Override
    public String toString() {
        return "SpriteDto{" +
                "name='" + name + '\'' +
                ", imageDto=" + imageDto +
                '}';
    }
}
