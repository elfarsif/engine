import io.github.elfarsif.JsonParser;
import org.json.JSONObject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JsonParserTest {
    @Test
    public void jsonParserCanFindGameConfigFile(){
        Assertions.assertDoesNotThrow(()->JsonParser.parseToString("C:\\Users\\fnelf\\Documents\\java projects\\engine\\src\\main\\resources\\gameConfig.json"));
    }

    @Test
    public void itReturnsNonEmptyString(){
        String jsonString = JsonParser.parseToString("C:\\Users\\fnelf\\Documents\\java projects\\engine\\src\\main\\resources\\gameConfig.json");
        Assertions.assertEquals(false,jsonString.isEmpty());
        System.out.println(jsonString);
    }


}
