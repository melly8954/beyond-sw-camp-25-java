package com.beyond.lambda.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.Supplier;

public class G_MethodReference {
    public void method01() {
        // 정적 메서드 참조
        // - 클래스 이름 뒤에 :: 붙이고 정적 메서드 이름을 기술한다.
        // IntBinaryOperator intBinaryOperator = (a, b) -> Math.max(a,b);
        IntBinaryOperator intBinaryOperator = Math::max;

        intBinaryOperator.applyAsInt(10, 20);
        System.out.println();


        // 객체의 메서드 참조
        // - 참조 변수 뒤에 :: 붙이고 메서드 이르므을 기술하면 된다.
        // Consumer<String> consumer = str -> System.out.println(str);
        Consumer<String> consumer = System.out::println;
        consumer.accept("Hello World!");
        System.out.println();


        String str = "Hello World!";
        // Supplier<Integer> supplier = () -> str.length();
        Supplier<Integer> supplier = str::length;
        System.out.println(supplier.get());
        System.out.println();


        // 매개변수의 메서드 참조
        // Function<String, Integer> function = s -> s.length();
        Function<String, Integer> function = String::length;
        System.out.println(function.apply("Hello World!"));
        System.out.println();


        // 생성자 참조
        // Supplier<List<String>> listSupplier = () -> new ArrayList<>();
        Supplier<List<String>> listSupplier = ArrayList::new;
        // Function<Integer, List<String>> listFunction = i -> new ArrayList<>(i);
        Function<Integer, List<String>> listFunction = ArrayList::new;
        System.out.println(listSupplier.get());
        System.out.println(listFunction.apply(5));
        System.out.println();
    }
}
