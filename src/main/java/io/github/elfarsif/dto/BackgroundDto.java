package io.github.elfarsif.dto;

public record BackgroundDto(SpriteDto spriteDto,Boolean verticalTile,Boolean horizontalTile) implements LayerDto{
    @Override public SpriteDto getSpriteDto() {        return spriteDto;    }
}
