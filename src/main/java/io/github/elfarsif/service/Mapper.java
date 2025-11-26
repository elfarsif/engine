package io.github.elfarsif.service;

import io.github.elfarsif.dto.*;
import io.github.elfarsif.game.model.*;

import java.util.List;

public class Mapper {

    public GameModel toModel(GameModelDto gameModelDto) {
        List<Sprite> sprites = gameModelDto.getSpriteDtos()
                .stream()
                .map(spriteDto -> this.toModel(spriteDto))
                .toList();
        List<Room> rooms = gameModelDto.getRoomDtos()
                .stream()
                .map(roomDto -> this.toModel(roomDto))
                .toList();
        return new GameModel(sprites,rooms);
    }

    private Room toModel(RoomDto roomDto){
        return new Room(roomDto.getLayers()
                .stream()
                .map(layerDto -> this.toModel(layerDto))
                .toList());
    }

    private Image toModel(ImageDto imageDto){
        return new Image(imageDto.getWidth(),imageDto.getHeight(),imageDto.getFilepath());
    }

    private Layer toModel(LayerDto layerDto){
        return new Background(this.toModel(layerDto.getSpriteDto()));
    }

    private Sprite toModel(SpriteDto spriteDto){
        return new Sprite(spriteDto.getName(),this.toModel(spriteDto.getImageDto()));
    }


}
