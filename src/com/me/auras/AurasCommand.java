package com.me.auras;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

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
	public boolean onCommand(CommandSender arg0, Command arg1, String arg2,
			String[] arg3) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
