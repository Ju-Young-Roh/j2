package com.j2.facade.hometheater.smarthome;

public class SmartHomeFacade{

	Pencil pencil;
	NoteBook notebook;
	Book book;
 
	public SmartHomeFacade(Pencil pencil, NoteBook notebook, Book book){ 
		this.pencil = pencil;
		this.notebook = notebook;
		this.book = book;
	}
 
	public void startStudy(String title){
		System.out.println("Start Java Studying!");
		book.open();
		book.setPage(108);
		pencil.ready();
		pencil.setNoteBook(notebook);
		notebook.open();
		notebook.ready(title);
	}

	public void endStudy(){
		System.out.println("\nTired... I'll take rest");
		book.close();
		pencil.clean();
		notebook.close();
	}
	
}
