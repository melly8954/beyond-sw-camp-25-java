package com.beyond.streamapi.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
    매핑
     -  중간 처리 기능으로 스트림의 요소를 다른 요소로 대체하는 역할을 한다.
 */
public class D_Mapping {
    public void method01() {
        int[] iNumbers = {1, 2, 3, 4, 5};
        double[] dNumbers = {1.1, 2.2, 3.3, 4.4, 5.5};

        Arrays.stream(iNumbers) // IntStream은 자동 형 변환이 가능 한 long과 double 로 변환 가능
                .asLongStream()     // LongStream 변환
//                .asDoubleStream()   // DoubleStream 변환
                .forEach(number -> System.out.println(number));

        System.out.println();

        // 중간 처리 메서드는 최종 처리 메서드가 호출되어야 동작한다.
        // 즉, peek(), sorted()는 sum()과 같은 최종 처리 메서드가 호출되어야 작동한다.
        double sum = Arrays.stream(dNumbers)
                .boxed()
                .sorted(Collections.reverseOrder())
                // 박싱 후 sum()과 같은 메서드는 사용할 수 없다.
                // 즉, 객체끼리 sum()은 사용할 수 없다.
                .mapToDouble(d -> d.doubleValue())
//                .sum(); // 최종 처리 메서드이므로 forEach 사용할 수 없음
                // 따라서, peek() 중간 처리 메서드 사용
                .peek(d -> System.out.print(d + " "))
                .sum();

        System.out.println("\nSum : " + sum);
    }

    public void method02() {
        List<Student> students = Arrays.asList(
                new Student("홍길동", 34, '남', 80, 50),
                new Student("김철수", 20, '남', 50, 50),
                new Student("김영희", 20, '여', 90, 90),
                new Student("홍길동", 34, '남', 80, 50),
                new Student("이몽룡", 22, '남', 80, 80)
        );

        // 학생들의 이름을 오름차순으로 출력
        students.stream()
                .distinct()
                // map을 이용해서 Stream<Student>에서 getName()의 Stream<String>으로 변환
                .map(student -> student.getName())
                .sorted()
                .forEach(name -> System.out.println(name));

        System.out.println();

        // 학생들의 수학 점수의 합계
        int sum = students.stream()
                .distinct()
                .mapToInt(student -> student.getMath())
                .sum();
        System.out.println("Sum : " + sum);
    }
}
