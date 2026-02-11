package com.beyond.streamapi.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
    수집
     - 최종 처리 기능으로 필터링 또는 매핑한 요소들을 새로운 컬렉션으로 담아서 맅턴하는 역할을 한다.
 */
public class G_Collect {
    public void method01() {
        List<Student> students = Arrays.asList(
                new Student("홍길동", 34, '남', 80, 50),
                new Student("김철수", 20, '남', 50, 50),
                new Student("김영희", 20, '여', 90, 90),
                new Student("성춘향", 20, '여', 80, 80),
                new Student("이몽룡", 22, '남', 80, 80)
        );

        // 학생들의 이름을 내림차순으로 정렬하여 List 컬렉션으로 변환하기
        List<String> names = students.stream()
                .map((student -> student.getName()))
                .sorted(Collections.reverseOrder())
                // .collect(Collectors.toList());
                .toList();  // JDK 16 이상 사용할 수 있음

        System.out.println("List 구조 ----------------------------------------------");
        System.out.println(names);
        System.out.println();

        // -------------------------------------------------------------------

        Set<Student> set = students.stream()
                .filter(student -> student.getGender() == '여')
                .collect(Collectors.toSet());

        System.out.println("Set 구조 ----------------------------------------------");
        System.out.println(set);
        System.out.println();

        // -------------------------------------------------------------------

        // Map 컬렉션으로 추출1 (Key: 이름, Value: Student 객체)
        Map<String, Student> map = students.stream()
                // .collect(Collectors.toMap(student -> student.getName(), student-> student))
                .collect(Collectors.toMap(Student::getName, Function.identity()));

        System.out.println("Map 구조 ----------------------------------------------");
        System.out.println(map);
        System.out.println();

        // Map 컬렉션으로 추출2 (key: 성별, value: List<Student> 객체)
        Map<Character, List<Student>> listMap =
                students.stream()
                        .collect(Collectors.groupingBy(Student::getGender));

        listMap.forEach((key, value) -> {
            System.out.println(key);
            value.forEach(System.out::println);
            System.out.println();
        });
    }
}
