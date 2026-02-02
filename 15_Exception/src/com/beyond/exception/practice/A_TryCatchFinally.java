package com.beyond.exception.practice;

public class A_TryCatchFinally {
    public void method01(){
        try{
            // 예외가 발생할 수 있는 코드
            // ArithmeticException
//            int result = 10 / 0;
//            System.out.println(result);

//            throw new NullPointerException();
            throw new ClassCastException();
        } catch (ArithmeticException e) {
            // try에서 발생한 예외를 처리하는 코드
            System.out.println("ArithmeticException 예외가 발생했습니다. -> " + e.getMessage());
        } catch (NullPointerException | ClassCastException e) {
            System.out.println("NullPointerException 또는 ClassCastException 예외가 발생했습니다.");
        } catch (Exception e) {
            System.out.println("예외가 발생했습니다.");
        } finally {
            // 예외 발생 여부와 상관없이 무조건 실행되는 코드
            System.out.println("finally 블록 실행.");
        }
    }
}
