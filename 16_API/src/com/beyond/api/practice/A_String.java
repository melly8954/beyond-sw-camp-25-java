package com.beyond.api.practice;

import java.util.Arrays;
import java.util.StringTokenizer;

/*
    String 클래스
        - 불변의 클래스이다. (문자열을 생성하면 변경할 수 없다.)
        - 변경이 적고 읽기가 많은 경우에 사용하는 것이 좋다.

    StringBuffer & StringBuilder 클래스
        - 가변의 클래스이다. (문자열을 생성하면 변경할 수 있다.)
        - 16개의 문자를 저장할 수 있는 버퍼가 미리 생성되고 문자가 저장됨에 따라 자동으로 증가한다.
        - 내부 버퍼에 문자열을 저장해 두고 그 안에서 추가, 수정, 삭제 작업을 할 수 있도록 설계되어 있다.
        - 문자열의 변경이 많은 경우에 사용하는 것이 좋다.
        - StringBuffer & StringBuilder 의 차이점은 동기화에 있다.
            - StringBuffer는 멀티 스레드 환경에서 사용을 권장한다.
            - StringBuilder는 단일 스레드 환경에서 사용을 권장한다.

    StringTokenizer 클래스
        - 생성자로 전달받은 문자열을 구분자를 이용해서 분리한다.
        - 분리된 최소 단위를 토큰이라고 한다.
*/
public class A_String {
    // String 클래스가 제공하는 메서드 사용
    public void method01() {
        String str = "Hello World";

        // 1. concat(str) 메서드
        // 전달받은 문자열과 원본 문자열을 하나로 합친 "새로운 문자열"로 리턴한다.
        // 원본은 영향을 받지 않음
        String concat = str.concat("!!!");

        System.out.println(str);    // Hello World
        System.out.println(concat); // Hello World!!!

        System.out.println(str == concat);  // false
        System.out.println(System.identityHashCode(str));   // 793589513
        System.out.println(System.identityHashCode(concat));    // 1313922862
        System.out.println();

        /*
            2-1. substring(beginIndex) 메서드는 매개값으로 전달된 위치에서부터 마지막 위치까지
                 문자열을 "새로 생성"해서 리턴한다.

            2-2. substring(beginIndex, endIndex) 메서드는 매개값의 beginIndex 위치부터 endIndex - 1 위치까지
                 문자열을 "새로 생성"해서 리턴한다.
         */
        String substring01 = str.substring(6);
        String substring02 = str.substring(2, 6);

        System.out.println(substring01);    // World
        System.out.println(substring02);    // llo
        System.out.println(str);        // Hello World
        System.out.println();


        /*
            3-1. indexOf(str) 메서드는 전달받은 문자열의 시작 인덱스를 리턴한다.
            3-2. indexOf(ch)
         */
        int index1 = str.indexOf("World");
        System.out.println(index1);  // 6

        // 주어진 문자열이 포함되어 있지 않은 경우 -1을 리턴
        int index2 = str.indexOf("World", 7);
        System.out.println(index2);  // -1

        int index3 = str.indexOf('l');
        System.out.println(index3); // 2

        int index4 = str.indexOf('l', 6);
        System.out.println(index4); // 9

        int index5 = str.lastIndexOf('o');
        System.out.println(index5); // 7
        System.out.println();

        /*
            4-1. replace(oldChar, newChar) 메서드는 문자열에서
                 oldChar가 newChar로 변경된 문자열을 새로 생성해서 리턴한다.
            4-2. replace(target, replacement) 메서드는 문자열에서
                 target이 replacement로 변경된 문자열을 새로 생성해서 리턴한다.
            4-3. replaceAll() -> 이건 내가 나중에 찾기
         */
        String replace1 = str.replace('l', 'c');
        String replace2 = str.replace("World", "java");

        System.out.println(str);    // "Hello World"
        System.out.println(replace1);   // "Hecco Worcd"
        System.out.println(replace2);   // "Hello java"
        System.out.println();


        // 5. trim() 메서드는 문자열의 앞뒤 공백을 제거한 문자열을 새로 생성해서 리턴한다.
        String java = " java ";

        System.out.println(java);   // " java "
        System.out.println(java.trim());    // "java"
        System.out.println();


        // 6. split(regex) 메서드는 입력받은 구분자로 문자열을 분리하고 배열에 담아서 리턴한다.
        String subject = "Linux,MariaDB,Java,Spring,HTML5,CSS3,Vue.js,Docker,Kubernetes,Jenkins";
        String[] token = subject.split(",");

        System.out.println(token.length);   // 10
        System.out.println(Arrays.toString(token)); // [Linux, MariaDB, Java, ... ]
        System.out.println();


        // 7. toCharArray() 메서드는 문자열의 문자들을 배열에 담아서 리턴한다.
        char[] charArray = subject.toCharArray();

        System.out.println(charArray.length);   // 69
        System.out.println(Arrays.toString(charArray)); // [L, i, n, u, x, ,, M, a, ... ]
        System.out.println();


        // 8. String.valueOf(...) 정적 메서드는 매개값으로 전달받은 값들을 문자열로 변경해서 리턴한다.
//        String value = String.valueOf(1234);
//        String value = String.valueOf(3.141592);
//        String value = String.valueOf(false);
        String value = String.valueOf(charArray);
        System.out.println(value);  // Linux,MariaDB,Java,Spring,HTML5,CSS3,Vue.js,Docker,Kubernetes,Jenkins
        System.out.println();
    }

