package com.beyond.control.practice;

import java.util.Scanner;

public class D_While {
    // 1부터 랜덤값(1 ~ 10)까지의 합계를 출력
    public void method01() {
        int random = (int) (Math.random() * 10 + 1);
        int sum = 0;

        int i = 1;

        while(i <= random) {
            sum += i;
            i++;
        }

        System.out.printf("1부터 %d까지의 합: %d\n", random, sum);
    }

    // 사용자에게 문자열을 입력받고 그 문자열을 출력한다.
    // 단, 사용자가 "exit" 문자열을 입력하면 프로그램을 종료한다.
    public void method02() {
        Scanner sc = new Scanner(System.in);
        String s = "";

//        while(true){
//            System.out.print("문자열을 입력하세요. >> ");
//            s = sc.nextLine();
//            System.out.println("입력한 문자열: " + s);
//            System.out.println();
//
//            if("exit".equals(s)){
//                System.out.println("반복 종료.");
//                break;
//            }
//        }

        while(!("exit".equals(s))){
            System.out.print("문자열을 입력하세요. >> ");
            s = sc.nextLine();
            System.out.println("입력한 문자열: " + s);
            System.out.println();
        }

        System.out.println("반복 종료.");
    }
}
