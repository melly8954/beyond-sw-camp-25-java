package com.beyond.lambda.practice;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.DoubleFunction;
import java.util.function.DoubleToIntFunction;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class D_Function {
    public void method01() {
        /*
            Function
                - Function 표준 함수적 인터페이스는 매개값과 리턴값이 있는 apply() 추상 메서드를 가지고 있다.
                - apply() 추상 메서드는 주로 매개값을 리턴값으로 매핑(타입 변환)하는 역할을 한다.
         */
        // Function<T, R>: T 타입의 객체를 R 타입의 객체로 매핑(타입 변환)한다.
        Function<String, Integer> function = (str) -> Integer.parseInt(str);

        System.out.println(function.apply("12345"));


        // BiFunction<T, U, R>: T 타입의 객체와 U타입의 객체를 R 타입의 객체로 매핑(타입 변환)한다.
        BiFunction<Integer, Double, String> biFunction = (i, d)
                -> String.format("%d + %.1f = %.1f\n", i, d, (i + d));

        System.out.println(biFunction.apply(10, 3.14));


        // ToIntFunction<T>: T타입의 객체를 int 타입의 값으로 매핑(타입 변환)한다.
        ToIntFunction<String> stringToIntFunction = str -> Integer.parseInt(str);

        System.out.println(stringToIntFunction.applyAsInt("2468"));
    }
}

