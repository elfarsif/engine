package io.github.elfarsif.service;

import io.github.elfarsif.dto.*;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public final class JsonParser {

    public List<SpriteDto> parseSpriteList(JSONObject json){
        List<SpriteDto> spriteDtos = new ArrayList<>();

        JSONArray sprites = json.getJSONArray("sprites");
        for (int i = 0; i<sprites.length();i++){
            JSONObject obj = sprites.getJSONObject(i);
            JSONObject image = obj.getJSONObject("image");
            ImageDto imageDto = new ImageDto(
                    image.getString("filepath"),
                    image.getInt("width"),
                    image.getInt("height")
            );
            SpriteDto dto = new SpriteDto(obj.getString("name"),imageDto);
            spriteDtos.add(dto);
        }

        return spriteDtos;
    }

    public JSONObject parseToJson(String filePath) {
        StringBuilder content = new StringBuilder();

        try {

            InputStream is = new FileInputStream(filePath);
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line);

            }

        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(filePath);
        }


        return new JSONObject(content.toString());
    }

    public List<RoomDto> parseRoomList(JSONObject json) {
        List<RoomDto> roomDtos = new ArrayList<>();

        JSONArray rooms = json.getJSONArray("rooms");
        for (int i = 0; i<rooms.length();i++){
            JSONObject obj = rooms.getJSONObject(i);

            List<LayerDto> layerDtos = new ArrayList<>();
            JSONArray layers = obj.getJSONArray("layers");
            for (int j =0; j<layers.length();j++){
                JSONObject layer = layers.getJSONObject(j);
                List<SpriteDto> sprites = this.parseSpriteList(json);
                SpriteDto spriteDto = sprites.stream()
                        .filter(sprite->sprite.name().equals(layer.getString("sprite")))
                        .findFirst()
                        .orElse(null);
                LayerDto layerDto = new BackgroundDto(spriteDto);
                layerDtos.add(layerDto);

            }
            RoomDto roomDto = new RoomDto(obj.getString("name"),layerDtos);
            roomDtos.add(roomDto);
        }

        return roomDtos;
    }

}
