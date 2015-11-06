package com.j2.command.cmdAsgn;

public class DVD {
	
	String location;
	
	public DVD(String location){
		this.location=location;
	}
	
	public void on(){
		System.out.println(location + "DVD is on");
	}
	
	public void off(){
		System.out.println(location + "DVD is off");
	}

}
