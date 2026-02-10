package com.beyond.streamapi.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
    필터링
        - 필터링은 중간 처리 기능으로 요소를 걸러내는 역할을 한다.
        - distinct(): 요소의 중복을 제거한다.
        - filter(Predicate): 매개값으로 전달되는 Predicate가 false를 리턴하는 요소를 제거한다.
 */
public class B_Filtering {
    // 중복 제거 메서드
    public void method01() {
        List<String> students = Arrays.asList("홍길동", "김철수", "김영희", "이몽룡", "홍길동", "이몽룡");

        // 이미 최종 처리 메서드까지 호출된 스트림은 다시 사용할 수 없다.
        // 리스트로부터 스트림을 다시 얻어야 한다.
        // stream.distinct().forEach(System.out::println);
        students.stream().distinct().forEach(str -> System.out.println(str));
    }

    // 필터 메서드
    public void method02() {
        List<String> students = Arrays.asList("홍길동", "김아무개철수", "김아무개영희", "이몽룡", "성춘향");

        // 성이 김씨인 학생들만 출력
        students.stream()
                .filter(student -> student.startsWith("김"))
                .forEach(student -> System.out.println(student));

        System.out.println();

        // 이름이 3자 글자인 학생만 출력
        students.stream()
                .filter(student -> student.length() == 3)
                .forEach(student -> System.out.println(student));
    }
}
