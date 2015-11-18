package com.j2.templetemethod.barista;

public class BeverageTestDrive{
  public static void main(String args[]){
    //Tea tea = new Tea();
    Coffee coffee = new Coffee();
    //tea.prepareRecipe();
    coffee.prepareRecipe();
    
    CoffeeWithHook coffeeHook = new CoffeeWithHook();
    coffeeHook.prepareRecipe();
    
  }
}