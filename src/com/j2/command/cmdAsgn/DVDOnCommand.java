package com.j2.command.cmdAsgn;

public class DVDOnCommand implements Command{

	DVD dvd;
	
	public DVDOnCommand(DVD dvd){
		this.dvd=dvd;
	}
	
	public void execute(){
		dvd.on();
	}
	
	public void undo(){
		dvd.off();
	}
}
