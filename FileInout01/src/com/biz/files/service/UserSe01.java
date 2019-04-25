package com.biz.files.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.biz.files.vo.UserVO;

public class UserSe01 {

	List<UserVO> userList;
	
	public UserSe01() {
		userList = new ArrayList();
		
	}
	public void makeId() {
				
		for(int i=0; i<10; i++) {
			
			// 10개의 리스트에 담긴 vo는 항상 새로운 생성을 해 줘야 한다.
			UserVO vo= new UserVO();
			int num = (int)(Math.random()*(200-100+1))+100;
			vo.setStrId(""+num);
			userList.add(vo);
			
		}
		// Set<UserVO> uSet = new TreeSet(userList); 
		// userList = new ArrayList(uSet);
		
		
		
	}
	
	public void view() {
		for(UserVO vo : userList) {
			System.out.println(vo);
		}
		
		 
	}
}
