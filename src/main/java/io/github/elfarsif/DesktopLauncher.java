package io.github.elfarsif;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.badlogic.gdx.utils.Json;

public final class DesktopLauncher {
    public static void main() {
        Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
        config.setTitle("My GDX Game");
        config.setWindowedMode(800, 480);
        config.useVsync(true);
        new Lwjgl3Application(new Game(), config);
    }
}
