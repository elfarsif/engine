package io.github.elfarsif;

import io.github.elfarsif.controller.GameConfigController;
import io.github.elfarsif.launcher.*;
import io.github.elfarsif.service.ConfigLoader;
import io.github.elfarsif.service.JsonParser;
import io.github.elfarsif.service.StartupService;

public class Main {
    public static void main(String[] args) {
        System.out.println(args[0]);

        //Application Context/Dependency Injections
        JsonParser jsonParser = new JsonParser();

        ConfigLoader configLoader = new ConfigLoader(jsonParser);
        RuntimeLayer runtimeLayer = new RuntimeLayer();

        StartupService startupService = new StartupService(configLoader,runtimeLayer);

        GameConfigController gameConfigController = new GameConfigController(startupService);

        //start game
        gameConfigController.startGame(args[0]);
    }
}