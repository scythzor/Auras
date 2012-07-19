package com.me.auras;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;




public class Auras extends JavaPlugin {
	
	@Override
	public void onEnable() {
		PluginManager pm = getServer().getPluginManager();
		AurasListener lst = new AurasListener(this);
		 pm.registerEvents(lst, this);
		
	PluginDescriptionFile pdfFile = this.getDescription();
	
	try{
		this.getCommand("auras").setExecutor(new AurasCommand(this, lst));
		this.getCommand("ars").setExecutor(new AurasCommand(this, lst));
	} catch(Exception e) {
		System.out.println("Error registering the /ars command.");
	}
	
}
	
	
	
	
	
}
