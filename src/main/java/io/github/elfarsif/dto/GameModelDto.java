package io.github.elfarsif.dto;

import java.util.List;

public final class GameModelDto {
    private final List<SpriteDto> spriteDtos;

    public GameModelDto(List<SpriteDto> spriteDtos){
        this.spriteDtos = spriteDtos;
    }

    public List<SpriteDto> getSpriteDtos() {        return spriteDtos;    }

    @Override
    public String toString() {
        return "GameModelDto{" +
                "spriteDtos=" + spriteDtos +
                '}';
    }
}
