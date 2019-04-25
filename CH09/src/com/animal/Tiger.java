package com.animal;

public class Tiger implements CatFamily {

	@Override
	public void eat() {
		System.out.println("멧돼지를 잡아먹는다.");

	}

	@Override
	public void cry() {
		System.out.println("어흥한다.");
	}

	@Override
	public void move() {
		System.out.println("밀림을 네발로 이동한다.");
	}

}
