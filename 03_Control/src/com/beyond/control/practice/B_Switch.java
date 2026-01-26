package com.beyond.control.practice;

import java.util.Scanner;

public class B_Switch {
    Scanner sc = new Scanner(System.in);

    // 사용자로부터 과일 이름을 입력받고 과일의 가격을 출력하기
    public void method01() {
        System.out.print("과일 이름을 입력해주세요. >> ");
        String fruit = sc.nextLine();

        System.out.println("입력하신 과일 이름: "+ fruit);
        System.out.println();
        int price = 0;

        switch (fruit) {
            case "포도" : price = 8000; break;
            case "사과" : price = 9000; break;
            case "딸기" : price = 10000; break;
            default:
                System.out.println("해당 과일은 판매하지 않는 과일입니다.");
                return;
        }

        System.out.printf("입력한 과일은 \'%s\'이며 가격은 \'%d\'원입니다.\n", fruit, price);
    }

    // 1월부터 12월까지 입력받아서 해당하는 달의 마지막 날짜를 출력하기
    // 31일까지 출력하는 월: 1, 3, 5, 7, 8, 10, 12
    // 30일까지 출력하는 월: 4, 6, 9, 11
    // 28일 또는 29일까지 존재하는 월: 2
    public void method02() {
        System.out.print("1월부터 12월까지 중 하나를 입력하세요. >> ");
        int month = sc.nextInt();

        System.out.println("입력한 월: " + month);
        System.out.println();

        if(!(month >= 1 && month <= 12)) {
            System.out.println("1월부터 12월 중 하나를 입력하셔야 합니다.\n다시 입력하세요.");
            return;
        }

        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.printf("%d월은 31일까지입니다.\n", month);
                break;
            case 4, 6, 9, 11:
                System.out.printf("%d월은 30일까지입니다.\n", month);
                break;
            case 2:
                System.out.printf("%d월은 28일 또는 29일까지입니다.\n", month);
        }
    }

    public void close() {
        System.out.println("Scanner 종료 완료.");
        sc.close();
    }
}
