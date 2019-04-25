package com.biz.ex02.vo;

public class UserVO { // extends Object

	// member변수를 private로 선언
	// 외부에서 직접 member변수에 접근하지 못하도록 하는 것
	private String strNum1;
	private String strName;
	private String strGrade;
	private String strAddr;
	private String strPhone;
	
	
	
	
	public String getStrNum1() {
		return strNum1;
	}
	public void setStrNum1(String strNum1) {
		this.strNum1 = strNum1;
	}
	public String getStrName() {
		return strName;
	}
	public void setStrName(String strName) {
		this.strName = strName;
	}
	public String getStrGrade() {
		return strGrade;
	}
	public void setStrGrade(String strGrade) {
		this.strGrade = strGrade;
	}
	public String getStrAddr() {
		return strAddr;
	}
	public void setStrAddr(String strAddr) {
		this.strAddr = strAddr;
	}
	public String getStrPhone() {
		return strPhone;
	}
	public void setStrPhone(String strPhone) {
		this.strPhone = strPhone;
	}
	
	
	// VO를 만들때 toString()을 자동 재정의해서
	// VO에 값을 세팅한다음
	// 값이 잘 세팅되었는지 확인하는 용도로 사용하는 것
	@Override
	public String toString() {
		return "UserVO [strNum1=" + strNum1 + ", strName=" + strName + ", strGrade=" + strGrade + ", strAddr=" + strAddr
				+ ", strPhone=" + strPhone + ", getStrNum1()=" + getStrNum1() + ", getStrName()=" + getStrName()
				+ ", getStrGrade()=" + getStrGrade() + ", getStrAddr()=" + getStrAddr() + ", getStrPhone()="
				+ getStrPhone() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	
}
	

