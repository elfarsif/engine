package io.github.elfarsif.launcher;

import io.github.elfarsif.dto.GameModelDto;

public final class RuntimeLayer {
    public void run(GameModelDto gameModelDto) {
        DesktopLauncher.main(gameModelDto);
    }
}
