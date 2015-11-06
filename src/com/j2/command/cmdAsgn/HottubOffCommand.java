package com.j2.command.cmdAsgn;

public class HottubOffCommand implements Command {
    Hottub hottub;

    public HottubOffCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    public void execute() {
        hottub.setTemperature(24);
        hottub.off();
    }
    public void undo() {
        hottub.on();
    }
}