package com.j2.templetemethod.macchiato;

public abstract class CaffeineBeverage{
  
  public final void prepareRecipe(){
    boilWater();
    brew();
    pourInCup();

    if(customerWantsCondiments()){
		addCondiments();
	}
  }
 
  public void boilWater(){
    System.out.println("Boiling..");
  }
  
  abstract void brew();
  
  public void pourInCup(){
    System.out.println("Pouring..");
  }
  
  abstract void addCondiments();
  
  boolean customerWantsCondiments(){
	return true;
  }
}