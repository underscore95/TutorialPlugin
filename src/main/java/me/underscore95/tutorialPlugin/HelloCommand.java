package me.underscore95.tutorialPlugin;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class HelloCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player player)) {
            sender.sendMessage("You must be a player to use this command1");
            return false;
        }

        ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);
        sword.editMeta(meta -> {
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&dMy Sword"));
            meta.addEnchant(Enchantment.SHARPNESS, 5, true);
        });
        player.getInventory().addItem(sword);

        return true;
    }
}
