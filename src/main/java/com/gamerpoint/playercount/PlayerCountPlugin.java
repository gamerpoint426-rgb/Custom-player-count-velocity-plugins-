package com.gamerpoint.playercount;

import com.google.inject.Inject;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.proxy.ProxyPingEvent;
import com.velocitypowered.api.plugin.Plugin;
import com.velocitypowered.api.proxy.ProxyServer;
import org.slf4j.Logger;

@Plugin(
    id = "gamerpoint-playercount",
    name = "GamerPoint Player Count",
    version = "1.0.0",
    authors = {"GamerPointMC"}
)
public final class PlayerCountPlugin {
    private final ProxyServer proxy;
    private final Logger logger;

    @Inject
    public PlayerCountPlugin(ProxyServer proxy, Logger logger) {
        this.proxy = proxy;
        this.logger = logger;
        logger.info("GamerPoint Player Count enabled!");
    }

    @Subscribe
    public void onProxyPing(ProxyPingEvent event) {
        event.setPing(event.getPing().asBuilder()
            .nullPlayers()
            .clearSamplePlayers()
            .build());
    }
}
