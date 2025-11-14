package io.github.elfarsif;

import java.io.*;

public final class JsonParser {
    public static String parseToString(String filePath) {
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


        return content.toString();
    }


}
