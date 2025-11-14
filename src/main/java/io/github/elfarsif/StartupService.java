package io.github.elfarsif;


public final class StartupService {
    private final ConfigLoader configLoader;
    private final DomainMapper domainMapper;
    private final RuntimeLayer runtimeLayer;

    public StartupService(ConfigLoader configLoader, DomainMapper domainMapper, RuntimeLayer runtimeLayer) {
        this.configLoader = configLoader;
        this.domainMapper = domainMapper;
        this.runtimeLayer = runtimeLayer;
    }

    public void startWithConfigFile(String filepath) {
        Dto dto = configLoader.load(filepath);
        Model model = domainMapper.fromDto(dto);
        runtimeLayer.run();
    }
}
