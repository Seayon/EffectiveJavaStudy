package com.seayon.designpattern.start.factoryMethod;

import java.security.ProtectionDomain;

public class FactoryTest {
    public static void main(String[] args) {
        String className = "com.seayon.designpattern.start.factoryMethod.Product2CreateFactory";

        try {
            Class<?> c = Class.forName(className);
            ProductCreateFactory productCreateFactory;
            Object o = c.newInstance();
            ProductCreateFactory o1 = (ProductCreateFactory) o;
            Product product = o1.create();
            System.out.println(product.name());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }


    }
}
