package com.j2.singleton.chocothread;

public class ChocolateBoiler{
	  private boolean empty;
	  private boolean boiled;
	  
	  private static ChocolateBoiler uniqueInstance;
	  
	  private ChocolateBoiler(){}
	  
	  public static synchronized ChocolateBoiler getInstance(){
	    if(uniqueInstance==null){
	    	synchronized(ChocolateBoiler.class){
	    		if(uniqueInstance == null) {
					uniqueInstance = new ChocolateBoiler();
					System.out.println("Already Created");
	    		}
	      
	    	}
	    }
	    return uniqueInstance;
	  }
	  
	  
	  public void fill(){
	    if(isEmpty()){
	      empty=false;
	      boiled=false;
	      System.out.println("fill..");
	    }
	  }
	  
	  public void drain() {
		    if (!isEmpty() && isBoiled()) {
		      empty = true;
		      System.out.println("drain..");
		    }
		    
	  }
	  
	  public void boil() {
		    if (!isEmpty() && !isBoiled()) {
		      boiled = true;
		      System.out.println("boil..");
		    }
		  }
	  
	  public boolean isEmpty(){
	      return empty;
	    }
	    
	  public boolean isBoiled() {
	        return boiled;
	      
	    }
	}
