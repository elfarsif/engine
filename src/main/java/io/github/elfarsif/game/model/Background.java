package io.github.elfarsif.game.model;

public final class Background implements Layer,Drawable {
    private final Sprite sprite;
    private final float offsetX,offsetY;

    public Background(Sprite sprite, float offsetX, float offsetY) {
        this.sprite = sprite;
        this.offsetX = offsetX;
        this.offsetY = offsetY;
    }

    @Override public float getWidth() {        return this.sprite.getImage().getWidth();    }
    @Override public float getHeight() {        return this.sprite.getImage().getHeight();    }
    @Override public String getFilepath() {        return this.sprite.getImage().getFilepath();    }
    @Override public Image getImage() {return this.sprite.getImage();   }

}
