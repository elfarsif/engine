package io.github.elfarsif.dto;

import java.util.List;

public final class GameModelDto {
    private final List<SpriteDto> spriteDtos;
    private final List<RoomDto> roomDtos;

    public GameModelDto(List<SpriteDto> spriteDtos, List<RoomDto> roomDtos){
        this.spriteDtos = spriteDtos;
        this.roomDtos = roomDtos;
    }

    public List<SpriteDto> getSpriteDtos() {        return spriteDtos;    }
    public List<RoomDto> getRoomDtos() {        return roomDtos;    }

    @Override
    public String toString() {
        return "GameModelDto{" +
                ", spriteDtos=" + spriteDtos +
                ", roomDtos=" + roomDtos +
                '}';
    }
}
