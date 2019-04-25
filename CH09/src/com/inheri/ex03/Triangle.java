package com.inheri.ex03;

public class Triangle extends Shape {
	protected double width, height;
	
	@Override
	public double area() {
		result = width*height*0.5;
		return result;	
	}

}
