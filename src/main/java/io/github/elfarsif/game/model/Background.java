package io.github.elfarsif.game.model;

public final class Background implements Layer,Drawable {
    private final Sprite sprite;

    public Background(Sprite sprite) {
        this.sprite = sprite;
    }

    @Override public float getWidth() {        return this.sprite.getImage().getWidth();    }
    @Override public float getHeight() {        return this.sprite.getImage().getHeight();    }
    @Override public String getFilepath() {        return this.sprite.getImage().getFilepath();    }
    @Override public Image getImage() {return this.sprite.getImage();   }

}
