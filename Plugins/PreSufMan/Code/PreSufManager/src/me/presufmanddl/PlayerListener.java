package me.presufmanddl;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
public class PlayerListener implements Listener {
	public PreSufMan plugin;
	public PlayerListener(PreSufMan preSufMan) {
		plugin = preSufMan;
	}
	@EventHandler(priority = EventPriority.HIGHEST)
	public void onPlayerJoin(PlayerJoinEvent e) {
	}
}