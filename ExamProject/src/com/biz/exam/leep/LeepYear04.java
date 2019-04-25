package com.biz.exam.leep;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.biz.exam.method.LeepMethod;

public class LeepYear04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String file = "src/com/biz/exam/윤년.txt";
		
		FileReader fr;
		BufferedReader buffer;
		
		LeepMethod lm = new LeepMethod();
		
		try {
			fr = new FileReader(file);
			buffer = new BufferedReader(fr);
			
			while(true) {
				String reader = buffer.readLine();
				if(reader == null) break;
				
				// split을 이용하는 방법
				String [] dates = reader.split(" ");
				int intYear = Integer.valueOf(dates[0]);
				
				// substring을 이용하는 방법
				String strYear = reader.substring(0, 4);
				intYear = Integer.valueOf(strYear.trim());
				
				if(lm.isLeepYear(intYear)) {
					System.out.println(reader+"은 윤년");
				}else{
					System.out.println(reader+"은 평년");
				}
			}
			
			buffer.close();
			fr.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
