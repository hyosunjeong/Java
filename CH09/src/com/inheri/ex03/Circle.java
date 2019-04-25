package com.inheri.ex03;

public class Circle extends Shape {
	protected double radius;
	
	@Override
	public double area() {
		result = radius * radius * Math.PI;
		return result;
	}

}
