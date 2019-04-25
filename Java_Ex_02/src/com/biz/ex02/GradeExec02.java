package com.biz.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.ex02.vo.GradeVO;

public class GradeExec02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		Scanner scanner = new Scanner(System.in); // 키보드 입력을 위해 scanner를 만든다.
		List<GradeVO> gradeList = new ArrayList(); 
				
		for(int i = 0; i < 5; i++) {
			GradeVO gradeVO = new GradeVO(); 
			
			System.out.print("학번");
			String strGrade = scanner.nextLine();
			gradeVO.setStrGrade(strGrade);
			
			/*
			 * System.out.pring("학번")
			 * System.out.println(i+1);
			 * gradeVO.setStrGrade("" + i+1); 
			 * 
			 * 학번의 값을 1씩 증가
			 */
			
			
			System.out.print("국어");
			String strKor = scanner.nextLine();
			int intKor = Integer.valueOf(strKor);
			gradeVO.setIntKor(intKor);
						
			System.out.print("영어");
			String strEng = scanner.nextLine();
			int intEng = Integer.valueOf(strEng);
			gradeVO.setIntEng(intEng);
						
			System.out.print("수학");
			String strMath = scanner.nextLine();
			int intMath = Integer.valueOf(strMath);
			gradeVO.setIntMath(intMath);
			
			int intSum = gradeVO.getIntKor();
			intSum += gradeVO.getIntEng();
			intSum += gradeVO.getIntMath();
			gradeVO.setIntTotal(intSum);
			
			float floatAvg = (float) intSum/3;
			gradeVO.setFloatAvg(floatAvg);
			
		
			// 리스트에 추가
			gradeList.add(gradeVO);
			
		}
		
		System.out.println("=================================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-------------------------------------------------");
		
		
		for(int i = 0; i < gradeList.size(); i++) {
			
			System.out.print(gradeList.get(i).getStrGrade() + "\t");
			System.out.print(gradeList.get(i).getIntKor() + "\t");
			System.out.print(gradeList.get(i).getIntEng() + "\t");
			System.out.print(gradeList.get(i).getIntMath() + "\t");
			System.out.print(gradeList.get(i).getIntTotal() + "\t");
			System.out.print(gradeList.get(i).getFloatAvg() + "\n");
		}
		System.out.println("=================================================");

		
	}

}
