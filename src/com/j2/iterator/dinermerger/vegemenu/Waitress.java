package com.j2.iterator.dinermerger.vegemenu;

public class Waitress {

	PancakeHouseMenu pm;
	  DinerMenu dm;
	  public Waitress(DinerMenu dm,PancakeHouseMenu pm){
	    this.pm = pm;
	    this.dm = dm;
	  }
	  
	  public void printMenu() {
	        Iterator pancakeIterator = pm.createIterator();
	        Iterator dinerIterator = pm.createIterator();

	        System.out.println("MENU\n----\nBREAKFAST");
	        printMenu(pancakeIterator);
	        System.out.println("\nLUNCH");
	        printMenu(dinerIterator);
	  }
	  
	  private void printMenu(Iterator iterator){
	    while(iterator.hasNext()){
	    	MenuItem item = (MenuItem)iterator.next();
	    		if(item.isVegetarian()) {
	    			System.out.println("Name : " + item.getName());
	    			System.out.println("Description : " + item.getDescription());
	    			System.out.println("Price : " + item.getPrice());
	    		}
	    }
	  }
	  
}
