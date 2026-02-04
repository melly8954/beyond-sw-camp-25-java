package com.beyond.fileio.practice;

import java.io.File;
import java.io.IOException;

/*
    File 클래스
        - 파일 크기, 속성, 이름 등의 정보를 얻어내는 기능과 파일 생성 및 삭제하는 기능을 제공한다.
        - 파일에 데이터를 읽고 쓰는 기능은 지원하지 않는다.
        - 파일의 데이터를 읽고 쓰기 위해서는 파일 관련 입출력 스트림을 사용해야 한다.
 */
public class A_File {
    public void method01() {
        // new 연산자로 생성되는 객체는 Heap 메모리 상에서만 존재할 뿐
        // 실제 물리적인 파일을 얻기 위해서는 .createNewFile() 메서드를 사용해야 한다.
        File file = new File("test.txt");

        try {
            file.createNewFile();   // 파일을 생성하는 메서드
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
