/*
 * 클래스를 선언하는 단계
 * 	1. 객체 모델링 (디자인/설계)
 * Shape 클래스 :
 * 면적을 구해서 반환하는 기능을 가진 메소드를 정의한다.
 * Rectangular, Triangle, Circle 클래스 : 
 * Shape 클래스를 상속한다.
 * 면적을 구해서 반환하는 메소드를 오버라이딩한다.
 *  
 * 	2. 코드 가이드 (추상화된 개념을 코드로 구체화)
 * Class : abstract Shape
 * Field = 없음
 * Method = area() : double
 * Class : Rectangular, Triangle
 * Field = width : double, height : double
 * Method = area() : double
 * Class :  Circle
 * Field = radius : double
 * Method = area() : double
 * 
 * 	3. 클래스 정의 
 */
package com.inheri.ex01;

public abstract class Shape {
	
	protected double result,width,height,radius;
	

	public double getWidth() {
		return width;
	}


	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public abstract double area();
	
}
