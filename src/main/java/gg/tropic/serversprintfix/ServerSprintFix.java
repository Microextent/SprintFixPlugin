package gg.tropic.serversprintfix;

import gg.tropic.serversprintfix.events.EntityHitByEntityEvent;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class ServerSprintFix extends JavaPlugin {

    @Override
    public void onEnable() {
        registerEvents();
    }

    @Override
    public void onDisable() {
    }

    public void registerEvents() {
        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new EntityHitByEntityEvent(), this);
    }

}
