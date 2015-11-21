package com.j2.templetemethod.comparator;

import java.util.Arrays;

public class DuckSortTestDrive{
  public static void main(String args[]){
    Duck[] ducks = {new Duck("Daffy",8),new Duck("Decoy",2),new Duck("Caffy",7),new Duck("Polly",6)};
    Arrays.sort(ducks);
    display(ducks);
    
    System.out.println("");
    
    Arrays.sort(ducks, new CompareDuck());
    display(ducks);
  }
  
  public static void display(Duck[] ducks){
    for(int i=0;i<ducks.length;i++){
      System.out.println(ducks[i]);
    }
  }
}