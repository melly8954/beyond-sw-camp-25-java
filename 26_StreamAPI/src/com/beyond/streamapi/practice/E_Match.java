package com.beyond.streamapi.practice;

import java.util.Arrays;
import java.util.List;

/*
    매칭
     - 최종 처리 단계에서 요소들이 특정 조건에 만족하는지 조사하는 역할을 한다.
 */
public class E_Match {
    public void method01() {
        boolean result;
        int[] numbers = {1, 2, 4, 6};

        // allMatch() 메서드는 모든 요소들이 매개값으로 주어진 Predicate의 조건을 만족하는지 조사한다.
        result = Arrays.stream(numbers).allMatch(number -> number % 2 == 0);

        System.out.println(result);
        System.out.println();

        // anyMatch() 메서드는 최소 1개의 요소가 매개값으로 주어진 Predicate의 조건을 만족하는지 조사한다.
        result = Arrays.stream(numbers).anyMatch(number -> number % 2 == 0);

        System.out.println(result);
        System.out.println();

        // noneMatch() 메서드는 어떤 요소도 매개값으로 주어진 Predicate의 조건을 만족하지 않는지 조사한다.
        // 즉, 하나라도 조건을 만족할 경우 false 반환
        result = Arrays.stream(numbers).noneMatch(number -> number % 5 == 0);

        System.out.println(result);
        System.out.println();

    }

    public void method02() {
        boolean result;

        List<Student> students = Arrays.asList(
                new Student("홍길동", 34, '남', 80, 50),
                new Student("김철수", 20, '남', 50, 50),
                new Student("김영희", 20, '여', 90, 90),
                new Student("홍길동", 34, '남', 80, 50),
                new Student("이몽룡", 22, '남', 80, 80)
        );

        // 남학생들 중에 평균이 80점 이상인 학생이 한명이라도 존재하는지 확인하십시오.
        result = students.stream()
                .distinct()
                .filter(student -> student.getGender() == '남')
                .anyMatch(student -> student.getAvg() >= 80);

        System.out.println(result);
    }
}
