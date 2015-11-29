package com.j2.iterator.dinermerger.vegemenu;

import java.util.ArrayList;

public class PancakeHouseMenu {

	ArrayList menuItems;
	  
	public PancakeHouseMenu(){
	  menuItems = new ArrayList();
	  addItem("-P- ä�� BLT", " �丶��� ����� ������", true, 2.99);
	  addItem("-P- �׳� BLT", " �丶��� ���߸� ����� ������ ", false, 2.99);
	  addItem("-P- ������ ����", " ����̽���", true, 3.29);
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
