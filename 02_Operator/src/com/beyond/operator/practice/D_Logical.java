package com.beyond.operator.practice;

import java.util.Scanner;

public class D_Logical {
    public void method01(){
        // 사용자가 입력한 정수값이 1부터 100 사이의 정수 값인지 확인
        Scanner sc = new Scanner(System.in);
        System.out.println("1~100 사이의 임의의 정수를 입력해 주세요. >> ");

        int number;
        boolean result;

        number = sc.nextInt();
        // 1 <= number <= 100
        result = number >= 1 && number <= 100;

        System.out.printf("%d는 1부터 100 사이의 정수 값 입니까? >> %b", number, result);
    }
    
    public void method02(){
        // 단락 회로 평가
        int number = 10;
        boolean result;

        System.out.println("&& 연산 전 number: " + number);
        // && 연산자를 기준으로 앞 연산에서 이미 false가 나왔기 때문에 이후의 연산을 수행하지 않는다.
        result = (number < 5) && (++number > 0);

        System.out.println("result: " + result);
        System.out.println("&& 연산 후 number: " + number);
        System.out.println();


        System.out.println("|| 연산 전 number: " + number);
        // || 연산자를 기준으로 앞 연산에서 이미 true가 나왔기 때문에 이후의 연산을 수행하지 않는다.
        result = (number < 20) || (++number > 0);

        System.out.println("result: " + result);
        System.out.println("|| 연산 후 number: " + number);

    }
}
