package com.seayon.designpattern.start.composite;

public class Leaf implements Component {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void add(Component component) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(Component component) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Component getChild(int t) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void operation() {
        System.out.println("树叶构件" + name + "被调用");
    }
}
