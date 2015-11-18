package com.j2.templetemethod.barista;

public class CoffeeWithHook extends CaffeineBeverageWithHook{
  
  public void brew(){
    System.out.println("Dripping");
  }
  
  public void addCondiments(){
    System.out.println("Adding sugar and milk");
  }
  
  public boolean customerWantsCondiments(){
    String answer = "yes";
    if(answer.toLowerCase().startsWith("y")){
      return true;
    } else {
      return false;
    }
  }
}