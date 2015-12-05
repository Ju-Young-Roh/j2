package com.j2.state.gumballstatewinner;

public class WinnerState implements State {
    GumballMachine gm;
 
    public WinnerState(GumballMachine gm) {
        this.gm = gm;
    }
 
 public void insertQuarter() {
  System.out.println("Please wait, we're already giving you a Gumball");
 }
 
 public void ejectQuarter() {
  System.out.println("Please wait, we're already giving you a Gumball");
 }
 
 public void turnCrank() {
  System.out.println("Turning again doesn't get you another gumball!");
 }
 
 public void dispense() {
  System.out.println("YOU'RE A WINNER! You get two gumballs for your quarter");
  gm.releaseBall();
  if (gm.getCount() == 0) {
   gm.setState(gm.getSoldOutState());
  } else {
   gm.releaseBall();
   if (gm.getCount() > 0) {
    gm.setState(gm.getNoQuarterState());
   } else {
             System.out.println("Oops, out of gumballs!");
    gm.setState(gm.getSoldOutState());
   }
  }
 }
 
 public String toString() {
  return "despensing two gumballs for your quarter, because YOU'RE A WINNER!";
 }
}