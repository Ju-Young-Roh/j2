package com.j2.command.cmdAsgn;

public class RemoteLoader{
  public static void main(String[] args){
	  
	  RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

      Light light = new Light("Living Room");
      DVD dvd = new DVD("Living Room");
      Hottub hottub = new Hottub();
      CeilingFan cf = new CeilingFan("Living Room");
      
      LightOnCommand lightOn = new LightOnCommand(light);
      DVDOnCommand dvdOn = new DVDOnCommand(dvd);
      HottubOnCommand hottubOn = new HottubOnCommand(hottub);
      CeilingFanHighCommand CFHigh = new CeilingFanHighCommand(cf);
      LightOffCommand lightOff = new LightOffCommand(light);
      DVDOffCommand dvdOff = new DVDOffCommand(dvd);
      HottubOffCommand hottubOff = new HottubOffCommand(hottub);
      CeilingFanOffCommand CFOff = new CeilingFanOffCommand(cf);
      
      Command[] partyOn = { lightOn, dvdOn, hottubOn, CFHigh};
      Command[] partyOff = { lightOff, dvdOff, hottubOff, CFOff};

      MacroCommand partyOnMacro = new MacroCommand(partyOn);
      MacroCommand partyOffMacro = new MacroCommand(partyOff);

      remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

      System.out.println(remoteControl);
      System.out.println("--- Pushing Macro On---");
      remoteControl.onButtonWasPushed(0);
      System.out.println("--- Pushing Macro Off---");
      remoteControl.offButtonWasPushed(0);
  }
}