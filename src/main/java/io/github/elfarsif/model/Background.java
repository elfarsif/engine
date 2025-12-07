package io.github.elfarsif.model;

public final class Background implements Layer,Drawable {
    private final Sprite sprite;
    private final Boolean verticalTile;
    private final Boolean horizontalTile;

    public Background(Sprite sprite, Boolean verticalTile, Boolean horizontalTile) {
        this.sprite = sprite;
        this.verticalTile = verticalTile;
        this.horizontalTile = horizontalTile;
    }

    @Override public float getWidth() {        return this.sprite.getImage().getWidth();    }
    @Override public float getHeight() {        return this.sprite.getImage().getHeight();    }
    @Override public String getFilepath() {        return this.sprite.getImage().getFilepath();    }
    @Override public Image getImage() {return this.sprite.getImage();   }
    @Override
    public String toString() {
        return "Background{" +
                "sprite=" + sprite +
                ", verticalTile=" + verticalTile +
                ", horizontalTile=" + horizontalTile +
                '}';
    }
}
