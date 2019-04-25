package com.biz.ex02;

import java.util.Scanner;

import com.biz.ex02.vo.GradeVO;

public class GradeExec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 *  main에서 키보드로 부터 한 학생에 대한
		 *  학번, 국어점수, 영어점수, 수학점수를 입력받아
		 *  GradeVO에 저장
		 *  저장된 정보를 console에 표시
		 *  
		 */
		
		GradeVO gradeVO = new GradeVO(); // 객체생성
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("학번>> ");
		gradeVO.setStrGrade(scanner.nextLine());
		// String strGrade = scanner.nextLine();

		// 국어, 영어, 수학 성적은 변수가 int형인데
		// scanner.nextLine() 읽어들인 값은 string형이다.
		// String형을 int형으로 변환시켜야 한다.
		
		System.out.println("국어점수>> ");
		String strKor = scanner.nextLine();
		int intKor = Integer.valueOf(strKor);
		gradeVO.setIntKor(intKor);
		
		System.out.println("영어점수>> "); 
		String strEng = scanner.nextLine(); // 키보드에 입력한 문자열이 strEng에 들어간다.
		int intEng = Integer.valueOf(strEng); // 문자열로 들어온 값을 정수로 변환시켜 리턴한다. 리턴된 값은 intEng변수에 저장된다.
		gradeVO.setIntEng(intEng); // intEng에 저장되어있는 값은 gradeVO에 있는 intEng 변수에 intEng에 저장된 값이 저장된다.
		//=> gradeVO.setIntEng(Integer.valueOf(scanner.nextLine())); 
		
		System.out.println("수학점수>> ");
		String strMath = scanner.nextLine();
		int intMath = Integer.valueOf(strMath);
		gradeVO.setIntEng(intMath);
		
		System.out.println(gradeVO); //gradeVO를 콘솔에 표시
		System.out.println(gradeVO.toString()); // .toString을 쓸 수 있다.
		
		int intTotal = gradeVO.getIntKor();
		intTotal += gradeVO.getIntEng();
		intTotal += gradeVO.getIntMath();
		gradeVO.setIntTotal(intTotal);
		
		float floatAvg = intTotal/3.0f;
		// floatAvg = (float) intSum / 3;
		
		gradeVO.setFloatAvg(floatAvg);
		
		System.out.println("총점>> " + intTotal);
		System.out.println("평균>> " + floatAvg);

	}

}
