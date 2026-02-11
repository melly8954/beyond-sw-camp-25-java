package com.beyond.streamapi.practice;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

/*
    기본 집계
     - 최종 처리 기능으로 요소돌의 개수, 합계, 평균, 최대값, 최소값 등과 같이 하나의 값으로 산출하는 역할을 한다.

    Optional 클래스
     - 스트림의 최종 결과값을 저장하는 객체이다.
     - 값의 존재 여부를 확인하고 값이 존재하지 않을 경우 기본값을 설정할 수 있는 객체이다.
 */
public class F_Aggregate {
    public void method01() {
//        int[] numbers = {1, 2, 3, 4, 5, 6};
        int[] numbers = {1, 3, 5};

        // 2의 배수의 개수
        long count = Arrays.stream(numbers).filter(number -> number % 2 == 0).count();
        System.out.println(count);

        // 2의 배수의 합계
        int sum = Arrays.stream(numbers).filter(number -> number % 2 == 0).sum();
        System.out.println(sum);

        // 2의 배수의 평균
        // average() 메서드는 Optional로 반환 -> getAsDouble() 확인하기
        OptionalDouble average = Arrays.stream(numbers).filter(number -> number % 2 == 0).average();
        // get() 메서드는 Optional 객체에 저장된 값을 가져온다.
//        System.out.println(average.getAsDouble());

        // isPresent() 메서드는 값의 존재 여부를 확인할 수 있다.
//        if (average.isPresent()) {
//            System.out.println(average.getAsDouble());
//        } else {
//            System.out.println(0);
//        }

        // ifPresent() 메서드는 집계 값을 처리하는 Consumer를 등록한다. (단, 값이 존재해야 실행된다.)
//        average.ifPresent((avg) -> System.out.println(avg));

        // orElse() 메서드는 get() 메서드와 동일하게 저장된 값을 얻어오는 메서드이다.
        // 단, 값이 저장되어 있지 않을 경우 리턴 받을 기본값을 지정할 수 있다.
        System.out.println(average.orElse(0.0));

        // ----------------------------------------------------------------------------------------
        System.out.println();

        // 2의 배수의 최솟값
        OptionalInt min = Arrays.stream(numbers).filter(number -> number % 2 == 0).min();

        // 2의 배수의 최댓값
        OptionalInt max = Arrays.stream(numbers).filter(number -> number % 2 == 0).max();

        System.out.println(min.orElse(0));
        System.out.println(max.orElse(0));
    }
}

