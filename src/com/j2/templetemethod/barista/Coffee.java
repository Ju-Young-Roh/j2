package com.j2.templetemethod.barista;

public class Coffee extends CaffeineBeverage{
  
  public void brew(){
    System.out.println("Dripping");
  }
  
  public void addCondiments(){
    System.out.println("Adding sugar and milk");
  }
}