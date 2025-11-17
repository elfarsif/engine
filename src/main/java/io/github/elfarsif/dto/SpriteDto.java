package io.github.elfarsif.dto;

public class SpriteDto {
    private final String name;
    private final String filepath;


    public SpriteDto(String name, String filepath) {
        this.name = name;
        this.filepath = filepath;
    }

    public String getFilepath() {        return filepath;    }

    @Override
    public String toString() {
        return "SpriteDto{" +
                "name='" + name + '\'' +
                ", filepath='" + filepath + '\'' +
                '}';
    }
}
