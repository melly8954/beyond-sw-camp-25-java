package com.beyond.lambda.practice;

import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;

public class E_Operator {
    /*
        Operator
            - Operator 표준 함수적 인터페이스는 매개값과 리턴값이 있는 apply() 추상 메서드를 가지고 있다.
            - apply() 추상 메서드는 주로 매개값을 이용해서 연산하고 동일한 타입으로 결과를 리턴하는 역할을 한다.
     */
    public void method01() {
        // IntBinaryOperator: 두 개의 int 값을 연산해서 int 타입의 값을 리턴한다.
        IntBinaryOperator intBinaryOperator = (left, right) -> left * right;
        System.out.println(intBinaryOperator.applyAsInt(10, 20));


        // IntUnaryOperator: 한 개의 int 값을 연산해서 int 타입의 값으로 리턴한다.
        IntUnaryOperator intUnaryOperator = (a) -> a * a * a;
        System.out.println(intUnaryOperator.applyAsInt(2));


        // BinaryOperator<T>: 두 개의 T 타입 객체를 연산해서 T 타입 객체를 리턴한다.
        BinaryOperator<String> binaryOperator = (str1, str2)
                -> str1.length() >= str2.length() ? str1 : str2;
        System.out.println(binaryOperator.apply("가나다라마바", "아자차카타파하"));
    }
}
