package com.beyond.lambda.functional;

// 함수적 인터페이스 (추상 메서드가 1개)
// execute() 외 다른 추상 메서드가 생성될 시 함수적 인터페이스가 아님 -> 람다식 불가

@FunctionalInterface    // 컴파일러 레벨에서 함수적 인터페이스를 체크, 필수는 아니다.
public interface A_Functional {
    void execute();
}
