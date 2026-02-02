package com.beyond.iface.practice;

public interface Basic {
    // 인터페이스에서 필드를 선언하면 자동으로 상수가 된다.
    // public static final를 사용하며 생략됨
    // (public static final) int NUMBER = 101;
    // int NUMBER; 는 에러 (초기화를 하지 않음)
    int NUMBER = 101;

    // 생성자 사용 불가
    // public Basic(){} 에러

    // 일반적인 메서드 사용 불가
    // public void test() {}

    // 추상 메서드 사용
    // 인터페이스에서 메서드는 기본적으로 추상 메서드를 사용한다.
    // public abstract void turnOn();
    void turnOn();
    void turnOff();
}
