package io.github.elfarsif.launcher;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import io.github.elfarsif.dto.GameModelDto;
import io.github.elfarsif.game.Game;

public final class DesktopLauncher {
    public static void main(GameModelDto gameModelDto) {
        Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
        config.setTitle("My GDX Game");
        config.setWindowedMode(800, 480);
        config.useVsync(true);
        new Lwjgl3Application(new Game(gameModelDto), config);
    }
}
