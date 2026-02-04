package com.beyond.generics;

import com.beyond.generics.practice.ArrayToListConverter;

public class Application {
    public static void main(String[] args) {
        System.out.println("Application 실행 중..");
        System.out.println();

        String[] names = {"홍길동", "성춘향", "이몽룡", "김철수", "김영희"};
        Integer[] numbers = {10, 20, 30, 40, 50};
        Double[] doubles = {1.1, 2.2, 3.3, 4.4, 5.5};

        // <T extends Number> 일 경우 아래는 사용 불가
        // ArrayToListConverter<String> converter = new ArrayToListConverter<>(names);
        ArrayToListConverter<Double> converter = new ArrayToListConverter<>(doubles);

        converter.print();
        System.out.println(converter.toList());
        System.out.println();
    }
}
