package com.j2.facade.hometheater.smarthome;

public class Pencil {
	
	String description;
	NoteBook notebook;
	
	public Pencil(String description){
		this.description = description;
	}
 
	public void ready(){
		System.out.println(description + " ready");
	}
 
	public void clean(){
		System.out.println(description + " clean");
	}
  
	public void setNoteBook(NoteBook notebook){
		System.out.println(description + " ready and open " + notebook);
		this.notebook = notebook;
	}
 
	public String toString(){
		return description;
	}

}
