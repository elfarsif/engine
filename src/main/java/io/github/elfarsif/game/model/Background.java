package io.github.elfarsif.game.model;

public final class Background implements Layer {
    private final Sprite sprite;

    public Background(Sprite sprite) {this.sprite = sprite;}

    public Sprite getSprite() {        return sprite;    }
}
