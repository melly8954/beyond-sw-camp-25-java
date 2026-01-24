package com.beyond.variable.practice;

public class A_Variable {
    /*
        변수의 선언
            자료형 변수명;

        변수의 초기화
            변수 = 값
     */
    public void variableTest(){
        // 논리형 변수
        boolean isTrue; // 1byte의 논리 값을 담을 수 있는 변수를 선언한다.

        // 정수형 변수
        byte bNum ; // 1byte의 정수를 담을 수 있는 변수를 선언한다.
        short sNum; // 2byte의 정수를 담을 수 있는 변수를 선언한다.
        int iNum;   // 4byte의 정수를 담을 수 있는 변수를 선언한다.
        long lNum;  // 8byte의 정수를 담을 수 있는 변수를 선언한다.

        // 실수형 변수
        float fNum; // 4byte의 실수를 담을 수 있는 변수를 선언한다.
        double dNum;    // 8byte의 실수를 담을 수 있는 변수를 선언한다.

        // 문자열
        char ch1 = 'A';    // 2byte의 문자(유니코드)를 담을 수 있는 변수를 선언한다.
        char ch2 = 65;
        // char ch3 = -65;  에러 발생: char 타입은 0 ~ 65,535 (유니코드)

        // 지역 변수를 선언 후 초기화가 되지 않은 경우에는 에러가 발생한다.
        // System.out.println(isTrue);
        isTrue = false;

        // 문자열
        // String name;    // 문자열을 가리킬 수 있는 참조 변수를 선언한다.
        // String name = "";   // 빈 문자열로 초기화
        // String name = new String("Hong");
        String name1 = "Hong";

        // 아무곳도 참조하지 않는다는 의미로 null로 초기화가 가능하다.
        String name2 = null;


        System.out.println(isTrue);
        System.out.println();

        // bNum = 128;  // 에러 발생: 1 byte는 -128 ~ 127
        bNum = 127;
        sNum = 32767;   // short 타입은 -32,768 ~ 32767
        iNum = 2147483647;  // int 타입은 -2,147,483,648 ~ 2,147,483,647

        // long 타입은 숫자 뒤에 1L 형태의 리터럴 입력이 필요함
        // long 타입은 -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
        lNum = 2147483648L;

        // float 타입은 리터럴 입력이 필요함 ex). xx.123F
        fNum = 3.141592F;
        dNum = 3.14159265358972;    // double 타입은 리터럴 입력이 필요하지 않음

        System.out.println(bNum);
        System.out.println(sNum);
        System.out.println(iNum);
        System.out.println(lNum);
        System.out.println(fNum);
        System.out.println(dNum);
        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(name1);
        System.out.println(name2);
        System.out.println();

        // final 변수
        // 초기화 이후에는 값을 변경할 수 없다.
        int age = 10;
        final int AGE = 20;

        System.out.println(age);
        System.out.println(AGE);
    }

    /*
        자동 형 변환
            - 데이터의 표현 범위가 작은 자료형을 큰 자료형으로 변환한다.
     */
    public void autoCasting(){
        byte bNum = 10;
        short sNum = 12;
        int iNum = sNum;    // short -> int 자동 형 변환
        long lNum = iNum;   // int -> long 자동 형 변환
        float fNum = lNum;  // long -> float 자동 형 변환
        double dNum = fNum; // float -> double 자동 형 변환
        // lNum = fNum; -> 형 변환 실패, 값의 범위가 잘못 처리됨


        System.out.println(bNum);
        System.out.println(sNum);
        System.out.println(iNum);
        System.out.println(lNum);
        System.out.println(fNum);
        System.out.println(dNum);
        System.out.println();

        char ch = 'A';
        iNum = ch;
        // ch = bNum; -> 형 변환 실패, char 타입은 음수 값을 가질 수 없다.
        // 즉, byte 타입은 char 타입으로 형 변환이 불가능하다.

        System.out.println(ch);
        System.out.println(iNum);
        System.out.println((char) iNum);
        System.out.println();

        double result1 = 12 + 3.3;

        // short result2 = bNum + sNum;
        // byte, short 타입의 연산은 int 타입으로 변환 후 진행된다.
        int result2 = bNum + sNum;

        // 30 + 30 = 60 -> 연산 후 60을 long 타입으로 자동 형 변환
        long result3 = 30 + 30;
        // 30L + 30L = 60L -> 연산 중 30을 long 타입 30L로 자동 형 변환
        long result4 = 30L + 30;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }

    /*
        강제 형 변환
            - 데이터의 표현 범위가 큰 자료형을 작은 자료형으로 변환한다.
     */
    public void forceCasting(){
        double dNum = 4.734567893456789;
        // float fNum = dNum;   // 자동 형 변환 되지 않음
        float fNum = (float) dNum;  // 강제 형 변환 사용
        int iNum = (int) fNum;

        System.out.println(dNum);
        System.out.println(fNum);
        System.out.println(iNum);
        System.out.println();

        System.out.println(290);
        System.out.println((byte) 290); // 290을 1바이트에 넣으려고 하면(오버플로우), 하위 8비트만 남게 되어 00100010 (34)
        System.out.println((byte) 990);
        System.out.println();

        System.out.println(iNum + dNum);    // 자동 형 변환
        System.out.println((int) iNum + dNum);    // 형 변환 주의할 점 (괄호 조심)
        System.out.println(iNum + (int) dNum);      // 강제 형 변환
        System.out.println((int) (iNum + dNum));    // 강제 형 변환
        System.out.println();
    }
}
