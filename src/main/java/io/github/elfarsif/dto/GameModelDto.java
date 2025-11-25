package io.github.elfarsif.dto;

import java.util.List;

public final class GameModelDto {
    private final List<ImageDto> imageDtos;
    private final List<SpriteDto> spriteDtos;
    private final List<RoomDto> roomDtos;

    public GameModelDto(List<ImageDto> imageDtos, List<SpriteDto> spriteDtos, List<RoomDto> roomDtos){
        this.imageDtos = imageDtos;
        this.spriteDtos = spriteDtos;
        this.roomDtos = roomDtos;
    }

    public List<SpriteDto> getSpriteDtos() {        return spriteDtos;    }

    @Override
    public String toString() {
        return "GameModelDto{" +
                "imageDtos=" + imageDtos +
                ", spriteDtos=" + spriteDtos +
                ", roomDtos=" + roomDtos +
                '}';
    }
}
