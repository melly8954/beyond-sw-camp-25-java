package com.beyond.control.practice;

public class E_Branch {
    // 1부터 랜덤값(1~10)까지의 합계를 반복문을 통해서 계속 출력한다.
    // 단, 랜덤값이 숫자 5가 나오면 프로그램을 종료한다.
    public void method01() {
        int sum;
        int random;

        while(true) {
            sum = 0;
            random = (int) (Math.random() * 10 + 1);

            if(random == 5) {
                break;
            }

            for(int i = 1; i <= random; i++) {
                sum += i;
            }

            System.out.printf("1부터 %d까지의 합계: %d\n", random, sum);
        }

        System.out.printf("랜덤값이 %d이므로 프로그램을 종료합니다.\n", random);
    }
    
    // 구구단 출력
    // 단, 홀수 단 제외하고 출력
    public void method02() {
        int result = 0;
        for(int dan = 2; dan < 10; dan++) {
            if(dan % 2 != 0) {
                continue;
            }
            System.out.printf("============= %d단 출력 =============\n", dan);

            for(int row = 1; row < 10; row++) {
                result = dan * row;
                System.out.printf("%d X %d = %d\n", dan, row, result);
            }
        }
    }
}
