package com.beyond.control.practice;

public class C_For {
    // 1부터 10까지의 정수들의 합계를 출력
    public void method01() {
        int sum = 0;

        for (int i = 0; i <= 10; i++) {
            sum += i;
        }

        System.out.printf("합계: %d\n", sum);
    }

    // 1부터 랜덤값(1 ~ 10)까지의 합계를 출력
    public void method02() {
        // java.lang.Math 클래스에서 제공하는 random() 메서드를 사용해서 랜덤값을 생성할 수 있다.
        // random() 메서드는 호출 시 0부터 0.9999... 사이의 랜덤 값을 발생 (0.0 <= 랜덤값 < 1.0)
        int random = (int) (Math.random() * 10 + 1);
        int sum = 0;

        for(int i = 1; i <= random; i++){
            sum += i;
        }

        System.out.printf("1부터 %d까지의 합: %d\n", random, sum);
    }

    // 구구단
    public void method03() {
        int result = 0;
        for(int dan = 2; dan < 10; dan++) {
            System.out.printf("============= %d단 출력 =============\n", dan);
            for(int row = 1; row < 10; row++) {
                result = dan * row;
                System.out.printf("%d X %d = %d\n", dan, row, result);
            }
        }
    }
}
