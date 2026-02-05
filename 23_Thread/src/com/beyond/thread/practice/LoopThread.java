package com.beyond.thread.practice;

public class LoopThread extends Thread{
    @Override
    public void run() {
        // 작업 스레드가 실행할 코드를 작성한다.
        for(int i = 0; i < 50; i++) {
            System.out.printf("%s[%d]\n", Thread.currentThread().getName(), i+1);
        }
    }
}
