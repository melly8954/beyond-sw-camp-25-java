package com.beyond.assiststream.practice;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class A_ByteToCharStream {
    // InputStreamReader 테스트
    public void method01() {
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            char[] buffer = new char[20];

            System.out.print("문자열 입력 > ");
            isr.read(buffer);

            for(char c : buffer) {
                System.out.print(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // OutputStreamWriter 테스트
    public void method02() {
        try {
            OutputStreamWriter osw = new OutputStreamWriter(System.out);

            osw.write("안녕하세여 저는 몽룡이예요\n");
            osw.write("만나서 반갑소. 이따 다시 봐요\n");
            osw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
