package com.j2.templetemethod.macchiato;

public class BeverageTestDrive{
  public static void main(String args[]){
    //Tea tea = new Tea();
    Coffee coffee = new Coffee();
    //tea.prepareRecipe();
    coffee.prepareRecipe();
    
    System.out.println("\nMacchiato..");
    CoffeeWithHook coffeeHook = new CoffeeWithHook();
    coffeeHook.prepareRecipe();
    
    
  }
}