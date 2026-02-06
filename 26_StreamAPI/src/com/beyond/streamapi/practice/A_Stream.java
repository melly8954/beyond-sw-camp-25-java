package com.beyond.streamapi.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class A_Stream {
    // 숫자 범위로 스트림 생성
    public void method01() {
        IntStream stream;
        int sum;

        // 첫 번째 매개 값 ~ 두 번째 매개 값 이전까지의 값을 요소로 가지는 스트림 객체를 생성한다.
        // stream = IntStream.range(1,10);

        // 첫 번째 매개 값 ~ 두 번째 매개 값까지의 값을 요소로 가지는 스트림 객체를 생성한다.
        stream = IntStream.rangeClosed(1,10);

        sum = stream.sum();
        System.out.println(sum);
    }

    // 배열로 스트림 생성
    public void method02() {
        String[] names = {"홍길동", "이몽룡", "성춘향", "임꺽정", "성춘향"};

        // Stream<String> stream = Arrays.stream(names);
        Stream<String> stream = Stream.of(names);

        stream.distinct().forEach(str -> System.out.print(str + " "));
    }

    // 컬렉션으로 스트림 생성
    public void method03() {
        // 고정된 요소를 만든다. (수정 불가) ?
        List<String> names = Arrays.asList("홍길동", "이몽룡", "성춘향", "임꺽정", "성춘향");

        Stream<String> stream = names.stream();

        stream.distinct().forEach(name -> System.out.print(name + " "));
    }
}
