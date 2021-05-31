package com.seayon.designpattern.start.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{

    private List<Component> children = new ArrayList<>();


    @Override
    public void add(Component component) {
        children.add(component);
    }

    @Override
    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public Component getChild(int t) {
        return children.get(t);
    }

    @Override
    public void operation() {
        children.stream().forEach(Component::operation);
    }
}
