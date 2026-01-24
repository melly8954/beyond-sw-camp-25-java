package com.beyond.operator.practice;

import java.util.Scanner;

public class C_Comparison {
    public void method01(){
        // 비교 연산
        int num1 = 10;
        int num2 = 25;

        boolean result1, result2, result3, res1, res2, res3;

        result1 = (num1 == num2);
        result2 = (num1 != num2);
        result3 = (num1 <= num2);

        res1 = ('A' == 65);
        res2 = (3 == 3.0);
        res3 = (0.1 == 0.1f);   // 부동 소수점 방식은 오차가 발생할 수 있음 --> 비교 연산 시 실수 타입 사용을 지양

        System.out.println("result1 : " + result1);
        System.out.println("result2 : " + result2);
        System.out.println("result3 : " + result3);
        System.out.println();
        System.out.println("res1 : " + res1);
        System.out.println("res2 : " + res2);
        System.out.println("res3 : " + res3);
    }

    public void method02(){
        /*
            산술 연산 + 비교 연산
                - 사용자에게 입력받은 값이 짝수인지. 홀수인지 판단하기
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("임의의 정수를 입력해 주세요. >> ");


        int number = sc.nextInt();
        boolean result = (number % 2 == 0);
        System.out.printf("%d는 짝수인가? >> %b\n", number, result);

        // System.out.println((number % 2) == 0 ? "짝수" : "홀수");


    }
}
