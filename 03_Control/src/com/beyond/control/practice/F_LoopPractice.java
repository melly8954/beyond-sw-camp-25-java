package com.beyond.control.practice;

import java.util.Scanner;

public class F_LoopPractice {
    Scanner sc = new Scanner(System.in);

    /*
     * 실습 문제 1
     * 1부터 사용자가 입력한 수까지의 합계를 구하시오.
     *
     * 예시)
     * 정수 > 10
     *
     * 총 합계 : 55
     */
    public void practice1() {
        System.out.print("1보다 큰 정수 하나를 입력하세요. >> ");
        int num = sc.nextInt();
        System.out.println("입력한 정수: " + num);
        System.out.println();

        int i = 1;
        int sum = 0;

        while(i <= num) {
            sum += i;
            i++;
        }

        System.out.printf("총 합계: %d\n", sum);
    }

    /*
     * 실습 문제 2
     * 사용자가 입력한 단을 출력하시오.
     *
     * 예시 1)
     *    단 수(2 ~ 9)를 입력해 주세요. > 3
     *    3 X 1 = 3
     *    ...
     *    3 X 9 = 27
     *
     * 예시 2)
     *    단 수(2 ~ 9)를 입력해 주세요. > 12
     *    2 ~ 9 사이의 양수를 입력하여야 합니다.
     */

    public void practice2() {
        System.out.print("구구단의 단을 입력해주세요. >> ");
        int dan = sc.nextInt();

        System.out.println("입력한 단: "+ dan);
        System.out.println();

        if(dan > 2 && dan < 10) {
            for(int i = 1; i < 10; i++) {
                System.out.printf("%d X %d = %d\n", dan, i, dan * i);
            }
        } else {
            System.out.println("2 ~ 9 사이의 정수를 입력하여야 합니다.");
        }
    }

    /*
     * 실습 문제 3
     * 사용자가 "안녕하세요."라고 입력을 하면 아래와 같이 출력 되도록 코드를 작성하라.
     * '안'
     * '녕'
     * '하'
     * '세'
     * '요'
     * '.'
     */
    public void practice3() {
        System.out.print("문자열을 입력해주세요. >> ");
        String str = sc.next();

        System.out.println("입력한 문자열: " + str);
        System.out.println();

        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            System.out.println("\'"+ c + "\'");
        }
    }

    /*
     * 실습 문제 4
     * 아래와 같이 출력 되도록 중첩 for 문을 작성하시오.
     *
     * 예시)
     *   1***
     *   *2**
     *   **3*
     *   ***4
     */
    public void practice4() {
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                if (i == j) {
                    System.out.print(i + 1);
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    /*
     * 실습 문제 5
     * 아래와 같이 출력 되도록 중첩 for 문을 작성하시오.
     *
     * 예시)
     *   *
     *   **
     *   ***
     *   ****
     *   *****
     */
    public void practice5() {
        for(int i = 0; i < 5; i++) {
            System.out.print("*");
            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
     * 실습 문제 6
     *
     * 반복적으로 두 정수를 입력받고 연산자 기호(+, -, *, /)를 입력 받아서 계산을 출력하라
     * 단, 연산자 기호를 잘못 입력하는 경우 "연산자를 잘못 입력하셨습니다." 출력하고 프로그램을 종료한다.
     *
     * 예시)
     *   첫 번째 수 > 3
     *   두 번째 수 > 4
     *   연산자 입력(+, -, *, /) > +
     *
     *   3 + 4 = 7
     *
     *   첫 번째 수 > 3
     *   두 번째 수 > 4
     *   연산자 입력(+, -, *, /) > a
     *
     *   연산자를 잘못 입력하셨습니다.
     */
    public void practice6() {
        while(true) {
            System.out.print("첫 번째 정수를 입력하세요. >> ");
            int num1 = sc.nextInt();
            System.out.println("첫 번째 입력한 정수:" + num1);
            System.out.println();

            System.out.print("두 번째 정수를 입력하세요. >> ");
            int num2 = sc.nextInt();
            System.out.println("두 번째 입력한 정수:" + num2);
            System.out.println();

            System.out.print("연산자를 입력하세요. >> ");
            char op = sc.next().charAt(0);
            System.out.println("입력한 연산자: " + op);
            System.out.println();

            int sum = 0;

            if(op == '+') {
                sum = num1 + num2;
            } else if(op == '-') {
                sum = num1 - num2;
            } else if(op == '*') {
                sum = num1 * num2;
            } else if(op == '/') {
                sum = num1 / num2;
            } else {
                System.out.println("연산자를 잘못 입력하셨습니다.\n프로그램을 종료합니다.");
                break;
            }

            System.out.printf("%d %c %d = %d\n", num1, op, num2, sum);
        }
    }

    public void close() {
        System.out.println("Scanner 종료 완료.");
        sc.close();
    }
}