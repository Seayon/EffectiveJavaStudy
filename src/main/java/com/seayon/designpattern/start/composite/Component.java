package com.seayon.designpattern.start.composite;

public interface Component {

    public void add(Component component);

    public void remove(Component component);

    public Component getChild(int t);

    public void operation();
}
