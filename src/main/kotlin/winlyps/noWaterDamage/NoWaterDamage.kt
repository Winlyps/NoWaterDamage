package winlyps.noWaterDamage

import org.bukkit.plugin.java.JavaPlugin

class NoWaterDamage : JavaPlugin() {

    override fun onEnable() {
        // Register the event listener
        server.pluginManager.registerEvents(NoWaterDamageListener(), this)
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}