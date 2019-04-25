package com.biz.grade.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.biz.grade.vo.StudentVO;

public  class StudentDaoImp implements StudentDao {
	
	Connection dbConn;
	
	
	public StudentDaoImp() {
		dbConnection();
	}
	
	
	
	private void dbConnection() {
		
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
	
	
	

	@Override
	public int insert(StudentVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<StudentVO> selectAll() {
		// TODO 전체 학생의 데이터를 조회하여 List로 리턴
		String sql = " SELECT * FROM tbl_student ";
		
		
		PreparedStatement ps;
		List<StudentVO> stdList = new ArrayList();
		
		
		try {
			ps = dbConn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				StudentVO vo = new StudentVO(
				rs.getString("st_num"),
				rs.getString("st_name"),
				rs.getString("st_tel"),
				rs.getString("st_addr")
				);
				stdList.add(vo);
			}
			rs.close();
			ps.close();
			
			return stdList;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public StudentVO findByNum(String st_num) {
		// TODO 학번으로 조회하여 패을 리턴
		String sql = " SELECT * FROM tbl_student ";
		sql += " WHERE st_num = '" + st_num + "'";
		
		PreparedStatement ps;
		
		try {
			ps = dbConn.prepareStatement(sql);
			
			//ps.setString(1, st_num);
			
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				StudentVO vo = new StudentVO(
						rs.getString("st_num"),
						rs.getString("st_name"),
						rs.getString("st_tel"),
						rs.getString("st_addr")
						);
						
				return vo;
			}
			return null;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public List<StudentVO> findByName(String st_name) {
		// TODO 이름으로 조회하여 List로 리턴
		String sql = " SELECT * FROM tbl_student ";
		sql += " WHERE st_name = ? ";
		
		
		/*
		 * SQL LIKE 키워드를 사용해서 SQL을 작성
		 * sql += " WHERE st_name LIKE '&" + st_name + %'";
		 */
				
		return null;
	}

	@Override
	public int update(StudentVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String st_num) {
		// TODO Auto-generated method stub
		return 0;
	}


	public void insertBulk(List<StudentVO> stdList) {
		// TODO Service에서 생성한 stdList를 매개변수로 받아 DB에 insert
		
		
		String sql = " INSERT INTO tbl_student ";
		sql += " VALUES(?,?,?,?) ";
		
		
		PreparedStatement ps;
		
		try {
			ps = dbConn.prepareStatement(sql);
			
			/*
			for(StudentVO v : stdList) {
				ps.setString(1, v.getSt_num());
				ps.setString(2, v.getSt_name());
				ps.setString(3, v.getSt_tel());
				ps.setString(4, v.getSt_addr());
				ps.executeUpdate();
			*/
			/*
			 * Bulk Data를 insert 할 때는 1개의 데이터를 set하고 exec...()을 실행하는 것은 매우 비효율적이다.
			 *
			 * java의 PrepareStatement에는 이처럼 Bulk Data를 insert 할때는 Batch 처리를 한다.
			 */
			
			for(StudentVO vo : stdList) {
				ps.setString(1, vo.getSt_num());
				ps.setString(2, vo.getSt_name());
				ps.setString(3, vo.getSt_tel());
				ps.setString(4, vo.getSt_addr());
				ps.addBatch(); // stdList에 들어있는값을 vo에 하나씩 세팅한 후 ps.addBatch()에 추가한다. 
			}
			ps.executeBatch(); // addBatch()에 들어있는 데이터를 일괄적으로 한번에 처리한다.
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}


	
}
