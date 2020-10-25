package com.seayon.chapter02.item6;

public class MainTest {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        Operation plus = Operation.valueOf("MINUS");
        System.out.println(plus.toString());

        for (Operation operation : Operation.values()) {
            System.out.printf("%f %s %f = %f%n", x, operation, y, operation.apply(x, y));
        }
    }
}
