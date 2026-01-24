package com.beyond.variable.practice;

public class B_ConsoleOutput {
    public void valuePrint(){
        // 자바는 콘솔(Console)에 데이터를 출력할 때 System.out을 사용한다.
        // 1. System.out.print() 메서드
        System.out.print("Hello\n");
        System.out.print("12345\n");
        System.out.print("!@#$%\n");
        System.out.print(true);
        System.out.println();

        // 2. System.out.println() 메서드
        System.out.println("Hello");
        System.out.println("12345");
        System.out.println("!@#$%");
        System.out.println(true);
        System.out.println();

        // 3. System.out.printf() 메서드
        // 서식 지정자
        // %d: 정수형, %f: 실수형, $b: 논리형, $c: 문자형, %s: 문자열형,
        System.out.printf("%d\n", 10);
        System.out.printf("%d + %d = %d\n", 100, 200, (100+200));;
        System.out.println();

        // 이스케이프 문자
        // \n: 줄바꿈, \t: 수평 탭, \": 큰 따옴표, \' 작은 따옴표
        System.out.printf("%f\t%f\n", 3.141592, 4.1234123412);
        System.out.printf("%.2f\t%.3f\n", 3.141592, 4.1234123412);
        System.out.printf("%b %c %s\n", 2>1, 'A', "\"hi\"");
        System.out.println();

        // 자바는 콘솔(Console)에 에러를 출력할 때 System.err을 사용한다.
        System.err.println("Error 발생 \n");
        System.err.printf("%s", "시스템 에러 확인");
    }
}
