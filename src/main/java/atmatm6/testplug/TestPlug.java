package atmatm6.testplug;

import net.md_5.bungee.api.plugin.Plugin;

public class TestPlug extends Plugin {
    @Override
    public void onEnable() {
        // You should not put an enable message in your plugin.
        // BungeeCord already does so
        getLogger().info(getProxy().getServers().get("creative").getAddress().toString());

    }
}