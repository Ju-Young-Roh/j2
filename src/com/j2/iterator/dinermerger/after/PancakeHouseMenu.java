package com.j2.iterator.dinermerger.after;


import com.j2.iterator.dinermerger.before.MenuItem;
import java.util.ArrayList;

public class PancakeHouseMenu{
  ArrayList menuItems;
  
  public PancakeHouseMenu(){
    menuItems = new ArrayList();
    addItem("-P- ä�� BLT", "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
    addItem("-P- �׳� BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99);
    addItem("-P- ������ ����", "Soup of the day, with a side of potato salad", false, 3.29);
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