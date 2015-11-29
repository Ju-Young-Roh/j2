package com.j2.iterator.dinermerger.vegemenu;

public class DinerMenu implements Menu{

	MenuItem[] menuItems;
	static final int MAX_ITEMS=3;
	int numberOfItems = 0;
	
	public Iterator createIterator(){
	  return new DinerMenuIterator(menuItems);
	}
	  
	  
	public DinerMenu(){
	  menuItems = new MenuItem[MAX_ITEMS];
	  addItem("채식 BLT", " 토마토와 양상추 샐러드", true, 2.99);
	  addItem("그냥 BLT", " 토마토와 상추를 곁들인 베이컨 ", false, 2.99);
	  addItem("오늘의 스프", " 양송이스프", false, 3.29);
	}
	  
	public void addItem(String n, String d, boolean v, double p){
	  MenuItem menuItem = new MenuItem(n,d,v,p);
	  if(numberOfItems>=3){
	    System.out.println("Sorry full..");
	  } else{
	    menuItems[numberOfItems] = menuItem;
	    numberOfItems+=1;
	  }
	}
	  
	public MenuItem[] getMenuItems(){
	  return menuItems;
	}  
}
