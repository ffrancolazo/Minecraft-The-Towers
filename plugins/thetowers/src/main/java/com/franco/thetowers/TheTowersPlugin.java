package com.franco.thetowers;

import org.bukkit.plugin.java.JavaPlugin;

import com.franco.thetowers.game.GameManager;
import com.franco.thetowers.listeners.PlayerListener;

/**
 * Documentacion de interes: https://docs.papermc.io/paper/dev/command-api/basics/command-tree/
 *                           https://jd.papermc.io/paper/26.3/
 */

public class TheTowersPlugin extends JavaPlugin {

    private GameManager gameManager;

    @Override
    public void onEnable() {

        getServer().getPluginManager().registerEvents(
                new PlayerListener(this),
                this);

        gameManager = new GameManager(this);

        getLogger().info("The Towers cargado.");
    };

    @Override
    public void onDisable() {
        getLogger().info("The Towers apagado.");
    };

    public GameManager getGameManager() {
        return gameManager;
    };
}