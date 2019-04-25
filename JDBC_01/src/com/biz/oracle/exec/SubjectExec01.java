package com.biz.oracle.exec;

import com.biz.oracle.dao.SubjectDao;

public class SubjectExec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SubjectDao sdao = new SubjectDao();
		sdao.dbConnetion();
		sdao.selectSubject();

	}

}