    // StringBuffer & StringBuilder 클래스가 제공하는 메서드 사용
    public void method02() {
        // 1. StringBuilder 객체 생성
        // 기본 생성자를 통해서 객체를 생성하면 16개의 문자를 저장할 수 있는 버퍼가 생성된다.
        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1);     // ""
        System.out.println(sb1.length());    // 0
        System.out.println(sb1.capacity());  // 16
        System.out.println();

        // 생성자에 정수값을 전달해 주면 해당 크기만큼의 내부 버퍼가 생성된다.
        StringBuilder sb2 = new StringBuilder(30);
        System.out.println(sb2.capacity()); // 30
        System.out.println();

        // 생성자에 문자열을 전달해 주면 문자열 크기에 기본 16개의 문자 크기의 버퍼가 추가되어 생성된다.
        StringBuilder sb3 = new StringBuilder("제 이름은 ");
        sb3.append("홍길동입니다.");
        System.out.println(sb3);    // "제 이름은 홍길동입니다."
        System.out.println(sb3.length());   // 13
        System.out.println(sb3.capacity()); // 22
        System.out.println();


        // 2. StringBuilder 클래스에서 제공하는 메서드 사용
        String str = "안녕하세요.";
        StringBuilder sb4 = new StringBuilder("안녕하세요.");

        System.out.println(System.identityHashCode(str));   // 793589513
        System.out.println(System.identityHashCode(sb4));   // 1313922862
        System.out.println();

        // 2-1). append("...") 메서드는 기존 문자열 뒤에 매개값으로 전달한 문자열을 추가한다.
        // String str은 매 번 추가로 새 객체를 생성하여 해시코드가 달라진다.
        // 반면에, StringBuilder sb는 객체 하나를 통해 문자열이 변경되어 해시코드가 같다.
        str += "저는 홍길동입니다.";
        sb4.append("저는 홍길동입니다.");
        System.out.println(str);
        System.out.println(sb4);
        System.out.println(System.identityHashCode(str));   // 2093176254
        System.out.println(System.identityHashCode(sb4));   // 1313922862
        System.out.println();

        // 2-2). insert(offset, str) 메서드는 기존 문자열의 offset 위치부터 매개값으로 전달한 문자열을 추가한다.
        sb4.insert(6, "ㅎㅎㅎㅎ");
        System.out.println(sb4);    // "안녕하세요.ㅎㅎㅎㅎ저는 홍길동입니다."
        System.out.println(sb4.length());   // 20
        System.out.println(sb4.capacity()); // 22
        System.out.println();

        // 2-3). delete(start, end) 메서드는 기존 문자열의 start에서 end - 1 까지의 인덱스에 해당하는 문자열을 삭제한다.
        sb4.delete(6,14);
        // sb4.deleteCharAt(6);
        System.out.println(sb4);    // "안녕하세요.길동입니다."
        System.out.println(sb4.length());   // 12
        System.out.println(sb4.capacity()); // 22
        System.out.println();


        // 3. 메서드 체이닝
        sb4 = new StringBuilder("Java Programming");

        // 메서드 수행 결과 해당 객체의 참조를 반환하기 때문에
        // 아래와 같이 메서드를 이어서 호출할 수 있다. (메서드 체이닝)
        sb4.append("API").delete(5,16).reverse();

        System.out.println(sb4);    // "IPA avaJ"
        System.out.println(sb4.length());   // 8
        System.out.println(sb4.capacity()); // 32
        System.out.println();
    }

    // StringTokenizer 클래스가 제공하는 메서드 사용
    public void method03(){
        String str = "Linux,MariaDB,Java,Spring,HTML5,CSS3,Vue.js,Docker,Kubernetes,Jenkins";
        StringTokenizer st = new StringTokenizer(str, ",");

        // countTokens() 메서드는 남아있는 토큰 수를 리턴한다.
//        System.out.println(st.countTokens());   // 10

        // nextToken() 메서드는 토큰을 하나 꺼내온다.
//        System.out.println(st.nextToken());
//        System.out.println(st.countTokens());   // 9

        // hasMoreTokens() 메서드는 남은 토큰이 존재하는지 확인한다.
//        System.out.println(st.hasMoreTokens()); // true


        // for 문을 통한 출력 방법
        // StringTokenizer 의 token은 향상된 for문 사용 불가
//        int length = st.countTokens();
//
//        for(int i = 0; i < length; i++ ) {
//            System.out.print(st.nextToken() + " ");
//        }
//        System.out.println();

        // while 문을 통한 출력 방법
        while(st.hasMoreTokens()) {
            System.out.print(st.nextToken() + " ");
        }

        System.out.println();
    }
}
