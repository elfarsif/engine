package io.github.elfarsif;

public final class GameConfigController {
    private final StartupService startupService;

    public GameConfigController(StartupService startupService) {
        this.startupService = startupService;
    }

    public void startGame(String filepath) {
        this.startupService.startWithConfigFile(filepath);

    }
}
