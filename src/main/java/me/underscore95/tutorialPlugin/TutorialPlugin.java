package me.underscore95.tutorialPlugin;

import com.destroystokyo.paper.event.player.PlayerJumpEvent;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.*;

public final class TutorialPlugin extends JavaPlugin implements Listener, CommandExecutor {
    // "strawberry" -> "fruit"
    // "raspberry" -> "fruit"
    // "potato" -> "vegetable"
    private HashMap<String, String> map = new HashMap<>();

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);

        getCommand("hello").setExecutor(this);
    }

    @Override
    public void onDisable() {

    }

    @EventHandler
    private void playerJump(PlayerJumpEvent event) {
        Player player = event.getPlayer();

    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player player)) {
            sender.sendMessage("You must be a player to use this command1");
            return false;
        }

//        player.sendMessage("Hello!");
//
//        if (args.length > 1) {
//         map.put(args[0],args[1]);
//
//
//        }
//
//        for (Map.Entry<String,String> pair : map.entrySet()) {
//            player.sendMessage("Map key: " + pair.getKey() + ", value: " + pair.getValue());
//        }

        Apple apple = new Apple();
        apple.printName(player);
        apple.calories = 500;
        apple.shoutNameAndCalories(player);

        Orange orange = new Orange();
        orange.printName(player);

        return true;
    }
}
