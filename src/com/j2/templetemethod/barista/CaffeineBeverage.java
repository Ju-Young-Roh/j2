package com.j2.templetemethod.barista;

public abstract class CaffeineBeverage{
  
  public final void prepareRecipe(){
    boilWater();
    brew();
    pourInCup();
    addCondiments();
  }
 
  public void boilWater(){
    System.out.println("Boiling");
  }
  
  abstract void brew();
  
  public void pourInCup(){
    System.out.println("Pouring");
  }
  
  abstract void addCondiments();
}