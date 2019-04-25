import java.util.Scanner;

import com.inheri.ex02.Add;
import com.inheri.ex02.Divide;
import com.inheri.ex02.Minus;
import com.inheri.ex02.Multi;

public class CalculatorTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double a=0, b=0, result=0;
		char oper ='+';
		
		System.out.println("전자계산기");
		System.out.println("두 실수와 연산자를 입력하세요");
		
		System.out.print("실수 입력 : ");
		a = scan.nextDouble();
		
		System.out.print("연산자 입력 : ");
		oper = scan.next().charAt(0);
		
		System.out.print("실수입력 : ");
		b = scan.nextDouble();
		
		if(oper == '+') {
			Add ad = new Add();
			ad.setNum1(a);
			ad.setNum2(b);
			ad.setOper(oper);
			result=ad.calculator();
			
		}else if(oper == '-'){
			Minus ms = new Minus();
			ms.setNum1(a);
			ms.setNum2(b);
			ms.setOper(oper);
			result=ms.calculator();
			
		}else if(oper =='*') {
			Multi mt = new Multi();
			mt.setNum1(a);
			mt.setNum2(b);
			mt.setOper(oper);
			result=mt.calculator();
			
		}else if(oper =='/') {
			Divide dv = new Divide();
			dv.setNum1(a);
			dv.setNum2(b);
			dv.setOper(oper);
			result=dv.calculator();
			
		}else {
			System.out.println("연산자를 입력하세요");
		}
		
		System.out.println("결과값은 "+result+" 입니다.");
	}

}
