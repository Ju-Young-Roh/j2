package com.j2.templetemethod.simplebarista;

public class Coffee{
  
  void prepareRecipe(){
    boilWater();
    brewCoffeeGrinds();
    pourInCup();
    addSugarAndMilk();
  }
 
  public void boilWater(){
    System.out.println("Boiling");
  }
  
  public void brewCoffeeGrinds(){
    System.out.println("Dripping");
  }
  
  public void pourInCup(){
    System.out.println("Pouring");
  }
  
  public void addSugarAndMilk(){
    System.out.println("Adding sugar and milk");
  }
}