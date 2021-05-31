package com.seayon.designpattern.start.command;

public class Receiver {
    public void action(String commandReturn) {
//
        System.out.print("receiver处理命令结果: ");
        System.out.println(commandReturn.toCharArray());
    }
}
