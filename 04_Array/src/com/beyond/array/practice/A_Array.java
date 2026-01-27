package com.beyond.array.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class A_Array {
    // 배열의 선언과 생성 및 초기화 (new 연산자 사용)
    public void method01() {
        // 1). 배열의 선언 및 생성
        // Heap 메모리에 배열을 생성하기 위해서 크기를 지정해야 한다.
        int[] iArray1 =  new int[5];

        int[] iArray2;
        iArray2 = new int[10];


        // 2). 배열 변수와 인덱스를 이용한 값 저장
        // 배열의 데이터 타입과 값의 데이터 타입은 일치해야 한다.
        iArray1[0] = 101;
        iArray1[1] = 102;
        iArray1[2] = 103;
        iArray1[3] = 104;
        iArray1[4] = 105;
        // iArray1[5] = 106;        // ArrayIndexOutOfBoundsException 발생


        // 3). 배열 변수와 인덱스를 이용한 값 출력
        System.out.println(iArray1[0]);
        System.out.println(iArray1[1]);
        System.out.println(iArray1[2]);
        System.out.println(iArray1[3]);
        System.out.println(iArray1[4]);
        System.out.println();
        // System.out.println(iArray1[5]);     // ArrayIndexOutOfBoundsException 발생


        // 4). 반복문을 이용한 출력
        // 배열의 이름.length 속성을 통해서 배열의 길이를 알 수 있다.
        System.out.println(iArray1.length);     // 5
        System.out.println(iArray2.length);     // 10
        System.out.println();

        for (int i = 0; i < iArray1.length; i++) {
            System.out.println(iArray1[i]);
        }
        System.out.println();

        // 향상된 for문 (foreach)
        for (int value : iArray1) {
            System.out.println(value);
        }
        System.out.println();


        // 5). Arrays 유틸리티 클래스의 toString() 메서드를 활용하여 배열 출력
        System.out.println(Arrays.toString(iArray1));

        // 아직 초기화 하지 않은 배열은 JVM이 지정한 데이터 타입의 기본값으로 초기화 된다.
        // 정수형: 0, 실수형: 0.0, 문자형: '\u0000', 논리형: false, 참조형: null
        System.out.println(Arrays.toString(iArray2));
    }

    // 배열의 선언과 생성 및 초기화 (값의 목록 사용)
    public void method02() {
        int[] iArray = new int[] {101, 102, 103, 104, 105};
        double[] dArray = {1.1, 2.2, 3.3, 4.4, 5.5};

        System.out.println(iArray.length);
        System.out.println(Arrays.toString(iArray));
        System.out.println();

        System.out.println(dArray.length);
        System.out.println(Arrays.toString(dArray));
        System.out.println();

        // 배열 선언 후 값을 사용한 초기화 시 new 연산자를 사용해야 한다.
        int[] test;
        // test = int[] {1, 2, 3, 4, 5};     // 에러 발생
        test = new int[] {1, 2, 3, 4, 5};

        // 기존의 dArray 배열을 수정하는 것이 아닌 new 연산자로 새로 생성
        // 즉, Heap 영역에 새로 생성되어 Stack 영역의 dArray가 참조하는 주소를 변경함
        dArray = new double[] {6.6, 7.7, 8.8};
    }

    // 문자열 배열
    // 사용자로부터 과일 이름을 입력받아서 배열에 저장. 출력
    public void method03() {
        String[] fruit = new String[3];

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < fruit.length; i++) {
            System.out.print("과일을 입력해주세요. >> ");

            fruit[i] = sc.next();
        }

        System.out.println();
        System.out.println(Arrays.toString(fruit));
    }

    // 배열의 정렬
    public void method04() {
        int[] iArray = {2, 7, 5, 1, 3};
        String[] sArray = {"멜론", "orange", "Apple", "banana", "apple", "레몬", "apeach"};

        System.out.println(Arrays.toString(iArray));
        System.out.println(Arrays.toString(sArray));
        System.out.println();

        // 오름차순 정렬
        Arrays.sort(iArray);
        Arrays.sort(sArray);

        System.out.println(Arrays.toString(iArray));
        System.out.println(Arrays.toString(sArray));
        System.out.println();

        // 내림차순 정렬
        // 첫 번째 방법: 기본 타입의 배열은 원본 배열을 오름차순으로 정렬한 다음 값을 반대로 새로운 배열에 대입한다.
        int[] copy = new int[iArray.length];

        for(int i = 0; i < iArray.length; i++) {
            copy[4-i] = iArray[i];
        }

        System.out.println(Arrays.toString(iArray));
        System.out.println(Arrays.toString(copy));
        System.out.println();

        // 두 번째 방법: 문자열의 배열은 Array.sort() 메서드에 Collections.reverseOrder()를 전달한다.
        Arrays.sort(sArray, Collections.reverseOrder());

        System.out.println(Arrays.toString(sArray));
        System.out.println();

        // 참고
        // Wrapper 클래스는 기본 타입과는 다르게 작동한다.
        Integer[] integers = {2, 7, 5, 1, 3};

        Arrays.sort(integers);
        System.out.println(Arrays.toString(integers));

        Arrays.sort(integers, Collections.reverseOrder());
        System.out.println(Arrays.toString(integers));
        System.out.println();
    }


    // 배열 실습 문제
    /*
     * 실습 문제 1
     * 사용자가 입력하는 정수값으로 배열의 길이를 지정하여 배열을 생성하고
     * 생성된 배열의 크기만큼 반복문을 실행하여 랜덤값을(1 ~ 100) 배열의 저장하고 출력한다.
     *
     * 예시)
     * 정수값을 입력해 주세요. > 3
     *
     * numbers[0] : 77
     * numbers[1] : 88
     * numbers[2] : 6
     */
    public void practice1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("0보다 큰 정수 입력. >> ");
        int num = sc.nextInt();

        int[] arr = new int[num];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100 + 1);
            System.out.println(arr[i]);
        }

        System.out.println(Arrays.toString(arr));
    }

    /*
     * 실습 문제 2
     *
     * 사용자에게 3명의 키를 입력받아 배열에 저장하고
     * 반복문을 통해 3명의 키의 총합, 평균값을 구하시오.
     *
     * 예시)
     * 키 입력 > 180.0
     * 키 입력 > 177.3
     * 키 입력 > 168.2
     *
     * 총합 : 525.5
     * 평균 : 175.2
     */
    public void practice2() {
        Scanner sc = new Scanner(System.in);

        double[] heights = new double[3];
        double sum = 0;
        double avg = 0;

        for(int i = 0; i < heights.length; i++) {
            System.out.printf("%d 번째 키 입력. >> \n", i+1);
            heights[i] = sc.nextDouble();
        }

        // sum = Arrays.stream(heights).sum()
        for(double h : heights) {
            sum += h;
        }
        
        avg = sum / heights.length;

        System.out.printf("총 합: %.1f\n평균: %.1f\n", sum, avg);
    }
}
