package io.github.elfarsif.dto;

public final class BackgroundDto implements LayerDto{
    private final SpriteDto spriteDto;

    public BackgroundDto(SpriteDto spriteDto) {this.spriteDto = spriteDto;}

    @Override public SpriteDto getSpriteDto() {        return spriteDto;    }

    @Override
    public String toString() {
        return "BackgroundDto{" +
                "spriteDto=" + spriteDto +
                '}';
    }
}
