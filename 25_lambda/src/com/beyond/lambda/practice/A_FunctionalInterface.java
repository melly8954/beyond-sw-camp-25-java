package com.beyond.lambda.practice;

import com.beyond.lambda.functional.A_Functional;
import com.beyond.lambda.functional.B_Functional;
import com.beyond.lambda.functional.C_Functional;

public class A_FunctionalInterface {
    public void method01() {
        A_Functional fi;

        // 기존 익명클래스 구현 시

        // 람다표현식을 사용한 추상 메서드 재정의
        fi = () -> {
            System.out.println("매개변수와 반환값이 없는 람다식(1)");
        };

        fi = () -> System.out.println("매개변수와 반환값이 없는 람다식(2)");

        // 추상 메서드 호출
        fi.execute();
    }

    public void method02() {
        B_Functional fi;
        fi = (int a) -> {
            System.out.println(a * 2);
        };

        // 매개변수 하나라 괄호 생략 할 수 있음
        fi = a -> System.out.println((a * a));

        fi.execute(10);
    }

    public void method03() {
        C_Functional fi;

        fi = (int a, int b) -> {
            return a + b;
        };

        fi = (a, b) -> a * b;

        System.out.println(fi.execute(10, 20));
    }

    // 람다식에서 필드와 지역 변수 사용하기
    private  int number = 100;

    public void method04(int arg) {
        A_Functional fi;

        int number = 200;

        // 람다식에서 지역변수를 사용할때는 final 이거나 유사 final이여야 한다.
        // - 초기화된 이후에 값이 한 번도 변경하지 않는 변수를 유사 final이라고 한다.
        // - 지역변수는 람다식에서 읽는 것은 가능하지만, 람다식 내부 또는 외부에서 값을 변경할 수 없다.

        // arg = 600;
        // number = 500;
        this.number = 400;  // 단, 필드는 읽고 쓰기 다 가능하다.

        // 람다식에서 사용되는 this는 람다식이 실행하는 객체의 참조이다.
        fi = () -> {
            // arg = 600;
            // number = 500;

            System.out.println(arg);    // 300
            System.out.println(number); // 200
            System.out.println(this.number);    // 400
            System.out.println();
        };

        fi.execute();

        // 익명 구현 객체에서 사용되는 this는 익명 구현 객체로 생성된 객체의 참조이다.
        fi = new A_Functional() {
            private int number = 400;

            @Override
            public void execute() {
                // arg = 600;
                // number = 500;

                System.out.println(arg);
                System.out.println(number);
                System.out.println(this.number);
            }
        };

        fi.execute();
    }
}
