package com.beyond.assiststream.practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class B_BufferedStream {
    public void fileSave() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("a_buffer.txt"))) {
            bw.write("안녕하세요~");
            bw.newLine();
            bw.write("줄바꿈이 적용되었습니다.");
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void fileRead() {
        try (BufferedReader br = new BufferedReader(new FileReader("a_buffer.txt"))) {
            // BufferedReader 클래스에서 제공하는 메서드로 파일에서 한 줄을 읽어올 때 사용한다.
//            System.out.println(br.readLine());
//            System.out.println(br.readLine());
            // 더 이상 읽어올 데이터가 없을 경우 null을 리턴한다.
//            System.out.println(br.readLine());

            String line;

            while((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
