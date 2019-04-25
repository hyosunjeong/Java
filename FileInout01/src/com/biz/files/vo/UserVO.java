package com.biz.files.vo;

public class UserVO {
	
	private String strId;
	private String strPassWord;
	private String strName;
	public String getStrId() {
		return strId;
	}
	public void setStrId(String strId) {
		this.strId = strId;
	}
	public String getStrPassWord() {
		return strPassWord;
	}
	public void setStrPassWord(String strPassWord) {
		this.strPassWord = strPassWord;
	}
	public String getStrName() {
		return strName;
	}
	public void setStrName(String strName) {
		this.strName = strName;
	}
	@Override
	public String toString() {
		return "UserVO [strId=" + strId + ", strPassWord=" + strPassWord + ", strName=" + strName + ", getStrId()="
				+ getStrId() + ", getStrPassWord()=" + getStrPassWord() + ", getStrName()=" + getStrName()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
	
	
	
	
}