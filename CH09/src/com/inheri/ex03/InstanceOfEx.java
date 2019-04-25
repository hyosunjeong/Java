package com.inheri.ex03;

public class InstanceOfEx {
	public static void castingMethod(Shape sh) { //Shape sh : 수퍼클래스형으로 레퍼런스 변수 선언
		
		double result = 0;
		
		if(sh instanceof Circle) { // instanceof 연산자 : 수퍼클래스의 레퍼런스 변수(sh)가 
									//서브 클래스의 객체(Circle)로 형 변환이 가능한지 체크한다.
			// 수퍼클래스의 레퍼런스 변수에 서브클래스의 주소값을 담았으므로 업캐스팅이다.
			// 따라서 참조영역이 수퍼클래스 영역으로 축소된다.
			// 수퍼클래스에는 result만 있고 radius는 없다. radius는 Circle에 있다. 
			// 하지만 업캐스팅으로 인해 radius를 참조 할 수 없다.
			// 다운캐스팅 : 명시적 형변환 => 참조영역을 서브클래스 영역으로 확대한다.
			Circle ce = (Circle)sh; // 다운캐스팅
			ce.radius = 2.6;
			result = sh.area();
		}else if(sh instanceof Square) {
			Square su = (Square)sh; // 다운캐스팅
			su.width = 5.3;
			su.height = 8.2;
			result = sh.area();
		}else if(sh instanceof Triangle) {
			Triangle tg = (Triangle)sh; // 다운캐스팅
			tg.width = 4.3;
			tg.height = 12.65;
			result = sh.area();
		}
		System.out.println("도형의 면적은 " + result +" 이다.");
	}

}
