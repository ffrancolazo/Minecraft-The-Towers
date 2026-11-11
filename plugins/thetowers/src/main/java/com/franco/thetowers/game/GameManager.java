package com.franco.thetowers.game;

import java.util.LinkedList;
import java.util.Queue;

import org.bukkit.entity.Player;
import com.franco.thetowers.TheTowersPlugin;

// Crear, iniciar y administrar partidas.
public class GameManager {

    private TheTowersPlugin plugin;
    private final Queue<Player> waitingPlayers = new LinkedList<>();

    public GameManager(TheTowersPlugin plugin) {
        this.plugin = plugin;
    };

    public void startGame() {
        plugin.getLogger().info("Starting match...");
    };

    public void addPlayer(Player player){

        /**
         * Hacemos algo con el Jugador
         */

        plugin.getLogger().info(
            player.getName() + " se unió al servidor."
        );

    };
    
}
