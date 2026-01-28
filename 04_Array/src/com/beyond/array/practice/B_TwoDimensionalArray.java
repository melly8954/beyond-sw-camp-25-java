package com.beyond.array.practice;

import java.util.Scanner;

public class B_TwoDimensionalArray {
    // 2차원 배열의 선언과 생성 및 초기화 (new 연산자 사용)
    public void method01() {
        // 1). 2차원 배열의 선언 및 생성
        int[][] iArray;
        iArray = new int[3][5];


        // 2). 2차원 배열 변수와 인덱스를 이용한 값 저장
        // 1  2  3  4  5
        // 6  7  8  9  10
        // 11 12 13 14 15
        int value = 1;

        System.out.println(iArray.length);      // 행의 개수
        System.out.println(iArray[0].length);
        System.out.println();

        for(int i = 0; i < iArray.length; i++) {
            for(int j = 0; j < iArray[i].length; j++) {
                iArray[i][j] = value++;
                System.out.printf("%2d ", iArray[i][j]);
            }
            System.out.println();
        }
    }

    // 2차원 배열의 선언과 생성 및 초기화 (값의 목록 사용)
    public void method02() {
        String[][] sArray = new String[][] {
                {"Linux", "MariaDB"},
                {"Java", "Spring", "VueJS"}
        };

        for(int i = 0; i < sArray.length; i++) {
            for(int j = 0; j < sArray[i].length; j++) {
                System.out.printf("%s\t", sArray[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        // 가변 개별
        String[][] test_arr = new String[3][];

        test_arr[0] = new String[] {"Linux"};
        test_arr[1] = new String[] {"MariaDB", "Java"};
        test_arr[2] = new String[] {"HTML5", "CSS3", "VueJs"};

        for(int i = 0; i < test_arr.length; i++) {
            for(int j = 0; j < test_arr[i].length; j++) {
                System.out.printf("%s\t", test_arr[i][j]);
            }
            System.out.println();
        }
    }


    /*
     * 실습 문제 1
     *
     * 1부터 10사이의 랜덤값을 3행 3열의 2차원 배열에 대입하시오.
     *
     * 예시)
     * 1 8 9
     * 8 3 3
     * 4 1 7
     */
    public void practice1(){
        int[][] numbers = new int[3][3];

        for(int i = 0; i < numbers.length; i++) {
            for(int j = 0; j < numbers[0].length; j++) {
                int random = (int) (Math.random() * 9 + 1);
                numbers[i][j] = random;
                System.out.printf("%d\t", numbers[i][j]);
            }
            System.out.println();
        }
    }

    /*
     * 실습 문제 2
     *
     * 1부터 10사이의 랜덤값을 3행 3열의 2차원 배열에 대입하시오.
     * 단, 랜덤 값에 중복을 제거해서 대입하시오.
     *
     * 예시)
     * 1 8 9
     * 6 4 5
     * 2 7 3
     */
    public void practice2() {
        int index = 0;
        int[] temp = new int[9];
        int[][] numbers = new int[3][3];

        for(int i = 0; i < temp.length; i++) {
            int random = (int) (Math.random() * 9 + 1);
            temp[i] = random;
            for(int j = 0; j < i; j++) {
                if(temp[i] == temp[j]) {
                    // 해당 i값에서 중복이 발생했으므로 i값 -1 감소 후 다시 랜덤 부여
                    i--;
                    break;
                }
            }
        }

        for(int i = 0; i < numbers.length; i++) {
            for(int j = 0; j < numbers[0].length; j++) {
                numbers[i][j] = temp[index++];
                System.out.printf("%d\t", numbers[i][j]);
            }
            System.out.println();
        }
    }
}
