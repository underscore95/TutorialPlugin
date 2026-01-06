package me.underscore95.tutorialPlugin;

import org.bukkit.entity.Player;

public class Orange extends Fruit {
    @Override
    public void printName(Player player) {
        player.sendMessage("orange");
    }
}
