package com.j2.facade.hometheater.smarthome;

public class SmartHomeTestDrive{
	
	public static void main(String[] args) {
		Pencil pencil = new Pencil("Pencil");
		NoteBook notebook = new NoteBook("My notebook", pencil);
		Book book = new Book("Headfirst Design Pattern Book", notebook);
		
		SmartHomeFacade smarthome =	new SmartHomeFacade(pencil, notebook, book);
 
		smarthome.startStudy("Study..");
		smarthome.endStudy();
	}
}