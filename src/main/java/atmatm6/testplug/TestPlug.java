package atmatm6.testplug;

import net.md_5.bungee.api.config.ServerInfo;
import net.md_5.bungee.api.plugin.Plugin;

public class TestPlug extends Plugin {
    @Override
    public void onEnable() {
        // You should not put an enable message in your plugin.
        // BungeeCord already does so
        //noinspection Since15
        getProxy().getServers().forEach(new java.util.function.BiConsumer<String, ServerInfo>() {
            @Override
            public void accept(String s, ServerInfo serverInfo) {
                getLogger().info(serverInfo.getAddress().toString());
            }
        });
    }
}