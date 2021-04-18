package com.seayon.jvm;

public class BiSystem {
    public static void main(String[] args) throws Exception {
        Thread.sleep(3000);
        while (true) {
            loadData();
        }
    }

    public static void loadData() throws Exception{
        byte[] data = null;
        for (int i = 0; i < 50; i++) {
            data = new byte[100 * 1024];
        }
        data = null;
        Thread.sleep(1000);
    }
}
