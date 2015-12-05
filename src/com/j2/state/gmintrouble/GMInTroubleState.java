package com.j2.state.gmintrouble;

public class GMInTroubleState implements State{
	GumballMachine gm;
	
	public GMInTroubleState(GumballMachine gm) {
		this.gm = gm;
	}

	public void insertQuarter() {
		System.out.println("GumballMachine is in trouble..");
	}

	public void ejectQuarter() {
		System.out.println("GumballMachine is in trouble..");
	}

	public void turnCrank() {
		System.out.println("GumballMachine is in trouble..");
	}

	public void dispense() {
		System.out.println("GumballMachine is in trouble..");
	}

	public String toString() {
		return "in trouble..";
	}
	
}
