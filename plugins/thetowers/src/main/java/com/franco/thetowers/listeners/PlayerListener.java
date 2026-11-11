package com.franco.thetowers.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import com.franco.thetowers.TheTowersPlugin;

/**
 * Esta clase detecta eventos de Minecraft. Concepto importante: Debe extender a la interfaz Listener y recibir un plugin, para saber desde donde escuchar. Se inyecta por constructor el plugin para cuando lo instanciamos desde el main pasarle una referencia (this) en el momento.
 * 
 * Lista de eventos: https://jd.papermc.io/paper/26.3/org/bukkit/event/package-summary.html
 * 
 * PlayerListener
 */
public class PlayerListener implements Listener {

    private final TheTowersPlugin plugin;

    public PlayerListener(TheTowersPlugin plugin) {
        this.plugin = plugin;
    };

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        plugin.getGameManager().addPlayer(event.getPlayer());;
    };

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event) {
        plugin.getGameManager().removePlayer(event.getPlayer());
    }

}
