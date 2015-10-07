package com.j2.decorator;

public class VannilaSyrup extends CondimentDecorator{
  
  public VannilaSyrup(Beverage beverage){
    this.beverage=beverage;
  }
  
  public String getDescription(){
    return beverage.getDescription()+", VannilaSyrup";
  }
  
  public double cost(){
    return 0.25+beverage.cost();
  }
}
