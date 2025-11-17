import io.github.elfarsif.dto.SpriteDto;
import io.github.elfarsif.service.JsonParser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class JsonParserTest {
    JsonParser jsonParser;
    @BeforeEach
    public void setup(){
        this.jsonParser = new JsonParser();
    }

    @Test
    public void jsonParserCanFindGameConfigFile(){
        Assertions.assertDoesNotThrow(()->this.jsonParser.parseToJson("C:/Users/fnelf/Documents/java projects/engine/src/main/resources/gameConfig.json"));
    }

    @Test
    public void itReturnsNonEmptyString(){
        JSONObject json = this.jsonParser.parseToJson("C:/Users/fnelf/Documents/java projects/engine/src/main/resources/gameConfig.json");
        Assertions.assertEquals(false,json.isEmpty());
        System.out.println(json);
        System.out.println(json.get("sprites"));

    }

    /*@Test
    public void parseSpritListFromJson(){
        JSONObject json = new JSONObject();

        JSONObject s1 = new JSONObject();
        s1.put("name","down1");
        s1.put("filepath", "assets/down1.png");
        JSONObject s2 = new JSONObject();
        s2.put("name","down2");
        s2.put("filepath", "assets/down2.png");

        List<JSONObject> jsonsprites = List.of(s1,s2);

        json.put("sprites",jsonsprites);

        List<SpriteDto> spriteDtos = new ArrayList<>();

        System.out.println(json);

        Assertions.assertEquals(null,jsonParser.parseSpriteList(json));



    }*/


}
