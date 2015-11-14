package com.j2.facade.hometheater.smarthome;

public class NoteBook {
	String description;
	Pencil pencil;
	String title;
	
	public NoteBook(String description, Pencil pencil){
		this.description = description;
		this.pencil = pencil;
	}
 
	public void open(){
		System.out.println(description + " open");
	}
 
	public void close(){
		System.out.println(description + " close");
	}

	public void ready(String title){
		this.title = title;
		System.out.println(description + " helps to " + title);
	}

	public String toString(){
		return description;
	}

}
