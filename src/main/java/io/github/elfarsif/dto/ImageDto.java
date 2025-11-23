package io.github.elfarsif.dto;

public final class ImageDto {
    private final String filepath;
    private final int width;
    private final int height;


    public ImageDto( String filepath, int width, int height) {
        this.filepath = filepath;
        this.width = width;
        this.height = height;
    }

    public String getFilepath() {        return filepath;    }
    public int getWidth() {        return width;    }
    public int getHeight() {        return height;    }

    @Override
    public String toString() {
        return "ImageDto{" +
                "filepath='" + filepath + '\'' +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
