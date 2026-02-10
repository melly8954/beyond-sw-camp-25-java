package com.beyond.streamapi.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

/*
    정렬
        - 스트림의 요소들이 최종 처리가 되기 전에 중간 단계에서 요소들을 정렬할 수 있다.
        - IntStream, LongStream, DoubleStream은 요소를 오름차순으로 정렬한다.
        - Stream<T>은 요소 객체가 Comparable 인터페이스를 구현해야 정렬할 수 있다.
 */
public class C_Sort {
    // 요소가 기본 자료형일 때
    public void method01() {
        IntStream.of(3, 5, 1, 4, 2)
                // 오름 차순 정렬 (반환형은 스트림 -> 중간 처리)
                .sorted()
                .forEach(n -> System.out.print(n + " "));

        System.out.println();

        // 내림차순 정렬
        // 기본 자료형의 IntStream으로 정렬 시 내림차순은 타입 변환(래핑,박싱)을 해야함
        IntStream.of(7, 2, 9, 13, 3, 12)
                .boxed()
                .sorted(Collections.reverseOrder())
                .forEach(n -> System.out.print(n + " "));
    }

    // 요소가 객체일 때
    public void method02() {
        List<String> students = Arrays.asList("홍길동", "김철수", "김영희", "이몽룡", "성춘향");

        // 오름차순 정렬
        students.stream()
                .sorted()
                .forEach(student -> System.out.println(student));

        System.out.println();

        // 내림차순 정렬
        students.stream()
                // .sorted((s1, s2) -> s2.compareTo(s1))
                .sorted(Collections.reverseOrder())
                .forEach(student -> System.out.println(student));
    }
}
