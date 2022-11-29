package com.bilgeadam.boost.solid.iyi;

public class Test {
	
	public static void main(String[] args) {
		
		DbLog dbLog = new DbLog();
		Logger logger = new Logger(dbLog);
		logger.LogYaz("303 nolu hata kodu");
	}
}
