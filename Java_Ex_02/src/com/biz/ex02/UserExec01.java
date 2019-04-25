package com.biz.ex02;

import com.biz.ex02.vo.UserVO;

public class UserExec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UserVO userVO = new UserVO();
		userVO.setStrNum1("001");
		userVO.setStrName("홍길동");
		userVO.setStrAddr("광주");
		userVO.setStrGrade("1");
		userVO.setStrPhone("010");		
		
		
		
		
		
		String toString = userVO.toString();
		
		System.out.println(toString);

	}

}
