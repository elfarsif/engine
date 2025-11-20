package io.github.elfarsif.game.model;


public final class Sprite implements Drawable{
    private final String name;
    private final Image image;

    public Sprite(String name, Image image) {
        this.name = name;
        this.image = image;
    }

    @Override public float getWidth() {        return this.image.getWidth();    }
    @Override public float getHeight() {        return this.image.getHeight();    }
    @Override public String getFilepath() {        return this.image.getFilepath();    }
    @Override public Image getImage() {return this.image;   }

}
