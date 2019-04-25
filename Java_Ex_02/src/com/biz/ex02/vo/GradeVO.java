package com.biz.ex02.vo;

public class GradeVO {

	private String strGrade;
	private int intKor;
	private int intEng;
	private int intMath;
	private int intTotal;
	private float floatAvg;
	
	public String getStrGrade() {
		return strGrade;
	}
	public void setStrGrade(String strGrade) {
		this.strGrade = strGrade;
	}
	public int getIntKor() {
		return intKor;
	}
	public void setIntKor(int intKor) {
		this.intKor = intKor;
	}
	public int getIntEng() {
		return intEng;
	}
	public void setIntEng(int intEng) {
		this.intEng = intEng;
	}
	public int getIntMath() {
		return intMath;
	}
	public void setIntMath(int intMath) {
		this.intMath = intMath;
	}
	public int getIntTotal() {
		return intTotal;
	}
	public void setIntTotal(int intTotal) {
		this.intTotal = intTotal;
	}
	public float getFloatAvg() {
		return floatAvg;
	}
	public void setFloatAvg(float floatAvg) {
		this.floatAvg = floatAvg;
	}
	@Override
	public String toString() {
		return "GradeVO [strGrade=" + strGrade + ", intKor=" + intKor + ", intEng=" + intEng + ", intMath=" + intMath
				+ ", intTotal=" + intTotal + ", floatAvg=" + floatAvg + ", getStrGrade()=" + getStrGrade()
				+ ", getIntKor()=" + getIntKor() + ", getIntEng()=" + getIntEng() + ", getIntMath()=" + getIntMath()
				+ ", getIntTotal()=" + getIntTotal() + ", getFloatAvg()=" + getFloatAvg() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}

	
	