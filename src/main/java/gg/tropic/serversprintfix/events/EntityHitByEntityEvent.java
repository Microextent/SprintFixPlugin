package gg.tropic.serversprintfix.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class EntityHitByEntityEvent implements Listener {
    @EventHandler
    public void hit(EntityDamageByEntityEvent e) {
        if (e.getEntity() instanceof Player) {
            Player p = (Player) e.getEntity();
            p.setSprinting(false);
        }
    }
}
