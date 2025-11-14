package io.github.elfarsif;

import java.io.*;

public class JsonParser {
    public static String parseToString(String filePath) {
        InputStream is = JsonParser.class.getClassLoader().getResourceAsStream(filePath);
        StringBuilder content = new StringBuilder();

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String line;
            while((line = br.readLine())!=null){
                content.append(line);

            }
        }catch (Exception e){
            e.printStackTrace();
        }


        return content.toString();
    }
}
