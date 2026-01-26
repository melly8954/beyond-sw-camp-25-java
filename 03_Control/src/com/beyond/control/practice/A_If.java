package com.beyond.control.practice;

import java.util.Scanner;

public class A_If {
    Scanner sc = new Scanner(System.in);

    // 사용자에게 입력받은 정수값이 홀수인지 짝수인지 판별
    public void method01(){
        System.out.print("0 보다 큰 정수값을 입력하세요. >>");
        int num = sc.nextInt();

        System.out.printf("입력한 정수: %d\n", num);
        System.out.println();

        if(num % 2 == 0){
            System.out.printf("%d는(은) 짝수이다.\n", num);
        } else if(num % 2 == 1){
            System.out.printf("%d는(은) 홀수이다.\n", num);
        } else {
            System.out.println("정수를 다시 입력하세요.");
        }
    }

    // 사용자에게 이름을 입력받아서 이름이 "홍길동" 인지 확인하기
    public void method02(){
        System.out.print("이름을 입력해주세요. >> ");
        String name = sc.nextLine();

        System.out.printf("입력한 이름: %s\n", name);
        System.out.println();
        
        // 문자열 비교 접근
//        System.out.println("홍길동" == "홍길동");     // true
//        System.out.println("홍길동" == new String("홍길동"));     // false
//        System.out.println("홍길동" == name);      // false
//        System.out.println();

        // 잘못된 문자열 비교
//        if(name == "홍길동"){
//            System.out.println("입력받은 이름은 \"홍길동\"이 맞습니다.");
//        } else{
//            System.out.println("입력받은 이름은 \"홍길동\"이 아닙니다.\n다시 입력해주세요.");
//        }

        // 정상적인 문자열 비교
        System.out.println("홍길동".equals("홍길동"));     // true
        System.out.println("홍길동".equals(new String("홍길동")));     // true
        System.out.println("홍길동".equals(name));      // true
        System.out.println();

        if(name.equals("홍길동")){
            System.out.println("입력받은 이름은 \"홍길동\"이 맞습니다.");
        } else{
            System.out.println("입력받은 이름은 \"홍길동\"이 아닙니다.\n다시 입력해주세요.");
        }

        // name 변수가 null을 가질 경우 -> NullPointerException
//        name = null;
//        System.out.println(name.equals("홍길동"));

        // 순서를 바꿔서 하자
        System.out.println("홍길동".equals(name));

    }

    // 사용자에게 알파벳 하나를 입력받아서 대/소문자 확인하기
    public void method03(){
        System.out.print("알파벳 하나를 입력해주세요. >> ");
        char alphabet = sc.next().charAt(0);

        System.out.println("입력받은 알파벳: " + alphabet);
        System.out.println();

        if(alphabet >= 'A'&& alphabet <= 'Z'){
            System.out.printf("입력하신 알파벳 \'%c\'는(은) 대문자입니다.\n", alphabet);
        } else if (alphabet >= 'a'&& alphabet <= 'z'){
            System.out.printf("입력하신 알파벳 \'%c\'는(은) 소문자입니다.\n", alphabet);
        } else{
            System.out.println("입력하신 내용은 알파벳이 아닙니다.\n다시 입력해주세요.");
        }
    }

    /*
     * 실습 문제
     * 사용자에게 점수(0 ~ 100)를 입력받아서 점수별로 등급을 출력하라
     *   - 90점 이상은 A 등급
     *   - 90점 미만 80점 이상은 B 등급
     *   - 80점 미만 70점 이상은 C 등급
     *   - 70점 미만 60점 이상은 D 등급
     *   - 60점 미만 F 등급
     *
     *  예시)
     *    점수 > 90
     *    당신의 점수는 90점이고 등급은 A입니다.
     */
    public void practice() {
        System.out.print("당신의 점수를 입력해주세요. >> ");
        int score = sc.nextInt();

        System.out.println("입력받은 점수: " + score);
        System.out.println();

        if(score > 100 || score < 0){
            System.out.println("등급에에 적합하지 않은 점수 기준입니다.\n점수를 다시 입력하세요.");
        } else {
            if(score >= 90){
                System.out.printf("당신의 점수는 \'%d\'점이고 등급은 \'A\'입니다.\n", score);
            } else if(score >= 80){
                System.out.printf("당신의 점수는 \'%d\'점이고 등급은 \'B\'입니다.\n", score);
            } else if(score >= 70){
                System.out.printf("당신의 점수는 \'%d\'점이고 등급은 \'C\'입니다.\n", score);
            } else if(score >= 60){
                System.out.printf("당신의 점수는 \'%d\'점이고 등급은 \'D\'입니다.\n", score);
            } else {
                System.out.printf("당신의 점수는 \'%d\'점이고 등급은 \'F\'입니다.\n", score);
            }
        }
    }

    // Scanner 닫기 메서드
    public void close(){
        System.out.println("Scanner 종료 완료.");
        sc.close();
    }
}
