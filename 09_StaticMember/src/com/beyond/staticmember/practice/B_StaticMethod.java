package com.beyond.staticmember.practice;

import java.util.Arrays;

public class B_StaticMethod {
    private static int num1 = 10;
    private static int num2 = 18;
    private int num3 = 30;

    // 1. 매개 변수와 반환값이 없는 정적 메서드
    public static void method01() {
        System.out.println(num1 + num2++);

        // 정적 메서드에서 필드에 접근할 수 없다.
        // 정적 메서드는 객체를 생성하지 않고 사용하므로 필드에 접근할 수 없다.
        // System.out.println(num3);
    }

    // 2. 매개 변수가 없고 반환값이 있는 메서드
    public static int method02() {
        int num1 = 20;
        int num2 = 30;

        // 정적 메서드에서는 this를 사용할 수 없다.
        // 따라서, B_StaticMethod.num1 형태로 접근한다.
        return num1 + num2 + B_StaticMethod.num2;
    }

    // 3. 매개 변수가 있고 반환값이 없는 메서드
    public static void method03(int number) {
        // 정적 메서드 안에서 다른 정적 메서드를 호출할 수 있다.
        // 단, 정적 메서드 안에서 일반 메서드는 호출할 수 없다.
        // this와 마찬가지로 객체를 생성하지 않고 사용하기 때문이다.
        // ex). sum(number);
        System.out.println(B_StaticMethod.method02() + number);
    }

    private int sum(int number) {
        return number + this.num3;
    }

    // 4. 매개 변수와 반환값이 있는 정적 메서드
    public static int method04(int... numbers) {
        return Arrays.stream(numbers).sum();
    }
}
