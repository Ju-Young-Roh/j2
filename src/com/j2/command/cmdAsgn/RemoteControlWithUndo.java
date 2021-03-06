package com.j2.command.cmdAsgn;

public class RemoteControlWithUndo{
  Command[] onCommands;
  Command[] offCommands;
  
  public RemoteControlWithUndo(){
    onCommands=new Command[7];
    offCommands=new Command[7];
    Command noCommand = new NoCommand();
    for(int i=0; i<7; i++){
      onCommands[i]=noCommand;
      offCommands[i]=noCommand;
    }
  }
  
  public void setCommand(int slot, Command on, Command off){
    onCommands[slot]=on;
    offCommands[slot]=off;
  }
  
  public void onButtonWasPushed(int slot){
    onCommands[slot].execute();
    
  }
  
  public void offButtonWasPushed(int slot){
    offCommands[slot].execute();
  }
}