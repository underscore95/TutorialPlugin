package me.underscore95.tutorialPlugin;

import org.bukkit.entity.Player;

public class Apple extends Fruit {

    @Override
    public void printName(Player player) {
        player.sendMessage("apple");
    }

    public void shoutNameAndCalories(Player player) {
        player.sendMessage("APPLE " + calories + " calories");
    }
}
