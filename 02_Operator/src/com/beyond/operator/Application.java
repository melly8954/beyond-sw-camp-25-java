package com.beyond.operator;

import com.beyond.operator.practice.A_InDecrease;
import com.beyond.operator.practice.B_Arithmetic;
import com.beyond.operator.practice.C_Comparison;
import com.beyond.operator.practice.D_Logical;
import com.beyond.operator.practice.E_Assignment;
import com.beyond.operator.practice.F_Triple;
import com.beyond.operator.practice.G_OperatorPractice;

public class Application {
    public static void main(String[] args) {
        System.out.println("Application 실행 중..");

        A_InDecrease a = new A_InDecrease();
        B_Arithmetic b = new B_Arithmetic();
        C_Comparison c = new C_Comparison();
        D_Logical d = new D_Logical();
        E_Assignment e = new E_Assignment();
        F_Triple f = new F_Triple();
        G_OperatorPractice g = new G_OperatorPractice();

        // a.method01();

        // b.method01();

        // c.method01();
        // c.method02();

        // d.method01();
        // d.method02();

        // e.method01();

        // f.method01();

        // g.practice1();
        // g.practice2();
        // g.practice3();
        // g.practice4();
        // g.practice5();
        // g.practice6();
         g.practice7();
        // g.practice8();
        // g.practice9();

         g.close();
    }
}
