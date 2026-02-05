package com.beyond.thread;

import com.beyond.thread.practice.LoopRunnable;
import com.beyond.thread.practice.LoopThread;

public class Application {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("메인 스레드 시작");

        System.out.printf("%s\n", Thread.currentThread().getName());

        // 스레드 생성 방법
        // 1. Thread 클래스를 상속받는 방법
        LoopThread loopThread = new LoopThread();

        loopThread.setName("Thread_Test_01");
        // loopThread.run();
        loopThread.start();

        // 2. Runnable 인터페이스를 구현하는 방법
        Thread thread = new Thread(new LoopRunnable());

        thread.setName("Thread_Test_02");
        thread.start();

        // 3. 익명 구현 객체로 Runnable 인터페이스 구현
        Thread annoymousThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 50; i++) {
                    System.out.printf("%s[%d]\n", Thread.currentThread().getName(), i+1);
                }
            }
        });

        annoymousThread.setName("Thread_Test_03");
        annoymousThread.start();

        // 4. 람다식으로 Runnable 인터페이스 구현
        Thread lamdaThread = new Thread(() -> {
            for(int i = 0; i < 50; i++) {
                System.out.printf("%s[%d]\n", Thread.currentThread().getName(), i+1);
            }
        });

        lamdaThread.setName("Thread_Test_04");
        /*
            데몬 스레드
                - 보조적인 역할을 수행하는 스레드이다.
                - 모든 스레드가 종료되면 데몬 스레드는 강제로 종료된다.
         */
        lamdaThread.setDaemon(true);
        lamdaThread.start();

        /*
            join() 메서드
                - join() 메서드를 호출한 스레드는 해당 스레드가 종료될 때까지 기다렸다가
                - 스레드가 종료되면 호출한 스레드를 다시 실행한다.
         */
        loopThread.join();
        thread.join();
        annoymousThread.join();

        System.out.println("메인 스레드 종료");
    }
}
