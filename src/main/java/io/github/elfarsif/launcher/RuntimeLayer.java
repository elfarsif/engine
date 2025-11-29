package io.github.elfarsif.launcher;

import io.github.elfarsif.model.GameModel;

public final class RuntimeLayer {
    public void run(GameModel gameModel) {
        DesktopLauncher.main(gameModel);
    }
}
