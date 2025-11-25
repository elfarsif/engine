package io.github.elfarsif.service;

import io.github.elfarsif.dto.GameModelDto;
import io.github.elfarsif.dto.ImageDto;
import io.github.elfarsif.dto.RoomDto;
import io.github.elfarsif.dto.SpriteDto;
import org.json.JSONObject;

import java.util.List;

public final class ConfigLoader {
    private final JsonParser jsonParser;

    public ConfigLoader(JsonParser jsonParser) {this.jsonParser = jsonParser;}

    public GameModelDto load(String filepath) {
        JSONObject json = this.jsonParser.parseToJson(filepath);
        List<ImageDto> imageDtos = this.jsonParser.parseImageList(json);
        List<SpriteDto> spriteDtos = this.jsonParser.parseSpriteList(json);
        List<RoomDto> roomDtos = this.jsonParser.parseRoomList(json);
        return new GameModelDto(imageDtos,spriteDtos,roomDtos);
    }

}
