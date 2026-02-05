package com.beyond.assiststream;

import com.beyond.assiststream.practice.A_ByteToCharStream;
import com.beyond.assiststream.practice.B_BufferedStream;
import com.beyond.assiststream.practice.C_DataStream;
import com.beyond.assiststream.practice.D_ObjectStream;

public class Application {
    public static void main(String[] args) {
        System.out.println("Application 실행 중..");
        System.out.println();

        // 문자 변환 보조 스트림
        A_ByteToCharStream a = new A_ByteToCharStream();
//        a.method01();
//        a.method02();

        // 성능 향상 보조 스트림
        B_BufferedStream b = new B_BufferedStream();
//        b.fileSave();
//        b.fileRead();

        // 기본 타입 입출력 보조 스트림
        C_DataStream c = new C_DataStream();
//        c.fileSaveAndRead();

        // 객체 입출력 보조 스트림
        D_ObjectStream d = new D_ObjectStream();
        d.fileSave();
        d.fileRead();

        System.out.println("Application 실행 종료..");
    }
}
