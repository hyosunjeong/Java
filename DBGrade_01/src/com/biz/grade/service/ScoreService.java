package com.biz.grade.service;

import java.util.Scanner;

import com.biz.grade.dao.ScoreDao;
import com.biz.grade.dao.ScoreDaoImp;
import com.biz.grade.dao.StudentDao;
import com.biz.grade.dao.StudentDaoImp;
import com.biz.grade.vo.ScoreVO;
import com.biz.grade.vo.StudentVO;

public class ScoreService {

	Scanner scan ;
	
	// 학생정보를 조회하기 위한 studentDao를 선언
	StudentDao stdDao;
	
	// 점수 정보를 조회하기 위한 ScoreDao를 선언
	ScoreDao scDao;
	
	
	public ScoreService() {
		scan = new Scanner(System.in);
		stdDao = new StudentDaoImp();
		scDao = new ScoreDaoImp();
		
	}
	public void scoreMenu() {
		
		while(true) {
			System.out.println("=================================");
			System.out.println("성적정보 입력");
			System.out.println("---------------------------------");
			System.out.println("1.입력  2.수정  3.삭제  0.종료");
			
			String strM = scan.nextLine();
			int intM = Integer.valueOf(strM);
			
			if(intM == 0) return;
			if(intM == 1) this.insertScore();
			if(intM == 2) this.updateScore();
			if(intM == 3) this.deleteScore();
			
		}
	
		
		
		/*
		 * 입력을 선택하면
		 * 1. 학번을 입력받도록 하고
		 * 2. 학번에 대한 학생 정보를 보여주고
		 * 3. 이미 점수가 입력되어 있으면 점수를 보여주고
		 * 4. 점수를 입력하지 않고 Enter를 누르면 기존 점수를 유지하고
		 * 	>> 수정 상태로 변경
		 * 5. 점수가 없는 경우에는
		 * 6. 새로운 점수를 입력받고
		 * 7. 점수를 insert한다.
		 */
	}
		
		private void insertScore() {
		// TODO 학생정보 입력
			System.out.println("==============================");
			System.out.print("학번>> ");
			String strNum = scan.nextLine();
			
			if(strNum.equals("")) {
				System.out.println("점수 입력을 취소합니다.");
				return ;
			}
			// 학번을 입력했으면 학생 정보로부터 학번에 대한 학생데이터를 조회해서 보여주기 
			 StudentVO stdVO = stdDao.findByNum(strNum);
			 
			 System.out.println("==============================");
			 System.out.println("학번: " + stdVO.getSt_num());
			 System.out.println("이름: " + stdVO.getSt_name());
			 System.out.println("전화번호: " + stdVO.getSt_tel());
			 System.out.println("주소 : " + stdVO.getSt_addr());
			 System.out.println("==============================");
			 
			 // 학번을 입력했으면 
			 // 만약 학생 점수가 있으면 보여주기
			 ScoreVO scVO = scDao.findByNum(strNum);
			 
			 // 점수가 있기 때문에 수정으로 변경
			 if(scVO != null) {
				 System.out.println("학번\t국어\t영어\t수학");
				 System.out.println("----------------------------------");
				 System.out.print(scVO.getSc_num() + "\t");
				 System.out.print(scVO.getSc_kor() + "\t");
				 System.out.print(scVO.getSc_eng() + "\t");
				 System.out.print(scVO.getSc_math() + "\n");
				 System.out.println("==================================");
			 }

			 // 값을 새로 추가
			 System.out.print("국어>> ");
			 String strKor = scan.nextLine();

			 System.out.print("영어>> ");
			 String strEng = scan.nextLine();
			 
			 System.out.print("수학>> ");
			 String strMath = scan.nextLine();
			 
			 int intKor = 0;
			 int intEng = 0;
			 int intMath = 0;
			 
			 try {
				 intKor = Integer.valueOf(strKor);
				 intEng = Integer.valueOf(strEng);
				 intMath = Integer.valueOf(strMath);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("점수 입력 오류");
				return ; 
			}
			 ScoreVO vo = new ScoreVO();
			 
			 vo.setSc_num(strNum);
			 vo.setSc_kor(intKor);
			 vo.setSc_eng(intEng);
			 vo.setSc_math(intMath);
			 
			 scDao.insert(vo);
			 
	
	}



	private void deleteScore() {
		// TODO Auto-generated method stub
		
	}
	private void updateScore() {
		// TODO Auto-generated method stub
		
	}
}	