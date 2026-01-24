package com.beyond.variable.practice;

import java.util.Scanner;

public class C_ConsoleInput {
    public void keyBoardInput(){
        String name;
        int age;
        double height;
        char gender;

        // 자바는 콘솔(Console)에 데이터를 입력받을때, System.in을 사용한다.
        // Scanner 클래스 --> 사용자로부터 입력되는 정수, 실수, 문자열을 읽어오는 클래스
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter your name : ");
        name = sc.nextLine();

        System.out.print("Please enter your age: ");
        age = sc.nextInt();

        System.out.print("Please enter your height: ");
        height = sc.nextDouble();

        System.out.print("Please enter your gender(남/여): ");
        gender = sc.next().charAt(0);

        System.out.printf("당신의 이름은 %s 이고, 나이는 %d살 이며 키는 %.1fcm 입니다." +
                " 또한 성별은 %c자 입니다.\n", name, age, height, gender);
    }
}
