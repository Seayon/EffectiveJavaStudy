package com.seayon.designpattern.start.command;

public class ConcreteCommand implements Command {

    private Receiver receiver = new Receiver();

    @Override
    public void execute() {
        System.out.println("具体命令 1");
        receiver.action("具体命令 1");
    }


}
