package com.bilgeadam.boost.solid.iyi;

public class DbLog implements ILog {

	@Override
	public void Log(String value) {
		System.out.println(value + " db ye kaydedildi.");
	}

}
