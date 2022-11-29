package com.bilgeadam.boost.solid.kotu;

public class Logger {

	private DbLog dbLog;
	private XmlLog xmlLog;
	private TextLog textLog;
	
	public Logger(DbLog dbLog, XmlLog xmlLog, TextLog textLog) {
		this.dbLog	= dbLog;
		this.xmlLog = xmlLog;	
		this.textLog= textLog;
	}
	
	public void LogYaz(LogType type, String value) {
		
		switch(type) {
		case DB:
			dbLog.Log(value);
			break;
		case XML:
			xmlLog.Log(value);
			break;
		case Text:
			textLog.Log(value);
			break;
		}
		
	}
}
