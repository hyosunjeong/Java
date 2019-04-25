package com.biz.ex02;

import java.util.Scanner;

import com.biz.ex02.vo.UserVO;

public class UserExec02 {
	// Crtl + F11(Run)을 해서 코드를 테스트 해보려면
	// 현재 보고있는 클래스에 main method가 있어야 한다.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// main에서 키보드로부터 한 학생에 대한 학번, 학생이름, 학년,
		// 주소, 전화번호를 입력받아 UserVO에 저장
		// 저장된 정보를 console에 표시
		
	
		UserVO userVO = new UserVO(); 
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("학번>> ");
		String strNum1 = scanner.nextLine();
		userVO.setStrNum1(strNum1);
		
		System.out.println("학생이름>> ");
		String strName = scanner.nextLine();
		
		
		System.out.println("학년>> ");
		String strGrade = scanner.nextLine();
		
		
		System.out.println("주소>> ");
		String strAddr = scanner.nextLine();
		
		
		System.out.println("전화번호>> ");
		String strPhone = scanner.nextLine();
		
		
		System.out.println(userVO);
		
		
		
		
	}
}
