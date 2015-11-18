package com.j2.templetemethod.simplebarista;

public class Barista{
  public static void main(String args[]){
    Tea tea = new Tea();
    Coffee coffee = new Coffee();
    tea.prepareRecipe();
    coffee.prepareRecipe();
    
  }
}