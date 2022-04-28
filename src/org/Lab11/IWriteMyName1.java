package org.Lab11;

public class IWriteMyName1 implements Runnable{
    Writer writer;
    IWriteMyName1(Writer writer){
        this.writer = writer;
    }
    public void run(){
        for (int i = 0; i < 100; i++) {
            writer.writeMyName1(Thread.currentThread().getName());
        }
    }
}
