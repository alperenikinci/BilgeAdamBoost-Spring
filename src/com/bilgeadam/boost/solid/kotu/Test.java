package com.bilgeadam.boost.solid.kotu;

public class Test {

	public static void main(String[] args) {

		DbLog dbLog = new DbLog();
		XmlLog xmlLog = new XmlLog();
		TextLog textLog = new TextLog();
		Logger logger = new Logger(dbLog, xmlLog, textLog);
		logger.LogYaz(LogType.Text, "303 nolu hata kodu : ");

	}

}
