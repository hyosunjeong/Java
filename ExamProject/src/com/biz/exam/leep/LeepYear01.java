package com.biz.exam.leep;

public class LeepYear01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intYear = 2018;
		boolean leepOk = false;	// flag변수

		//윤년인지 검사 하기
		if(intYear %4 == 0) {
			leepOk = true;
			if(intYear %100 == 0) {
				leepOk = false;
				if(intYear % 4 == 0) {
					leepOk = true;
				}
				
			}
			
		}

		if(leepOk) {
			System.out.println("윤년");
		}else {
			System.out.println("평년");
		}
		
		//if(intYear % 4 == 0 && intYear % 100 != 0 && intYear % 400 == 0) {
			
		//}
	}

}
