package com.biz.jtest;

public class Hello {
	
	/*
	 * hello 메서드는 외부에서 누군가 호출했을 때 
	 * Hello라는 문자열을 리턴 해 줄것이다 라는 보장을 하는 method
	 * 
	 * 만약 외부에서 호출을 했는데 
	 * hello를 리턴하거나 HELLO를 리턴하면 이 method는 잘못 작성된 것이다.
	 */
	public String hello() {
		
		return "Hello";
	}
	
	
	/*
	 * 2개의 정수를 매개변수로 받아서
	 * 덧셈을 하여 리턴하는 기능
	 * 
	 * 2개의 정수를 매개변수로 받은 후
	 * 덧셈 후 리턴하는 값은 산수적 계산공식에 의해 반드시 성립하는 구조
	 */
	public int calc(int num1, int num2) {
		
		return num1+num2;
	}

}
