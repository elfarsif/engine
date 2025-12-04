package io.github.elfarsif.service;

import io.github.elfarsif.dto.*;
import io.github.elfarsif.model.*;

import java.util.List;

public final class Mapper {

    public GameModel toModel(GameModelDto gameModelDto) {
        List<Sprite> sprites = gameModelDto.spriteDtos()
                .stream()
                .map(spriteDto -> this.toModel(spriteDto))
                .toList();
        List<Room> rooms = gameModelDto.roomDtos()
                .stream()
                .map(roomDto -> this.toModel(roomDto))
                .toList();
        return new GameModel(sprites,rooms);
    }

    private Room toModel(RoomDto roomDto){
        return new Room(roomDto.layerDtos()
                .stream()
                .map(layerDto -> this.toModel(layerDto))
                .toList());
    }

    private Image toModel(ImageDto imageDto){
        return new Image(imageDto.width(),imageDto.height(),imageDto.filepath());
    }

    private Layer toModel(LayerDto layerDto){
        return new Background(this.toModel(layerDto.getSpriteDto()));
    }

    private Sprite toModel(SpriteDto spriteDto){
        return new Sprite(spriteDto.name(),this.toModel(spriteDto.imageDto()));
    }


}
