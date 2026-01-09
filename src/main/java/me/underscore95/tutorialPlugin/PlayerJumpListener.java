package me.underscore95.tutorialPlugin;

import com.destroystokyo.paper.event.player.PlayerJumpEvent;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class PlayerJumpListener implements Listener {

    @EventHandler
    private void playerJump(PlayerJumpEvent event) {
        Player player = event.getPlayer();
        //player.sendMessage("Hello");
    }
}
