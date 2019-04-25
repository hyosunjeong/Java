/*
 * 고양이와 호랑이의 공통점은 고양이과이다.
 * 고양이과를 인터페이스로 정의하고, 고양이 클래스와 호랑이 클래스에서 구현한다. 
 *  => (고양이과 인터페이스를 상속받는다)
 * 
 * 인터페이스는 상수(static final)와 추상메소드(abstract) 외에는 가질 수 없다.
 * 
 * 객체모델링
 * 1. 고양이과 인터페이스
 * 고양이과 동물들은 먹이를 먹는다.
 * 고양이과 동물들은 운다.
 * 고양이과 동물들은 이동한다.
 * 
 * 2. 고양이 클래스
 * 생선을 좋아한다.
 * 야옹한다.
 * 방을 네발로 이동한다.
 * 
 * 3. 호랑이 클래스
 * 멧돼지를 좋아한다.
 * 어흥한다.
 * 밀림을 네 발로 이동한다.
 * 
 * 코드 가이드
 * 1. CatFamily
 * eat() : void
 * cry() : void
 * move() : void
 * 
 * 2. Cat, Tiger는 CatFamily를 구현한다.
 *  
 */

package com.animal;

public interface CatFamily {
	public abstract void eat();
	
	public abstract void cry();
	
	public abstract void move();
	
	
	
}
