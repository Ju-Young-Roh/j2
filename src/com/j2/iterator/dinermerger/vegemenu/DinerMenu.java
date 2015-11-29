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
	  addItem("ä�� BLT", " �丶��� ����� ������", true, 2.99);
	  addItem("�׳� BLT", " �丶��� ���߸� ����� ������ ", false, 2.99);
	  addItem("������ ����", " ����̽���", false, 3.29);
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
