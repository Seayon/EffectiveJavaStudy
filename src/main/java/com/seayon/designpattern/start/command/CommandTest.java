package com.seayon.designpattern.start.command;

public class CommandTest {
    public static void main(String[] args) {
        Command command = new ConcreteCommand();
        Invoker invoker = new Invoker(command);
        invoker.cell();
    }
}
