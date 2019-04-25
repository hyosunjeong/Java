package com.biz.exam.leep;

import com.biz.exam.method.LeepMethod;

public class LeepYear02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LeepMethod lm = new LeepMethod();
		
		for(int i = 1980; i < 2018; i++) {
			boolean b = lm.isLeepYear(i);
			if (b) { // b가 boolean 형 이므로 b==true라고 쓰지 않아도 된다.
				System.out.println(i+"는 윤년");
			}
		}

	}

}
