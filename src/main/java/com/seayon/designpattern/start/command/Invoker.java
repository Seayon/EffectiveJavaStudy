package com.seayon.designpattern.start.command;

public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void cell() {
        command.execute();

    }
}
