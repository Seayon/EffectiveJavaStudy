package com.seayon.jvm;

import sun.java2d.opengl.CGLSurfaceData;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedLongSynchronizer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class GCWithAge15 implements Runnable{
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
        Thread.currentThread().isInterrupted();
        Thread.currentThread().setPriority(1);
        int normPriority = Thread.NORM_PRIORITY;
        Thread.currentThread().setDaemon(true);
        GCWithAge15 gcWithAge15 = new GCWithAge15();
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {

            }
        });
        Thread.currentThread().interrupt();
        Thread.State state = Thread.currentThread().getState();
        System.out.println(state);
        ReentrantLock reentrantLock = new ReentrantLock();
        // reentrantLock.tryLock(300, TimeUnit.DAYS);
        // this.wait();
        LinkedTransferQueue<Object> objects = new LinkedTransferQueue<>();
        // objects.transfer("");
        ConcurrentHashMap<Object, Object> objectObjectConcurrentHashMap = new ConcurrentHashMap<>(1, 0.71f, 2);
        objectObjectConcurrentHashMap.size();

        // AbstractQueuedLongSynchronizer.ConditionObject conditionObject = new AbstractQueuedLongSynchronizer.ConditionObject();



    }

    @Override
    public void run() {

    }
}
