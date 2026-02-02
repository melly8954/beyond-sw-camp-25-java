package com.beyond.exception.practice;

import java.util.Scanner;

public class C_RunTimeException {
    public void method01() {
        Scanner sc = new Scanner(System.in);
        int[] numbers;

        System.out.print("배열 길이 입력 > ");
        int size = sc.nextInt();

        // NegativeArraySizeException 해결
        if(size < 0 ) {
            System.out.println("0보다 큰 값을 입력하세요");
            return;
        }

        numbers = new int[size];

        for(int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();
    }
}
