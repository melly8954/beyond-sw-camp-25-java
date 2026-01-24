package com.beyond.operator.practice;

import java.util.Scanner;

public class F_Triple {
    public void method01(){
        // 사용자에게 입력받은 정수가 짝수인지 홀수인지
        Scanner sc = new Scanner(System.in);
        System.out.println("임의의 정수를 입력해 주세요. >> ");

        int number = sc.nextInt();
        String result = number > 0 ? "양수입니다." : number == 0 ? "0입니다." : "음수입니다.";

        System.out.printf("%d은 %s\n", number, result);
    }
}
