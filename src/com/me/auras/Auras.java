package com.me.auras;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Auras extends JavaPlugin {
	
	@Override
	public void onEnable() {
		PluginManager pm = getServer().getPluginManager();
		AurasListener lst = new AurasListener(this);
		 pm.registerEvents(lst, this);
		
	}

}
