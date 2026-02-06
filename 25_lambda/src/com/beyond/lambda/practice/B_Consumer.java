package com.beyond.lambda.practice;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class B_Consumer {
    /*
        Consumer
            - Consumer 표준 함수적 인터페이스는 리턴값이 없는 accept() 추상 메서드를 가지고 있다.
            - accept() 추상 메서드는 매개값을 소비하는 역할을 한다.
     */
    public void methd01() {
        // Consumer<T>: T 타입의 객체를 받아서 소비한다.
        Consumer<String> consumer = (String str) -> {
            System.out.println(str);
        };
        // 축약
//        Consumer<String> consumer = str -> System.out.println(str);

        consumer.accept("Consumer는 한 개의 매개값을 받아서 소비한다.");


        // BiConsumer<T, U>: T, U 타입의 객체를 받아서 소비한다.
        BiConsumer<String, String> biConsumer = (String str1, String str2) -> {
            System.out.println(str1 + str2);
        };

        // 축약
//        BiConsumer<String, String> biConsumer = (str1, str2 ) -> System.out.println(str1 + str2);

        biConsumer.accept("BiConsumer는 ", "두 개의 매개값을 받아서 소비한다.");


        // DoubleConsumer: double 타입의 값을 받아서 소비한다.
        DoubleConsumer doubleConsumer = (double values) -> {
            System.out.println(values);
        };

        doubleConsumer.accept(3.14);

        // ObjIntConsumer<T> : T 타입의 객체와 int 타입의 값을 받아서 소비한다.
        ObjIntConsumer<String> intConsumer =
                (str, number) -> System.out.printf("%s %d\n", str, number);

        intConsumer.accept("Java", 21);
    }
}