package com.biz.exam.service;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MoneyService {

	int int50K ;
	//int intSw = 1;
	
	Map<String,Integer> mList;
	String[] paperName;
	
	public void writerPaper(String file) {
		PrintWriter pw;
		try {
			pw = new PrintWriter(file);
			
			for(String name : mList.keySet()) {
				System.out.println(name + ":" + mList.get(name));
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void viewPaper2() {
	
		for(String name : mList.keySet()) {
			System.out.println(name + ":" + mList.get(name));
		}
	}
	
	public MoneyService(){
		int50K = 50000;
		mList = new HashMap();
		paperName = new String[]{
				"5만원권","1만원권","5천원권","1천원권","500원권","100원권","50원권","10원권"
		};
	}
	
	public void viewPaper() {
		// Map에서 key부분만 분리해 내기
		Iterator<String> keys = mList.keySet().iterator();
		while(keys.hasNext()) {
			String name = keys.next();
			System.out.println(name + ":" +mList.get(name));
		}
	}
	
	public void makePaperBoolean(int nMoney) { // 방법1
		
		boolean sw = true;
		while(true) {
			int nCount = (nMoney / int50K); // 최초의 매수 확인
			nMoney -= (nCount * int50K); // 5만원권을 뺀 금액
			
			if(nMoney < 10 ) break;
			
			if(sw) { // boolean일경우 if(sw == true)와 같음
				int50K = (int50K/5);	
			}else {
				int50K = (int50K/2);
			}
			sw = !sw;
			
		}
	}
	
	public void makePaper(int nMoney) {
		
		int[] intCM = new int[8];
		
		// Money01 클래스의 int nMoney = 3949203;
		// nMoney를 5만원권으로 나누면 5만원권의 매수가 구해진다.
		intCM[0] = (nMoney / int50K); //=>5만원권 매수
		nMoney = nMoney - (intCM[0] * int50K); // => (3949203-(5만원권 매수 * 5만원)) =>제외한금액
		
		int50K = int50K / 5; // (int50k/5)=>10000권
		intCM[1] = (nMoney / int50K); 
		nMoney = nMoney - (intCM[1]*int50K);
		
		int50K = int50K / 2; // (int50k/2)=>5000권
		intCM[2] = (nMoney / int50K); 
		nMoney = nMoney - (intCM[2]*int50K);

		int50K = int50K / 5; // (int50k/5)=>1000권
		intCM[3] = (nMoney / int50K); 
		nMoney = nMoney - (intCM[3]*int50K);

		int50K = int50K / 5; // (int50k/5)=>500권
		intCM[4] = (nMoney / int50K); 
		nMoney = nMoney - (intCM[4]*int50K);
		
		int50K = int50K / 5; // (int50k/5)=>100권
		intCM[5] = (nMoney / int50K); 
		nMoney = nMoney - (intCM[5]*int50K);
		
		int50K = int50K / 5; // (int50k/5)=>50권
		intCM[6] = (nMoney / int50K); 
		nMoney = nMoney - (intCM[6]*int50K);
		
		int50K = int50K / 5; // (int50k/5)=>10권
		intCM[7] = (nMoney / int50K); 
		nMoney = nMoney - (intCM[7]*int50K);



		
	}


	public void makePaperInt(int nMoney) { // 방법2
	
	int iSw = 1;
	while(true) {
		int nCount = (nMoney / int50K); // 최초의 매수 확인
		nMoney -= (nCount * int50K); // 5만원권을 뺀 금액
		if(iSw == 1) {
			int50K = (int50K/5);	
		}else {
			int50K = (int50K/2);
		}
		iSw *= -1;
		
		}
	}
}