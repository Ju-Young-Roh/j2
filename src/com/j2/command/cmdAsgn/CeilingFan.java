package com.j2.command.cmdAsgn;

public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    
    String location;
    int speed;
 
    public CeilingFan(String location) {
        this.location = location;
    }
  
    public void high() {
        speed = HIGH;
        System.out.println(location + " Speed : HIGH");
    } 

    public void medium() {
        speed = MEDIUM;
        System.out.println(location + " Speed : MEDIUM");
    }

    public void low() {
        speed = LOW;
        System.out.println(location + " Speed : LOW");
    }
 
    public void off() {
        speed = OFF;
        System.out.println(location + " ceiling fan is off");
    }
 
    public int getSpeed() {
        return speed;
    }
}