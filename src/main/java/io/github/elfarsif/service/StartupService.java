package io.github.elfarsif.service;

import io.github.elfarsif.dto.GameModelDto;
import io.github.elfarsif.game.model.GameModel;
import io.github.elfarsif.launcher.RuntimeLayer;

public final class StartupService {
    private final ConfigLoader configLoader;
    private final RuntimeLayer runtimeLayer;
    private final Mapper mapper;

    public StartupService(ConfigLoader configLoader, RuntimeLayer runtimeLayer, Mapper mapper) {
        this.configLoader = configLoader;
        this.runtimeLayer = runtimeLayer;
        this.mapper = mapper;
    }

    public void startWithConfigFile(String filepath) {
        GameModelDto gameModelDto = configLoader.load(filepath);
        GameModel gameModel = mapper.toModel(gameModelDto);
        runtimeLayer.run(gameModelDto);
    }
}
