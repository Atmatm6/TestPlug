package atmatm6.testplug;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.config.ServerInfo;
import net.md_5.bungee.api.plugin.Command;
import net.md_5.bungee.api.plugin.Plugin;

import java.io.File;

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
        new File(getDataFolder(), "config.yml");
    }

    public class TestCommand extends Command{

        public TestCommand(){
            super("asu");
        }

        @Override
        public void execute(CommandSender commandSender, String[] strings) {
            commandSender.sendMessage(new ComponentBuilder("Hello world!").color(ChatColor.GREEN).create());
        }
    }
}