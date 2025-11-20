package io.github.elfarsif.game.model;

public final class Image implements Drawable{
    private final int width;
    private final int height;
    private final String filepath;

    public Image(int width, int height, String filepath) {
        this.width = width;
        this.height = height;
        this.filepath = filepath;
    }

    @Override public float getWidth() {        return width;    }
    @Override public float getHeight() {        return height;    }
    @Override public String getFilepath() {        return filepath;    }
    @Override public Image getImage() {return this;   }
}
