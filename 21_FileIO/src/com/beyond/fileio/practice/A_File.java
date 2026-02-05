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
        try {
            boolean result = false;

            // File file = new File("test.txt");    // 메모리상에서만 존재하는 객체

            // File temp = new File("C:/github/beyond-java/21_FileIO/temp");
            File demo = new File("C:/github/beyond-java/21_FileIO/temp/demo");
            File file = new File("C:/github/beyond-java/21_FileIO/temp/demo/test.txt");

            System.out.println(file.getName());             // 파일 이름
            System.out.println(file.getAbsolutePath());     // 파일 경로
            System.out.println(file.length());              // 파일 용량
            System.out.println(file.exists());              // 파일 존재 여부
            System.out.println(file.isFile());              // 파일 여부
            System.out.println(file.isDirectory());         // 디렉터리 여부
            System.out.println();

            if(!demo.exists()) {
                // result = temp.mkdir();   // 폴더(디렉터리)를 생성하는 메서드
                result = demo.mkdirs();   // 경로상에 없는 모든 폴더(디렉터리)를 생성하는 메서드
            }
            
            System.out.printf("폴더(디렉터리) 생성 여부: %b\n", result);

            if(file.exists()) {
                file.delete();  // 파일 또는 디렉터리를 삭제하는 메서드
                System.out.println("파일 삭제 완료");
            } else {
                // 파일을 생성하는 메서드
                // 만약, 존재하지 않는 경로를 제시하면 IOException 발생
                file.createNewFile();
                System.out.println("파일 생성 완료");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
