package com.beyond.lambda.practice;

import java.util.function.DoubleSupplier;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class C_Supplier {
    /*
        Supplier
            - Supplier 표준 함수적 인터페이스는 매개값이 없고 리턴값이 있는 get() 추상 메서드를 가지고 있다.
            - get() 추상 메서드는 메서드를 호출한 곳으로 데이터를 공급(리턴)하는 역할을 한다.
     */
    public void method01() {
        // Supplier<T>: T 타입의 객체를 리턴한다.
//        Supplier<String> supplier = () -> {
//            return "Supplier는 객체를 리턴한다.";
//        };

        Supplier<String> supplier = () -> "Supplier는 객체를 리턴한다.";

        System.out.println(supplier.get());


        // DoubleSupplier: double 타입의 값을 리턴한다.
        DoubleSupplier doubleSupplier = () -> Double.MAX_VALUE;

        System.out.println(doubleSupplier.getAsDouble());
    }
}
