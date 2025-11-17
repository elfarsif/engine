package io.github.elfarsif.service;

import io.github.elfarsif.dto.GameModelDto;
import io.github.elfarsif.launcher.RuntimeLayer;

public final class StartupService {
    private final ConfigLoader configLoader;
    private final RuntimeLayer runtimeLayer;

    public StartupService(ConfigLoader configLoader, RuntimeLayer runtimeLayer) {
        this.configLoader = configLoader;
        this.runtimeLayer = runtimeLayer;
    }

    public void startWithConfigFile(String filepath) {
        GameModelDto gameModelDto = configLoader.load(filepath);
        runtimeLayer.run(gameModelDto);
    }
}
