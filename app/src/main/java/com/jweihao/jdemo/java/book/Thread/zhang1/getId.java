package com.jweihao.jdemo.java.book.Thread.zhang1;

/**
 * Created by weihao on 2018/4/11.
 */
public class getId {
    public static void main(String[] args) {
        Thread runThread = Thread.currentThread();
        System.out.println(runThread.getName() + " " + runThread.getId());
    }
}
