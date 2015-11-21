package com.j2.templetemethod.macchiato;

import java.io.*;

public class CoffeeWithHook extends CaffeineBeverage{
  
  public void brew(){
    System.out.println("Dripping..");
  }
  
  public void addCondiments(){
    System.out.println("Adding Vannila syrup and Caramel syrup.. and milk");
  }
  
  public boolean customerWantsCondiments(){
	  String answer = getUserInput();

		if (answer.toLowerCase().startsWith("y")) {
			return true;
		} else {
			return false;
		}
  }
  
  private String getUserInput() {
		String answer = null;

		System.out.println("Would you like milk and sugar with your coffee (y/n)? ");

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			answer = in.readLine();
		} catch (IOException e) {
			e.printStackTrace(); 
		}
		if (answer == null) {
			return "no";
		}
		return answer;
	}
}