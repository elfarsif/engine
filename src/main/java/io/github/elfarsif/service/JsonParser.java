package io.github.elfarsif.service;

import io.github.elfarsif.dto.GameModelDto;
import io.github.elfarsif.dto.SpriteDto;
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
            SpriteDto dto = new SpriteDto(obj.getString("name"),obj.getString("filepath"));
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

            System.out.println("LOADED json :"+content.toString());
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(filePath);
        }


        return new JSONObject(content.toString());
    }


}
