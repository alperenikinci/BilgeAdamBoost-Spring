package com.bilgeadam.boost.solid.iyi;

public class Logger {
	public ILog iLog;

	public Logger(ILog iLog) {
		this.iLog = iLog;
	}
	
	
	public void LogYaz(String value) {
		iLog.Log(value);
		
	}
	
}
