package com.biz.grade.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	private static Connection dbConn;
	
	public static Connection getInstance() { // 외부에서 가져가 쓸 수 있도록 메서드 이름 지정
		return dbConn;
		
	}
	
	/*
	 * Java 1.7 이상에서 사용되는 keyword 
	 * static 생성자라고 부른다.
	 * 
	 * 원래 생성자라는 method는 외부에서 new 라는 키워드를 사용해서 method를 호출하는 형식으로 사용된다.
	 * 
	 * static 생성자는 프로젝트가 시작될 때 자동으로 실행이 되는 method이다.
	 */
	static {
		
		String dbDriver = "oracle.jdbc.driver.OracleDriver";
		
		try {
			/*
			 * Driver를 Loading하여 실행
			 */
			
			Class.forName(dbDriver);
			
			/*
			 * DB에 접속할 profile변수 선언
			 */
			String url ="jdbc:oracle:thin:@localhost:1521:xe";
			String user = "gradeUser";
			String password = "1234";
			
			dbConn = DriverManager.getConnection(url, user, password);
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

	
