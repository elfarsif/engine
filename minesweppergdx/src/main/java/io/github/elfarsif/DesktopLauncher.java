package io.github.elfarsif;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;

public final class DesktopLauncher {
    public static void main() {
        Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
        config.setTitle("Minesweeper");
        config.setWindowedMode(480, 580);
        config.useVsync(true);
        new Lwjgl3Application(new Game(), config);
    }
}
