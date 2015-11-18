package com.j2.templetemethod.simplebarista;

public class Tea{
  
  void prepareRecipe(){
    boilWater();
    steepTeaBag();
    pourInCup();
    addLemon();
  }
 
  public void boilWater(){
    System.out.println("Boiling");
  }
  
  public void steepTeaBag(){
    System.out.println("Steeping");
  }
  
  public void pourInCup(){
    System.out.println("Pouring");
  }
  
  public void addLemon(){
    System.out.println("Adding Lemon");
  }
}