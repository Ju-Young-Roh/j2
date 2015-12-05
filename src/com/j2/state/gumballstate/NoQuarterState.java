package com.j2.state.gumballstate;

public class NoQuarterState implements State{
  GumballMachine gm;
  
  public NoQuarterState(GumballMachine gm){
    this.gm = gm;
  }
  public void insertQuarter(){
    gm.setState(gm.getHasQuarterState());//state = HAS_QUARTER;
    System.out.println("You inserted a quarter");
  }
  public void ejectQuarter(){
    System.out.println("You haven't inserted a quarter");
  }
  public void turnCrank(){
    System.out.println("You turned but there's no quarter");
  }
  public void dispense(){
    System.out.println("You need to pay first");
  }
  public String toString() {
    return "waiting for quarter";
 }
}