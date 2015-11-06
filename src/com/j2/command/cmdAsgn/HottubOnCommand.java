package com.j2.command.cmdAsgn;

public class HottubOnCommand implements Command {
    Hottub hottub;

    public HottubOnCommand(Hottub hottub) {
        this.hottub = hottub;
    }
    public void execute() {
        hottub.on();
        hottub.setTemperature(30);
    }
    public void undo() {
        hottub.off();
    }
}