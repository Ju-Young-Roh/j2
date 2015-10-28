package com.j2.singleton.stat;

public class Singleton{
 
  private static Singleton uniqueInstance=new Singleton();
  private static int numCalled;
  
  private Singleton(){}
  
  public static Singleton getInstance(){
    
    System.out.println("numCalled: "+numCalled++);
    return uniqueInstance;
  }
  
 
}