package com.beyond.method.practice;

public class A_Method {
    // 1. 매개 변수와 반환값이 없는 메서드
    public void method01() {
        System.out.println("매개 변수와 반환값이 없는 메서드입니다.");

        // return 뒤에 반환값이 올 경우 에러 발생
        // return "hello";
    }

    // 2. 매개 변수가 없고 반환값만 존재하는 메서드
    public String method02() {
        return "매게 변수가 없지만 반환값은 있는 메서드이다.\n";

        // 반환되는 주소 값이 없을 경우
        // return null;
    }

    // 3. 매개 변수가 있고 반환값은 없는 메서드
    public void method03(int n1, int n2) {
        System.out.printf("입력받은 매개 변수의 합: %d\n", n1 + n2);
        System.out.println();
    }

    // 4. 매개 변수가 있고 반환값도 있는 메서드
    public int method04(int n) {
        return n * n;
    }

    // 5. 매개 변수로 객체를 전달받는 메서드
    public void method05(User user) {
        user.setId("lee");
        user.setPassword("5678");
        user.setName("이몽룡");
    }

    // 6. 매개 변수로 가변 인자를 전달받는 메서드
    // 6-1). 배열을 사용한 가변 인자 방식
//    public int method06(int[] numbers) {
//        int sum = 0;
//
//        for(int number : numbers) {
//            sum += number;
//        }
//        return sum;
//    }

    // 6-2).
    public int method06(int ... numbers) {
        int sum = 0;

        for(int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
