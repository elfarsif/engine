package io.github.elfarsif.game.model;

public final class Image {
    private final int width;
    private final int height;
    private final String filepath;

    public Image(int width, int height, String filepath) {
        this.width = width;
        this.height = height;
        this.filepath = filepath;
    }

    public int getWidth() {        return width;    }
    public int getHeight() {        return height;    }
    public String getFilepath() {        return filepath;    }
}
