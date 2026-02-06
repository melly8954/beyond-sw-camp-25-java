package com.beyond.threadcontrol.practice;

public class Storage {
    private int product;
    private boolean isEmpty = true;

    public synchronized void getProduct() throws InterruptedException {
        while(isEmpty) {
            wait();
        }

        System.out.printf("소비자가 %d번 상품을 소비하였습니다.\n", this.product);
        this.isEmpty = true;
        notify();   // wait() 메서드에 의해서 일시 정지된 스레드 중 한 개를 실행 대기 상태로 만든다.
    }

    public synchronized void setProduct(int product) throws InterruptedException {
        while(!isEmpty) {
            wait(); // 객체의 잠금을 풀고 스레드를 일시 정지 상태로 만든다.
        }

        this.product = product;
        this.isEmpty = false;
        System.out.printf("생산자가 %d번 상품을 생산하였습니다.\n", this.product);
        notify();
    }
}
