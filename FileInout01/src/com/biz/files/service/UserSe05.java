package com.biz.files.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UserSe05 {

	List<String> strList;
	String strFileName;
	
	public UserSe05(String strFileName) {
		strList = new ArrayList();
		this.strFileName = strFileName;
		
	}
	
	public void readFile() {

		FileReader fr;
		BufferedReader buffer;
		
		try {
			fr = new FileReader(strFileName);
			buffer = new BufferedReader(fr);
			
			while(true) {
				String reader = buffer.readLine();
				if(reader == null) break;
				
				String[] strNames = reader.split(":");
				strList.add(strNames[0]);
				
				
				
			}
			
			fr.close();
			buffer.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
				
	}
	
	
	
	
}
