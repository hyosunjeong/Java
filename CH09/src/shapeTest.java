import java.util.Scanner;

import com.inheri.ex01.Rectangular;
import com.inheri.ex01.Triangle;
import com.inheri.ex01.Circle;


public class shapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Rectangular rg = new Rectangular();
		Triangle tg = new Triangle();
		Circle ce = new Circle();
		
		double w = 0, h = 0, r= 0, result = 0;
		
		System.out.println("도형의 가로,세로,반지름을 입력하세요");
		System.out.print("가로 입력 : ");
		w = scan.nextDouble();
		System.out.print("세로 입력 : ");
		h = scan.nextDouble();
		System.out.print("반지름 입력 : ");
		r = scan.nextDouble();
		
		rg.setWidth(w);
		rg.setHeight(h);
		result = rg.area();
		System.out.println("사각형의 면적은 " + result +"이다.");
		
		tg.setWidth(w);
		tg.setHeight(h);
		result = tg.area();
		System.out.println("삼각형의 면적은 " + result +"이다.");
		
		ce.setRadius(r);;
		result = ce.area();
		System.out.println("원의 면적은 " + result +"이다.");
	
		
	}

}
