package com.j2.state.gumballstatewinner;

public class HasQuarterState implements State{
  GumballMachine gm;
  randomWinner = new Random(System.currentTimeMillis());
  
  public HasQuarterState(GumballMachine gm){
    this.gm = gm;
  }
  public void insertQuarter(){
    System.out.println("You can't insert another quarter");
  }
  public void ejectQuarter(){
    System.out.println("Quarter returned");
    gm.setState(gm.getNoQuarterState());
  }
  public void turnCrank(){
    System.out.println("You turned...");
    randomWinner.nextInt(10);
    if(winner==0 &&gm.getCount()>1)
      gm.setState(gm.getWinnerState());
    else
      gm.setState(gm.getSoldState());
    
  }
  public void dispense(){
    System.out.println("No gumball dispensed");
  }
  
}