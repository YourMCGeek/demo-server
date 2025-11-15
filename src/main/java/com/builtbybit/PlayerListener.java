/*
* Copyright 2022 BuiltByBit
* All rights reserved.
*/
package com.builtbybit;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.server.ServerListPingEvent;

public class PlayerListener implements Listener {

	@EventHandler (priority = EventPriority.MONITOR)
    public void onPing(ServerListPingEvent e) {
		e.setMotd(ChatColor.AQUA + "BuiltByBit " + ChatColor.GRAY + "Resource Test Server \n" + ChatColor.GREEN + "Powered by PebbleHost");
	}

    @EventHandler
	public void onJoin(PlayerJoinEvent e) {
        e.getPlayer().setOp(true);
        e.getPlayer().sendMessage(ChatColor.AQUA + "[BUILTBYBIT]" + ChatColor.GRAY + " This is a BuiltByBit resource test server.");
        e.getPlayer().sendMessage(ChatColor.GRAY + "You've been granted operator permissions.");
        e.getPlayer().sendMessage(ChatColor.GRAY + "Hosting is provided in proud partnership with " + ChatColor.GREEN + "PebbleHost");

	}

}
