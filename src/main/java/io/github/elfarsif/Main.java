package io.github.elfarsif;

public class Main {
    public static void main(String[] args) {
        System.out.println(args[0]);
        String jsonString = JsonParser.parseToString(args[0]);
        System.out.println(jsonString);

        ConfigLoader configLoader = new ConfigLoader();
        DomainMapper domainMapper = new DomainMapper();
        RuntimeLayer runtimeLayer = new RuntimeLayer();

        StartupService startupService = new StartupService(configLoader,domainMapper,runtimeLayer);

        GameConfigController gameConfigController = new GameConfigController(startupService);
        gameConfigController.startGame(args[0]);

        //pass file path arg for gameconfig.json in controller
        //controller recieves the path and sends to startup service
        //service sends the builds file into Json and builds json into DTO
        //service turns DTO into Domain model
        // service starts the Application layer (Runtime Layer) with the models
        //Runtime Layer runs the application using the models
    }
}