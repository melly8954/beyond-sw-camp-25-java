package com.beyond.operator.practice;

import java.util.Scanner;

public class G_OperatorPractice {
    Scanner sc = new Scanner(System.in);

    /*
     * 실습 문제 1
     * 사용자가 입력한 문자 값이 알파벳 대문자인지 확인하기
     * 'A' ~ 'Z'까지 코드값으로 65 ~ 90까지의 숫자로 나열되어 있다.
     *
     * 예시)
     * 문자 하나 입력 > f
     * 사용자가 입력한 값이 대문자입니까? : false
     */
    public void practice1() {
        System.out.println("문자를 하나 입력하세요.");
        char c = sc.next().charAt(0);

        System.out.println(c >= 65 && c <= 90 ? "대문자입니다." : "소문자입니다.");
    }

    /*
     * 실습 문제 2
     *
     * 사용자한테 두 개의 정수값을 입력받아서
     * 두 정수의 곱셈 결과 100보다 큰 경우 "결과가 100 이상입니다."
     * 아닌 경우 "결과가 100 보다 작습니다." 출력
     */
    public void practice2() {
        System.out.println("첫 번째 정수를 입력하세요.");
        int num1 = sc.nextInt();
        System.out.println("첫 번째 입력한 정수:" + num1);
        System.out.println();

        System.out.println("두 번째 정수를 입력하세요.");
        int num2 = sc.nextInt();
        System.out.println("두 번째 입력한 정수:" + num2);
        System.out.println();

        int result = num1 * num2;
        System.out.println("두 정수의 곱셈 결과: " + result);
        System.out.println();
        System.out.println(result >= 100? "결과가 100 이상입니다." : "결과가 100 보다 작습니다.");
    }

    /*
     * 실습 문제 3
     *
     * 사용자한테 문자를 하나 입력받아서
     * 입력한 문자가 대문자이면 "알파벳 대문자이다."
     * 아닌 경우 "알파벳 대문자가 아니다." 출력
     */
    public void practice3() {
        System.out.println("문자 하나를 입력하세요.");
        char c = sc.next().charAt(0);
        System.out.println("입력한 문자 : " + c);
        System.out.println();
        System.out.println(c >= 65 && c<=90 ? "알파벳 대문자이다." : "알파벳 대문자가 아니다.");
    }

    /*
     * 실습 문제 4
     *
     * 두 정수를 입력받고 + 또는 - 를 입력받아서 계산을 출력하라
     * 단, + 또는 - 외의 문자를 입력하는 경우 "잘못 입력했습니다." 출력
     *
     * 예시)
     *   첫 번째 수 > 3
     *   두 번째 수 > 4
     *   연산자 입력(+ 또는 -) > +
     *
     *   3 + 4 = 7
     */
    public void practice4() {
        System.out.println("첫 번째 정수를 입력하세요.");
        int num1 = sc.nextInt();
        System.out.println("첫 번째 입력한 정수:" + num1);
        System.out.println();

        System.out.println("두 번째 정수를 입력하세요.");
        int num2 = sc.nextInt();
        System.out.println("두 번째 입력한 정수:" + num2);
        System.out.println();

        System.out.println("연산자를 입력하세요.");
        String op = sc.next();
        System.out.println("입력한 연산자: " + op);
        System.out.println();

        System.out.println(op.equals("+") ? "결과: " + (num1 + num2) : op.equals("-") ? "결과: " + (num1 - num2) : "연산자를 잘못 입력 했습니다.");
    }

    /*
     * 실습 문제 5
     *
     * 키보드로 입력받은 하나의 정수가 짝수이면 "짝수이다."
     * 짝수가 아니면 "홀수이다"를 출력하세요.
     */
    public void practice5() {
        System.out.println("정수를 입력하세요.");

        int num = sc.nextInt();
        System.out.println("입력한 정수: " + num);
        System.out.println();

        System.out.println(num % 2 == 0 ? "입력한 정수는 짝수이다." : "입력한 정수는 홀수이다.");
    }

    /*
     * 실습 문제 6
     * 모든 사람이 사탕을 골고루 나눠가지려고 한다.
     * 인원 수와 사탕 개수를 키보드로 입력받고 1인당 동일하게 나눠가진
     * 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요.
     */
    public void practice6() {
        System.out.println("사탕 개수를 입력하세요.");
        int candy = sc.nextInt();
        System.out.println("사탕 수: " + candy);
        System.out.println();

        System.out.println("사람 인원 수를 입력하세요.");
        int people = sc.nextInt();
        System.out.println("인원 수: " + people);
        System.out.println();

        System.out.printf("동일하게 나눠가진 사탕의 개수는 %d개고 남은 사탕의 개수는 %d개이다.\n", candy / people, candy % people);
    }

    /*
     * 실습 문제 7
     * 국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력받고
     * 세 과목에 대한 합계(국어 + 영어 + 수학)와 평균(합계 / 3.0)을 구하세요.
     */
    public void practice7() {
        System.out.println("국어 점수를 입력하세요.");
        int kor = sc.nextInt();
        System.out.println("입력한 국어 점수: " + kor);
        System.out.println();

        System.out.println("영어 점수를 입력하세요.");
        int eng = sc.nextInt();
        System.out.println("입력한 영어 점수: " + eng);
        System.out.println();

        System.out.println("수학 점수를 입력하세요.");
        int math = sc.nextInt();
        System.out.println("입력한 수학 점수: " + math);
        System.out.println();

        int sum = kor + eng + math;
        double avg = (double) sum / (double) 3;

        System.out.printf("세 과목에 대한 합계는 %d, 평균은 %.1f 이다.\n", sum, avg);
    }

    /*
     * 실습 문제 8
     * 주민 번호를 입력받아 남자인지 여자인지 구분하여 출력하세요.
     */
    public void practice8() {
        System.out.println("주민 번호를 입력하세요.");
        String jumin = sc.next();
        System.out.println("입력한 주민 번호: " + jumin);
        System.out.println();

        System.out.println(jumin.charAt(7) == '1' || jumin.charAt(7) == '3' ? "해당 주민번호는 남자의 주민번호이다." : "해당 주민번호는 여자의 주민번호이다.");
    }

    /*
     * 실습 문제 9
     * 3개의 정수를 키보드로 입력받아
     * 입력받은 정수가 모두 같으면 true, 아니면 false를 출력하세요
     */
    public void practice9() {
        System.out.println("첫 번째 정수를 입력하세요.");
        int num1 = sc.nextInt();
        System.out.println("첫 번째 입력한 정수:" + num1);
        System.out.println();

        System.out.println("두 번째 정수를 입력하세요.");
        int num2 = sc.nextInt();
        System.out.println("두 번째 입력한 정수:" + num2);
        System.out.println();

        System.out.println("세 번째 정수를 입력하세요.");
        int num3 = sc.nextInt();
        System.out.println("세 번째 입력한 정수:" + num3);

        boolean eq = (num1 == num2) && (num2 == num3);
        System.out.println();

        boolean res = eq ? true : false;

        System.out.println("결과: " + res);
    }

    // Scanner 닫기 메서드
    public void close() {
        System.out.println("Scanner 종료 완료.");
        sc.close();
    }
}
