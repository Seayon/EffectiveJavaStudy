package com.seayon.jvm;

public class GCWithAge15 {
    public static void main(String[] args) {
        byte[] arrayS = new byte[128 * 1024];
        byte[] array1 = new byte[2 * 1024 * 1024];
        for (int i = 0; i < 14; i++) {
            array1 = new byte[2 * 1024 * 1024];
            array1 = new byte[2 * 1024 * 1024];
            array1 = new byte[4 * 1024 * 1024];
            array1 = null;
        }

        byte[] array4 = new byte[2 * 1024 * 1024];

    }
}
