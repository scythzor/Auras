package com.me.auras;

import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.me.auras.Auras;
import com.me.auras.AurasListener;

public class AurasCommand implements CommandExecutor {
	
	public AurasListener lst;
	public Auras sts;

	
	public AurasCommand(Auras pl, AurasListener listener) {
		sts = pl;
		lst = listener;
	}
	

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		// TODO Auto-generated method stub
		if (sender instanceof Player){
			Player p =(Player) sender;
			if(args.length==1){
				if(args[0].equalsIgnoreCase("enderman")){
					Location loc = p.getLocation();
					p.playEffect(loc, Effect.ENDER_SIGNAL, 0);
					return true;
				}
				return true;
			}else{
				p.sendMessage("use: ars <auraName>");
				return true;}
				
			
		}else{
			sender.sendMessage("Only players can execute this cmd");
		}
		
		
		return true;
	}
	

	
	
	
	
	
}
