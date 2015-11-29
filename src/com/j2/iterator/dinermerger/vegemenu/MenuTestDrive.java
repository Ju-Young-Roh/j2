package com.j2.iterator.dinermerger.vegemenu;

import java.util.*;

public class MenuTestDrive {

	public static void main(String[] args){
	    PancakeHouseMenu pm = new PancakeHouseMenu();
	    DinerMenu dm = new DinerMenu();
	    
	    Waitress w = new Waitress(dm,pm);
	    w.printMenu();
	  }
}
