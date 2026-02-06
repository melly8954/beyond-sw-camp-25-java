package com.beyond.lambda;

import com.beyond.lambda.practice.A_FunctionalInterface;
import com.beyond.lambda.practice.B_Consumer;
import com.beyond.lambda.practice.C_Supplier;
import com.beyond.lambda.practice.D_Function;
import com.beyond.lambda.practice.E_Operator;
import com.beyond.lambda.practice.F_Predicate;
import com.beyond.lambda.practice.G_MethodReference;

/*
    람다식(Lambda Expressions)

    [표현볍]
        ([자료형 변수명, ...]) -> {
            실행 코드

            [return 반환값;]
        }

    작성 예시
    1. 매개변수가 없는 경우
        () -> {...}

    2. 매개변수가 있는  경우
        (int a) -> { System.out.printlnt(a); }

    3. 축약형
        (a) -> { System.out.println(a); }

    4. 매개변수가 한 개 / 실행코드가 한 줄
        a -> System.out.println(a);

    5. 매개변수가 두 개 -> 두 개 더한 값을 리턴    (4가지 표현법)
        (int a, int b) -> { return a + b; }
        (a, b) -> { return a + b; }
        (a, b) -> { a + b; }
        (a, b) -> a + b;
 */
public class Application {
    public static void main(String[] args) {
        System.out.println("Application 실행 중..");
        System.out.println();

        // 람다식 표현은 함수형 인터페이스의 구현객체를 만들 수 있다.
        A_FunctionalInterface a = new A_FunctionalInterface();
//        a.method01();
//        a.method02();
//        a.method03();
//        a.method04(300);

        // 표준 함수적 인터페이스
//        new B_Consumer().methd01();
//        new C_Supplier().method01();
//        new D_Function().method01();
//        new E_Operator().method01();
        new F_Predicate().method01();

        // 메서드 참조
        new G_MethodReference().method01();
    }
}
