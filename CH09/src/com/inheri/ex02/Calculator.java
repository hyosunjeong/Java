/*
 * 1. 객체 모델링
 * 수퍼클래스로 Calculator 추상클래스를 선언
 * 사칙연산의 공통요소(코드)인 두 실수, 결과 값, 연산자(문자)를 필드(데이터)로 선언한다.
 * 공개된 setters메소드를 선언한다.
 * 사칙연산 기능이 있는 calculator()메소드를 추상메소드로 선언한다.
 * 서브클래스로 Add, Minus, Multi, Divide클래스를 선언  
 * calculator()메소드를 메소드 오버라이딩한다.
 * 
 * CalculatorTest 클래스 : 디폴트 패키지에 선언
 * 사용자로부터 두 실수와 연산자를 입력받아 전자계산기 기능을 구현한다.
 * 
 * 2. 코드가이드
 * abstract Class = Calculator
 * Field = 
 * # num1 : double, 
 * # num2 : double, 
 * # result : double, 
 * # oper : char
 * Method = + setNum1(double num1) : void
 * + setNum2(double num2) :void
 * + setOper(char oper):void
 * + abstract double calculator()
 * 
 * Class = Add, Minus, Multi, Divide
 * Method = + double calculator() : 메소드 오버라이딩
 * 
 */

package com.inheri.ex02;

public abstract class Calculator { // 전자계산기
	protected double num1,num2,result;
	protected char oper;
	
	public double getNum1() {
		return num1;
	}
	public void setNum1(double num1) {
		this.num1 = num1;
	}
	public double getNum2() {
		return num2;
	}
	public void setNum2(double num2) {
		this.num2 = num2;
	}
	public char getOper() {
		return oper;
	}
	public void setOper(char oper) {
		this.oper = oper;
	}
	
	public abstract double calculator(); //추상메소드
	

}
