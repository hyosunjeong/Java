package com.inheri.ex03;

public class Square extends Shape {
	protected double width, height;
	
	@Override
	public double area() {
		result = width*height;
		return result;
	}

}
