package io.github.elfarsif.dto;

import java.util.List;

public final record GameModelDto(List<SpriteDto> spriteDtos,List<RoomDto> roomDtos) {
}
