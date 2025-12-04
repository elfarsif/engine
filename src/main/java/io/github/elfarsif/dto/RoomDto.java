package io.github.elfarsif.dto;

import java.util.List;

public final record RoomDto(String name,List<LayerDto> layerDtos) {
}
