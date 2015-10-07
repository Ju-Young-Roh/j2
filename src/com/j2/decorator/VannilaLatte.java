package com.j2.decorator;

public class VannilaLatte extends Beverage{
  public VannilaLatte(){
    description="VannilaLatte";
  }
  
  public double cost(){
    return 1.79;
  }
  
}