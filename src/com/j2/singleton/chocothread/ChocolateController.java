package com.j2.singleton.chocothread;

public class ChocolateController{
	public static void main(String[] args) {
		Thread th1 = new Thread(new Runnable() {
			public void run() {
				ChocolateBoiler cb1 = ChocolateBoiler.getInstance();
				
				for(int i = 0; i < 2; i++)
					boilerControl(cb1); 
				//System.out.println("a");
			}
		});
		
		Thread th2 = new Thread(new Runnable() {
			public void run() {
				ChocolateBoiler cb2 = ChocolateBoiler.getInstance();
				for(int i = 0; i < 2; i++)
					boilerControl(cb2);
				//System.out.println("b");
			}
		});
		
		th1.start();
		th2.start();
	}
	
	private static void boilerControl(ChocolateBoiler boiler) {
		synchronized(boiler) {
			boiler.fill();
			boiler.boil();
			boiler.drain();
			System.out.println();
		}
	}

}