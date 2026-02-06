package com.beyond.lambda.practice;

import java.util.Objects;
import java.util.function.BiPredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class F_Predicate {
    public void method01() {
        /*
            Predicate
                - Predicate 표준 함수적 인터페이스는 매개변수와 boolean 값을 리턴하는 test() 추상 메서드를 가지고 있다.
                - test() 추상 메서드는 매개값을 조사해서 true/false를 리턴하는 역할을 한다.
         */
        // Predicate<T>: T 타입의 객체를 조사해서 true 또는 false를 리턴한다.
        Predicate<String> predicate = name -> Objects.equals("홍길동", name);
        System.out.println(predicate.test("홍길동"));
        System.out.println(predicate.test("이몽룡"));
        System.out.println();


        // BiPredicate<T, U>: T 타입의 객체와 U 타입의 객체를 조사해서 true 또는 false를 리턴한다.
        BiPredicate<String, String> biPredicate = (str1, str2) -> Objects.equals(str1, str2);
        System.out.println(biPredicate.test("홍길동", "홍길동"));
        System.out.println(biPredicate.test("홍길동", "이몽룡"));
        System.out.println();

        // IntPredicate: int 타입의 값을 조사해서 true 또는 false를 리턴한다.
        IntPredicate intPredicate = value -> value % 2 == 0;

        System.out.println(intPredicate.test(10));
        System.out.println(intPredicate.test(15));
        System.out.println();
    }
}
