package org.Lab11;

public class IWriteMyName2 implements Runnable{
    Writer writer;
    IWriteMyName2(Writer writer){
        this.writer = writer;
    }
    public void run(){
        for (int i = 0; i < 100; i++) {
            writer.writeMyName2(Thread.currentThread().getName());
        }
    }
}

