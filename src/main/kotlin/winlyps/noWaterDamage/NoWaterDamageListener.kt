package winlyps.noWaterDamage

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.entity.EntityDamageEvent

class NoWaterDamageListener : Listener {

    @EventHandler
    fun onEntityDamage(event: EntityDamageEvent) {
        // Check if the damage cause is drowning
        if (event.cause == EntityDamageEvent.DamageCause.DROWNING) {
            // Cancel the event to prevent damage
            event.isCancelled = true
        }
    }
}