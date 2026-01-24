// 패키지 (Package)
// 패키지는 클래스를 관리하기 위해 사용된다.
package com.beyond.variable;

import com.beyond.variable.practice.A_Variable;
import com.beyond.variable.practice.B_ConsoleOutput;
import com.beyond.variable.practice.C_ConsoleInput;

// 클래스의 이름은 자바 파일의 이름과 동일해야 한다.
public class Application {  // 실행 클래스 (main 메서드를 포함한 클래스)
    // main 메서드
    // 프로그램의 시작점으로 'java.exe'가 Application.class를 실행시킬 때 제일 먼저 실행되는 메서드
    public static void main(String[] args) {
        // System.out.println("Application.java 실행 중..");

        // main 메서드에서 A_Variable 클래스의 variableTest 메서드 호출
        // 1). 실행할 메서드가 속해있는 클래스 생성(new)해야 한다.
        // 클래스명 변수명 = new 클래스명();
        // com.beyond.variable.practice.A_Variable v = new com.beyond.variable.practice.A_Variable();
        A_Variable v = new A_Variable();
        B_ConsoleOutput output = new B_ConsoleOutput();
        C_ConsoleInput input = new C_ConsoleInput();

        // 2). 생성한 클래스로 메서드 호출(실행)
        // v.variableTest();
        // v.autoCasting();
        // v.forceCasting();
        // output.valuePrint();
        input.keyBoardInput();
    }
}
