package com.j2.iterator.dinermerger.vegemenu;

import java.util.ArrayList;

public class PancakeHouseMenu {

	ArrayList menuItems;
	  
	public PancakeHouseMenu(){
	  menuItems = new ArrayList();
	  addItem("-P- 채식 BLT", " 토마토와 양상추 샐러드", true, 2.99);
	  addItem("-P- 그냥 BLT", " 토마토와 상추를 곁들인 베이컨 ", false, 2.99);
	  addItem("-P- 오늘의 스프", " 양송이스프", true, 3.29);
	}
	 
	public void addItem(String n, String d, boolean v, double p){
	  MenuItem menuItem = new MenuItem(n,d,v,p);
	  menuItems.add(menuItem);  
	}
	 
	public ArrayList getMenuItems(){
	  return menuItems;
	}
	
	public String toString() {
	  return "Objectville Pancake House Menu";
	}
	
	public Iterator createIterator(){
	  return new PancakeHouseMenuIterator(menuItems);
	}
}
