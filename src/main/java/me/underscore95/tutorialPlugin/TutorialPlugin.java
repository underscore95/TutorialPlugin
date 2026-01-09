package me.underscore95.tutorialPlugin;

import com.destroystokyo.paper.event.player.PlayerJumpEvent;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class TutorialPlugin extends JavaPlugin implements Listener, CommandExecutor {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new PlayerJumpListener(), this);

        getCommand("hello").setExecutor(new HelloCommand());
    }

    @Override
    public void onDisable() {

    }


}
