import io.github.elfarsif.dto.GameModelDto;
import io.github.elfarsif.dto.SpriteDto;
import io.github.elfarsif.service.ConfigLoader;
import io.github.elfarsif.service.JsonParser;
import org.json.JSONObject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ConfigLoaderTest {
    private ConfigLoader configLoader;

    @Mock
    private JsonParser jsonParser;

    @BeforeEach
    public void setup(){
        this.configLoader = new ConfigLoader(this.jsonParser);
    }

    @Test
    public void testLoadingModel(){
        JSONObject sprite = new JSONObject();
        sprite.put("filepath","testPath");

        JSONObject json = new JSONObject();
        json.put("sprite",sprite);

        System.out.println(json);
        String filepath= "test.json";

        when(jsonParser.parseToJson(filepath)).thenReturn(json);

//        Assertions.assertEquals(new GameModelDto(new ArrayList<>()),this.configLoader.load(filepath).getClass());



    }
}
