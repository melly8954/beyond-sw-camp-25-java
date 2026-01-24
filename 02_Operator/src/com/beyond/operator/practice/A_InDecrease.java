package com.beyond.operator.practice;

public class A_InDecrease {
     public void method01(){
         System.out.println("메서드 실행 테스트01");

         int number = 10;

         // 전위 연산
         System.out.println("전위 연산 적용 전: " + number);
         System.out.println("1회 수행 후 값 : " + ++number);
         System.out.println("2회 수행 후 값 : " + ++number);
         System.out.println("3회 수행 후 값 : " + ++number);
         System.out.println("전위 연산 적용 후: " + number);
         System.out.println();

         // 후위 연산
         System.out.println("후위 연산 적용 전: " + number);
         System.out.println("1회 수행 후 값 : " +  number--);
         System.out.println("2회 수행 후 값 : " +  number--);
         System.out.println("3회 수행 후 값 : " +  number--);
         System.out.println("후위 연산 적용 후: " + number);
         System.out.println();

         // 증감 연산자 실습ㅋ
         int number1 = 10;
         int number2 = 20;
         int number3 = 30;

         System.out.println(number1++); // 10
         System.out.println((++number1) + (number2++)); // 32
         System.out.println((number1++) + (--number2) + (--number3));  // 12 + 20 + 29

         System.out.println(number1); // 13
         System.out.println(number2); // 20
         System.out.println(number3); // 29
     }
}
