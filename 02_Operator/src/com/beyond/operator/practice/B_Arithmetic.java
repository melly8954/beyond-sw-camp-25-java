package com.beyond.operator.practice;

public class B_Arithmetic {
    public void method01(){
        // 정수의 산술 연산
        int num1 = 10;
        int num2 = 3;

        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println(num1 % num2);
        System.out.println();

        // 실수의 산술 연산
        double num3 = 35.0;
        double num4 = 10.0;

        System.out.println(num3 + num4);
        System.out.println(num3 - num4);
        System.out.println(num3 * num4);
        System.out.println(num3 / num4);
        System.out.println(num3 % num4);
        System.out.println();

        // 문자의 살술 연산
        char ch = '홍';

        System.out.println(ch + 1);
        System.out.println((char) (ch + 1));
        System.out.println();


        // 참고
        // System.out.println(5 / 0);  // ArithmeticException
        // System.out.println(5 % 0);  // ArithmeticException
        System.out.println(5 / 0.0);    // Infinity
        System.out.println(5 % 0.0);    // NaN (Not a Number)

        System.out.println(Double.isInfinite(5 / 0.0));
        System.out.println(Double.isNaN(5 % 0.0));
    }
}
