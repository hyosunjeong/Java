package com.inheri.ex01;

public class Circle extends Shape {
	
	
	@Override
	public double area() {
		result = radius*radius*Math.PI;
		return result;
	}

	
}
