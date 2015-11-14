package com.j2.facade.hometheater.smarthome;

public class Book{
	
	String description;
	NoteBook notebook;
	
	public Book(String description, NoteBook notebook){
		this.description = description;
		this.notebook = notebook;
	}
 
	public void open(){
		System.out.println(description + " open");
	}
 
	public void close(){
		System.out.println(description + " close");
	}

	public void setPage(int page){
		System.out.println(description + " Page:" + page);
	}
  
    public String toString(){
    	return description;
    }

}
